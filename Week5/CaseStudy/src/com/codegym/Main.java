package com.codegym;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        List<OfficeStaff> ofList = initOFList();
        OfficeStaffManagement oFManagement = new OfficeStaffManagement(ofList);
        List<NonOfficeStaff> nOFList = initNonOFList();
        NonOfficeStaffManagement nonOFManagement = new NonOfficeStaffManagement(nOFList);
        AccountManagement accountManagement = initAccountManagement();
        String taskList = "";
        List<String> taskListString = new ArrayList<>();

        int loginChoice;
        boolean isNotSignedIn = true;
        do {
            showLoginMenu();
            System.out.println("Enter your choice:");
            loginChoice = src.nextInt();
            switch (loginChoice) {
                case 1: {
                    src.nextLine();
                    System.out.println("Enter user name");
                    String userName = src.nextLine();
                    System.out.println("Enter pass word");
                    String passWord = src.nextLine();
                    String roleById = accountManagement.getRoleById(userName, passWord);
                    if (roleById.equals("admin")) {
                        isNotSignedIn = false;
                        int choice;
                        do {
                            showAdminMenu();
                            System.out.println("Enter your choice:");
                            choice = src.nextInt();
                            switch (choice) {
                                case 1: {
                                    int officeChoice;
                                    do {
                                        showOfficeStaffMenu();
                                        System.out.println("Enter your choice:");
                                        officeChoice = src.nextInt();
                                        if (officeChoice < 0 || officeChoice > 11) {
                                            System.err.println("Invalid choice");
                                        }
                                        switch (officeChoice) {
                                            case 1: {
                                                oFManagement.showAll();
                                                break;
                                            }
                                            case 2: {
                                                createNewOfficeStaff(src, oFManagement);
                                                break;
                                            }
                                            case 3: {
                                                updateOfficeStaffInfo(src, oFManagement);
                                                break;
                                            }
                                            case 4: {
                                                deleteOfficeStaff(src, oFManagement);
                                                break;
                                            }
                                            case 5: {
                                                oFManagement.calculateSalary();
                                                break;
                                            }
                                            case 6: {
                                                oFManagement.showFrequency();
                                                break;
                                            }
                                            case 7: {
                                                System.out.println(oFManagement.showMVPOfficeStaff());
                                                break;
                                            }
                                            case 8: {
                                                src.nextLine();
                                                System.out.println("enter file path:");
                                                String filePath = src.nextLine();
                                                oFManagement.writeToFile(filePath);
                                                break;
                                            }
                                            case 9: {
                                                src.nextLine();
                                                System.out.println("enter file path:");
                                                String filePath = src.nextLine();
                                                oFManagement.readFromFile(filePath);
                                                break;
                                            }
                                            case 10: {
                                                try {
                                                    taskList = crawlTaskFromWebsite();
                                                    System.out.println("Task list updated");
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                }
                                                writeTaskToFile(taskList);
                                                break;
                                            }
                                            case 11: {
                                                readTaskFromFile(taskListString);
                                                break;
                                            }
                                        }
                                    } while (officeChoice != 0);
                                    break;
                                }
                                case 2: {
                                    int nonOfficeChoice;
                                    do {
                                        showNonOfficeStaffMenu();
                                        System.out.println("Enter your choice:");
                                        nonOfficeChoice = src.nextInt();
                                        if (nonOfficeChoice < 0 || nonOfficeChoice > 5) {
                                            System.out.println("Invalid choice");
                                        }
                                        switch (nonOfficeChoice) {
                                            case 1: {
                                                nonOFManagement.showAll();
                                                break;
                                            }
                                            case 2: {
                                                createNewNonOfficeStaff(src, nonOFManagement);
                                                break;
                                            }
                                            case 3: {
                                                updateNonOfficeStaffInfo(src, nonOFManagement);
                                                break;
                                            }
                                            case 4: {
                                                deleteNonOfficeStaff(src, nonOFManagement);
                                                break;
                                            }
                                        }
                                    } while (nonOfficeChoice != 0);
                                    break;
                                }
                            }
                        } while (choice != 0);
                    } else if (roleById.equals("employee")) {
                        int index = accountManagement.checkAccountInList(userName, passWord);
                        String id = accountManagement.getIdByIndex(index);
                        int currentEmployeeIndex = oFManagement.getIndexById(id);
                        isNotSignedIn = false;
                        int employeeChoice;
                        do {
                            showStaffMenu();
                            System.out.println("Enter your choice");
                            employeeChoice = src.nextInt();
                            OfficeStaff currentEmployee = oFManagement.getOfficeStaffByIndex(currentEmployeeIndex);
                            switch (employeeChoice) {
                                case 1: {
                                    System.out.println(currentEmployee);
                                    break;
                                }
                                case 2: {
                                    editPersonalInformation(src, oFManagement, currentEmployeeIndex);
                                    break;
                                }
                                case 3: {
                                    attendDaily(oFManagement, currentEmployeeIndex);
                                    break;
                                }
                                case 4: {
                                    pickTaskToDo(src, taskListString, currentEmployee);
                                    break;
                                }
                                case 5: {
                                    System.out.println("Number of task done: " + currentEmployee.getNumberOfTaskDone());
                                    break;
                                }
                                case 6: {
                                    System.out.println("Your salary is: " + currentEmployee.calculateFinalSalary());
                                    break;
                                }
                            }
                        } while (employeeChoice != 0);
                    } else {
                        System.out.println(roleById);
                    }
                    break;
                }
                case 2: {
                    createNewAccount(src, accountManagement);
                    break;
                }
                case 3: {
                    accountManagement.showAll();
                }
            }
        } while (loginChoice != 0 || isNotSignedIn);
    }

    private static void pickTaskToDo(Scanner src, List<String> taskListString, OfficeStaff currentEmployee) {
        if (taskListString.size() == 0) {
            System.out.println("No task available");
        } else {
            System.out.println("Pick a task from the list to do");
            showTaskListString(taskListString);
            System.out.println("Enter your choice:");
            int taskChoice = src.nextInt();
            currentEmployee.work(taskListString.get(taskChoice));
            taskListString.remove(taskChoice);
            StringBuilder newTaskList = new StringBuilder();
            for (String s : taskListString) {
                newTaskList.append(s).append(", ");
            }
            writeTaskToFile(newTaskList.toString());
        }
    }

    private static void writeTaskToFile(String taskList) {
        try {
            FileWriter writer = new FileWriter("data\\task_list.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(taskList);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readTaskFromFile(List<String> taskListString) {
        try {
            File file = new File("data\\task_list.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] subString = line.split(",");
                taskListString.addAll(Arrays.asList(subString));
            }
            bufferedReader.close();
            showTaskListString(taskListString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showTaskListString(List<String> taskListString) {
        for (String task : taskListString) {
            System.out.println(task);
        }
    }

    private static String crawlTaskFromWebsite() throws IOException {
        System.out.println("Please wait a moment for data to load");
        System.out.println("Loading data.....");
        URLConnection url = new URL("https://kingrayhan.medium.com/500-data-structures-and-algorithms-practice-problems-and-their-solutions-b45a83d803f0").openConnection();
        url.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (HTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        url.connect();
        Scanner scanner = new Scanner(new InputStreamReader(url.getInputStream(), StandardCharsets.UTF_8));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        scanner.close();
        content = content.replaceAll("\\n+", "");
        StringBuilder taskList = new StringBuilder();
        Pattern pattern = Pattern.compile("ds jk\" rel=\"noopener nofollow\">(.*?)</a>");
        Matcher matcher = pattern.matcher(content);
        int count = 0;
        while (matcher.find() && count <= 15) {
            taskList.append("Task ").append(count).append(": ").append(matcher.group(1)).append(",");
            count++;
        }
        return taskList.toString();
    }

    private static void attendDaily(OfficeStaffManagement oFManagement, int currentEmployeeIndex) {
        oFManagement.getOfficeStaffByIndex(currentEmployeeIndex).attend();
        System.out.println("Done");
    }

    private static void editPersonalInformation(Scanner src, OfficeStaffManagement oFManagement, int currentEmployeeIndex) {
        src.nextLine();
        System.out.println("Enter name");
        String name = src.nextLine();
        System.out.println("Enter age");
        int age = src.nextInt();
        src.nextLine();
        System.out.println("Enter address");
        String address = src.nextLine();
        oFManagement.editPersonalInformation(name, age, address, currentEmployeeIndex);
    }

    private static AccountManagement initAccountManagement() {
        return new AccountManagement(readAccountFromFile());
    }

    private static void writeAccountToFile(List<Account> accountList) {
        try {
            OutputStream os = new FileOutputStream("data\\accounts.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(accountList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Account> readAccountFromFile() {
        List<Account> accountList = null;
        try {
            InputStream is = new FileInputStream("data\\accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
            accountList = (List<Account>) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return accountList;
    }


    private static void createNewAccount(Scanner src, AccountManagement accountManagement) {
        src.nextLine();
        boolean validUserName = false;
        String userName;
        do {
            System.out.println("Enter user name (must be at least 5 characters)");
            userName = src.nextLine();
            Pattern pattern = Pattern.compile(".{5,}");
            Matcher matcher = pattern.matcher(userName);
            if (matcher.matches()) {
                validUserName = true;
            } else {
                System.err.println("Invalid username. Please try again");
            }
        } while (!validUserName);
        boolean validPassWord = false;
        String passWord;
        do {
            System.out.println("Enter pass word (start with a capital letter)");
            passWord = src.nextLine();
            Pattern pattern = Pattern.compile("\\w.*");
            Matcher matcher = pattern.matcher(userName);
            if (matcher.matches()) {
                validPassWord = true;
            } else {
                System.err.println("Invalid password. Please try again");
            }
        } while (!validPassWord);
        System.out.println("Enter ID");
        String id = src.nextLine();
        Account newAccount = new Account(userName, passWord, id, "employee");
        if (accountManagement.checkDuplicate(newAccount)) {
            System.out.println("Account already available");
        } else {
            accountManagement.addAccount(newAccount);
            System.out.println("Account created");
            writeAccountToFile(accountManagement.getAccountList());
        }
    }

    private static void deleteOfficeStaff(Scanner src, OfficeStaffManagement officeStaffManagement) {
        src.nextLine();
        System.out.println("Enter office staff's id you want to delete");
        String id = src.nextLine();
        int index = officeStaffManagement.getIndexById(id);
        if (index == -1) {
            System.out.println("Invalid id");
        } else {
            officeStaffManagement.remove(index);
            System.out.println("Delete completed");
        }
    }

    private static void deleteNonOfficeStaff(Scanner src, NonOfficeStaffManagement nonOfficeStaffManagement) {
        src.nextLine();
        System.out.println("Enter office staff's id you want to delete");
        String id = src.nextLine();
        int index = nonOfficeStaffManagement.getIndexById(id);
        if (index == -1) {
            System.out.println("Invalid id");
        } else {
            nonOfficeStaffManagement.remove(index);
            System.out.println("Delete completed");
        }
    }

    private static List<NonOfficeStaff> initNonOFList() {
        List<NonOfficeStaff> list = new ArrayList<>();
        list.add(new Security("1", "Dazzle", "employee", 20, "Radiant", 6000000));
        list.add(new Cleaner("2", "Lion", "employee", 25, "Dire", 5500000));
        list.add(new Security("3", "Witch Doctor", "employee", 24, "Dire", 5500000));
        return list;
    }

    private static List<OfficeStaff> initOFList() {
        List<OfficeStaff> list = new ArrayList<>();
        list.add(new Developer("employee1", "Tinker", "employee", 27, "Radiant", 10000000));
        list.get(0).setWorkDaysInMonth(8);
        list.add(new Tester("employee2", "Axe", "employee", 27, "Dire", 8000000));
        list.get(0).setWorkDaysInMonth(7);
        list.add(new Sales("employee3", "Invoker", "employee", 27, "Radiant", 9000000));
        list.get(0).setWorkDaysInMonth(5);
        return list;
    }

    private static void updateOfficeStaffInfo(Scanner src, OfficeStaffManagement officeStaffManagement) {
        src.nextLine();
        System.out.println("Enter id");
        String id = src.nextLine();
        int index = officeStaffManagement.getIndexById(id);
        if (index == -1) {
            System.out.println("Can't find office staff with this id" + id);
        } else {
            System.out.println("Enter new info");
            OfficeStaff newOfficeStaff = getOfficeStaffInfo(src);
            officeStaffManagement.update(index, newOfficeStaff);
            System.out.println("Update completed");
        }
    }

    private static void updateNonOfficeStaffInfo(Scanner src, NonOfficeStaffManagement nonOfficeStaffManagement) {
        src.nextLine();
        System.out.println("Enter id");
        String id = src.nextLine();
        int index = nonOfficeStaffManagement.getIndexById(id);
        if (index == -1) {
            System.out.println("Can't find office staff with this id" + id);
        } else {
            System.out.println("Enter new info");
            NonOfficeStaff newNonOfficeStaff = getNonOfficeStaffInfo(src);
            nonOfficeStaffManagement.update(index, newNonOfficeStaff);
            System.out.println("Update completed");
        }
    }

    private static void createNewOfficeStaff(Scanner src, OfficeStaffManagement officeStaffManagement) {
        src.nextLine();
        OfficeStaff newOfficeStaff = getOfficeStaffInfo(src);
        officeStaffManagement.create(newOfficeStaff);
        System.out.println("Add completed");
    }

    private static void createNewNonOfficeStaff(Scanner src, NonOfficeStaffManagement nonOfficeStaffManagement) {
        src.nextLine();
        NonOfficeStaff newNonOfficeStaff = getNonOfficeStaffInfo(src);
        nonOfficeStaffManagement.create(newNonOfficeStaff);
        System.out.println("Add completed");
    }

    private static OfficeStaff getOfficeStaffInfo(Scanner src) {
        System.out.println("Enter id");
        String id = src.nextLine();
        System.out.println("Enter name");
        String name = src.nextLine();
        String role = "employee";
        System.out.println("Enter age");
        int age = src.nextInt();
        src.nextLine();
        System.out.println("Enter address");
        String address = src.nextLine();
        System.out.println("Enter type of office staff(Developer, Tester, Sales)");
        String officeStaffType = src.nextLine();
        System.out.println("Enter hard salary");
        int hardSalary = src.nextInt();
        return OfficeStaffFactory.getOfficerType(officeStaffType, id, name, role, age, address, hardSalary);
    }

    private static NonOfficeStaff getNonOfficeStaffInfo(Scanner src) {
        System.out.println("Enter id");
        String id = src.nextLine();
        System.out.println("Enter name");
        String name = src.nextLine();
        String role = "employee";
        System.out.println("Enter age");
        int age = src.nextInt();
        src.nextLine();
        System.out.println("Enter address");
        String address = src.nextLine();
        System.out.println("Enter type of non office staff(Security, Cleaner)");
        String nonOfficeStaffType = src.nextLine();
        System.out.println("Enter hard salary");
        int hardSalary = src.nextInt();
        return NonOfficeStaffFactory.getNonOfficeStaffType(nonOfficeStaffType, id, name, role, age, address, hardSalary);
    }

    private static void showOfficeStaffMenu() {
        System.out.println("OFFICE STAFF MENU");
        System.out.println("1. Show all office staff");
        System.out.println("2. Add a office staff");
        System.out.println("3. Edit a office staff by id");
        System.out.println("4. Delete a office staff");
        System.out.println("5. Calculate total salary");
        System.out.println("6. Number of office staff according to staff type ");
        System.out.println("7. Show the office staff of the month ");
        System.out.println("8. Write to file");
        System.out.println("9. Read from file");
        System.out.println("10. Create task list");
        System.out.println("11. Show task list available");
        System.out.println("0. Go back");
    }

    private static void showNonOfficeStaffMenu() {
        System.out.println("NON-OFFICE STAFF MENU");
        System.out.println("1. Show all non-office staff");
        System.out.println("2. Add a non-office staff");
        System.out.println("3. Edit a non-office staff by id");
        System.out.println("4. Delete a non-office staff");
        System.out.println("0. Go back");
    }

    private static void showAdminMenu() {
        System.out.println("MAIN MENU");
        System.out.println("1. Open office staff menu");
        System.out.println("2. Open non-office staff menu");
        System.out.println("0. Go back");
    }

    private static void showLoginMenu() {
        System.out.println("LOGIN MENU");
        System.out.println("1. Sign in");
        System.out.println("2. Sign up");
        System.out.println("0. Exit");
    }

    private static void showStaffMenu() {
        System.out.println("STAFF MENU");
        System.out.println("1. Show personal information ");
        System.out.println("2. Edit personal information ");
        System.out.println("3. Daily attendance");
        System.out.println("4. Pick a task");
        System.out.println("5. Show completed task");
        System.out.println("6. Calculate salary");
        System.out.println("0. Go back");
    }
}
