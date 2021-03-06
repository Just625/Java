package com.codegym;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final String FILE_PATH = "C:\\Users\\Admin\\Desktop\\CodeGym\\Java\\Java\\Week5\\Test\\data\\contacts.csv";
    public static final String COMMA = ",";
    public static final String FILE_HEADER = "Số điện thoại, Nhóm, Họ tên, Giới tính, Địa chỉ, Ngày sinh, Email";
    public static final String WRONG_PHONE_FORMAT = "Wrong phone number format, please try again";

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        List<Person> personList = initPersonList();
        DanhBaManagement danhBaManagement = new DanhBaManagement(personList);
        int choice;
        do {
            showMenu();
            choice = src.nextInt();
            switch (choice) {
                case 1: {
                    danhBaManagement.display();
                    break;
                }
                case 2: {
                    addNewPerson(src, danhBaManagement);
                    break;
                }
                case 3: {
                    editPhoneNumber(src, danhBaManagement);
                    break;
                }
                case 4: {
                    deletePhoneNumber(src, danhBaManagement);
                    break;
                }
                case 5: {
                    closeSearchByName(src, danhBaManagement);
                    break;
                }
                case 6: {
                    danhBaManagement = readFromFile(src, danhBaManagement);
                    break;
                }
                case 7:{
                    writeToFile(danhBaManagement);
                    break;
                }
            }
        } while (choice != 8);
    }

    private static List<Person> initPersonList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("0971234567", "Codm", "Nguyễn Văn A", "Nam", "Mỹ Đình - Hà Nội", "1989-01-01", "vana@codegym.vn"));
        personList.add(new Person("0971234568", "Bn bè", "Nguyễn Thị B", "Nữ", "Thanh Xuân - Hà Nội", "1990-01-01", "vana@codegym.vn"));
        personList.add(new Person("0971234568", "Bn bè", "Nguyễn Thị B", "Nữ", "Thanh Xuân - Hà Nội", "1990-01-01", "vana@codegym.vn"));
        personList.add(new Person("0971234568", "Bn bè", "Nguyễn Thị B", "Nữ", "Thanh Xuân - Hà Nội", "1990-01-01", "vana@codegym.vn"));
        personList.add(new Person("0971234568", "Bn bè", "Nguyễn Thị B", "Nữ", "Thanh Xuân - Hà Nội", "1990-01-01", "vana@codegym.vn"));
        personList.add(new Person("0971234568", "Bn bè", "Nguyễn Thị B", "Nữ", "Thanh Xuân - Hà Nội", "1990-01-01", "vana@codegym.vn"));
        personList.add(new Person("0971234567", "Codm", "Nguyễn Văn A", "Nam", "Mỹ Đình - Hà Nội", "1989-01-01", "vana@codegym.vn"));
        personList.add(new Person("0971234568", "Bn bè", "Nguyễn Thị B", "Nữ", "Thanh Xuân - Hà Nội", "1990-01-01", "vana@codegym.vn"));
        personList.add(new Person("0971234568", "Bn bè", "Nguyễn Thị B", "Nữ", "Thanh Xuân - Hà Nội", "1990-01-01", "vana@codegym.vn"));
        personList.add(new Person("0971234568", "Bn bè", "Nguyễn Thị B", "Nữ", "Thanh Xuân - Hà Nội", "1990-01-01", "vana@codegym.vn"));
        personList.add(new Person("0971234568", "Bn bè", "Nguyễn Thị B", "Nữ", "Thanh Xuân - Hà Nội", "1990-01-01", "vana@codegym.vn"));
        personList.add(new Person("0971234568", "Bn bè", "Nguyễn Thị B", "Nữ", "Thanh Xuân - Hà Nội", "1990-01-01", "vana@codegym.vn"));
        return personList;
    }

    private static void writeToFile(DanhBaManagement danhBaManagement) {
        FileWriter fileWriter =null;
        try{
            fileWriter = new FileWriter(FILE_PATH);
            fileWriter.append(FILE_HEADER);
            fileWriter.append("\n");
            for(Person person: danhBaManagement.getDanhBaList()){
                fileWriter.append(person.getPhoneNumber());
                fileWriter.append(COMMA);
                fileWriter.append(person.getGroup());
                fileWriter.append(COMMA);
                fileWriter.append(person.getName());
                fileWriter.append(COMMA);
                fileWriter.append(person.getGender());
                fileWriter.append(COMMA);
                fileWriter.append(person.getAddress());
                fileWriter.append(COMMA);
                fileWriter.append(person.getdOB());
                fileWriter.append(COMMA);
                fileWriter.append(person.getEmail());
                fileWriter.append("\n");
            }
            System.out.println("Write to file completed");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static DanhBaManagement readFromFile(Scanner src, DanhBaManagement danhBaManagement) {
        List<Person> personList;
        src.nextLine();
        System.out.println("Do you want to erase all memory");
        System.out.println("Press Y to continue");
        String confirmWord = src.nextLine();
        if (confirmWord.equals("Y")) {
            personList = new ArrayList<>();
            List<String> list;
            BufferedReader br = null;
            try {
                String line;
                br = new BufferedReader(new FileReader(FILE_PATH));
                while ((line = br.readLine()) != null) {
                    list = parseCsvLine(line);
                    if (!list.get(0).contains("S")) {
                        Person person = new Person();
                        for (int i = 0; i < list.size(); i++) {
                            person.set(i, list.get(i));
                        }
                        personList.add(person);
                    }
                }
                danhBaManagement = new DanhBaManagement(personList);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (br != null)
                        br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return danhBaManagement;
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void closeSearchByName(Scanner src, DanhBaManagement danhBaManagement) {
        src.nextLine();
        String name = checkEmptyInput(src, "name to search:");
        danhBaManagement.findCloseExactName(name);
    }

    private static void deletePhoneNumber(Scanner src, DanhBaManagement danhBaManagement) {
        src.nextLine();
        String phoneNumber;
        boolean NotAvailable = true;
        do {
            System.out.println("Enter phone number to delete");
            phoneNumber = src.nextLine();
            Pattern pattern = Pattern.compile("^\\d{10}$");
            Matcher matcher = pattern.matcher(phoneNumber);
            if (matcher.find()) {
                NotAvailable = true;
                int index = danhBaManagement.findIndexByPhoneNumber(phoneNumber);
                if (index == -1) {
                    System.err.println("Can not find that phone number");
                } else {
                    System.out.println("Are you sure you want to delete?");
                    System.out.println("Press Y to continue");
                    String confirmWord = src.nextLine();
                    if (confirmWord.equals("Y")) {
                        danhBaManagement.delete(index);
                    }
                    phoneNumber = "";
                    NotAvailable = false;
                }
            } else if (!phoneNumber.isEmpty()) {
                System.err.println(WRONG_PHONE_FORMAT);
            } else {
                NotAvailable = false;
            }
        } while (!phoneNumber.isEmpty() || NotAvailable);
    }

    private static void editPhoneNumber(Scanner src, DanhBaManagement danhBaManagement) {
        src.nextLine();
        String phoneNumber;
        boolean NotAvailable = true;
        do {
            System.out.println("Enter phone number to edit");
            phoneNumber = src.nextLine();
            Pattern pattern = Pattern.compile("^\\d{10}$");
            Matcher matcher = pattern.matcher(phoneNumber);
            if (matcher.find()) {
                NotAvailable = true;
                int index = danhBaManagement.findIndexByPhoneNumber(phoneNumber);
                if (index == -1) {
                    System.err.println("Can not find phone number");
                } else {
                    String group = checkEmptyInput(src, "group: ");
                    String name = checkEmptyInput(src, "name: ");
                    String gender = checkEmptyInput(src, "gender: ");
                    String address = checkEmptyInput(src, "address: ");
                    String dOB = checkEmptyInput(src, "date of birth: ");
                    String email = checkValidEmail(src);
                    danhBaManagement.update(index, new Person(phoneNumber, group, name, gender, address, dOB, email));
                    NotAvailable = false;
                    phoneNumber = "";
                }
            } else if (!phoneNumber.isEmpty()) {
                System.err.println(WRONG_PHONE_FORMAT);
            } else {
                NotAvailable = false;
            }
        } while (!phoneNumber.isEmpty() || NotAvailable);
    }

    private static void addNewPerson(Scanner src, DanhBaManagement danhBaManagement) {
        src.nextLine();
        String phoneNumber;
        boolean isNotValidPhoneNumber = true;
        do {
            System.out.println("Enter phone number:");
            phoneNumber = src.nextLine();
            Pattern pattern = Pattern.compile("^\\d{10}$");
            Matcher matcher = pattern.matcher(phoneNumber);
            if (matcher.find()) {
                isNotValidPhoneNumber = false;
            } else {
                System.err.println(WRONG_PHONE_FORMAT);
            }
        } while (isNotValidPhoneNumber);
        String group = checkEmptyInput(src, "group:");
        String name = checkEmptyInput(src, "name:");
        String gender = checkEmptyInput(src, "gender:");
        String address = checkEmptyInput(src, "address:");
        String dOB = checkEmptyInput(src, "date of birth:");
        String email;
        email = checkValidEmail(src);
        danhBaManagement.add(new Person(phoneNumber, group, name, gender, address, dOB, email));
    }

    private static String checkValidEmail(Scanner src) {
        String email;
        boolean isNotValidEmail = true;
        do {
            System.out.println("Enter email:");
            email = src.nextLine();
            Pattern pattern = Pattern.compile("^\\w+@\\w+.vn$");
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                isNotValidEmail = false;
            } else {
                System.err.println("Wrong email format");
            }
        } while (isNotValidEmail);
        return email;
    }

    private static String checkEmptyInput(Scanner src, String msg) {
        String subject;
        do {
            System.out.println("Enter " + msg);
            subject = src.nextLine();
            if (subject.isEmpty()) {
                System.err.println(msg + "can not be empty. Please try again");
            }
        } while (subject.isEmpty());
        return subject;
    }

    private static void showMenu() {
        System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ----");
        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng:");
    }
}
