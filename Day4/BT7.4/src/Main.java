import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Student student0 = new Student(0, "Nguyen Van A", "1/1/2001", 8.5);
        Student student1 = new Student(12, "Nguyen Van B", "2/2/2002", 10);
        Student student2 = new Student(2, "Nguyen Van C", "3/3/2003", 9.5);
        Student student3 = new Student(32, "Nguyen Van D", "4/4/2004", 5.5);
        Student[] allStudent = {student0, student1, student2, student3};
        int choice;
            System.out.println("Menu");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm một sinh viên mới");
            System.out.println("3. Chỉnh sửa thông tin của một sinh viên khi biết mã sinh viên");
            System.out.println("4. Xóa một sinh viên khỏi danh sách khi biết mã sinh viên");
            System.out.println("5. Tìm sinh viên có điểm cao nhất");
            System.out.println("6. Sắp xếp danh sách sinh viên theo điểm từ cao xuống thấp");
            System.out.println("0. Thoát chương trình");
        do {
            System.out.println("Enter your choice: ");
            choice = src.nextInt();
            switch (choice){
                case 1:{
                    showAll(allStudent);
                    break;
                }
                case 2:{
                    System.out.println("Enter new student id:");
                    int newID = src.nextInt();
                    src.nextLine();
                    System.out.println("Enter name:");
                    String newName = src.nextLine();
                    System.out.println("Enter date of birth:");
                    String newDateOfBirth = src.nextLine();
                    System.out.println("Enter mark:");
                    double newMark = src.nextDouble();
                    Student newStudent = new Student(newID,newName,newDateOfBirth,newMark);
                    Student[] newAllStudent = new Student[allStudent.length+1];
                    for(int i = 0; i < allStudent.length;i++){
                        newAllStudent[i] = allStudent[i];
                    }
                    newAllStudent[newAllStudent.length-1] = newStudent;
                    System.out.println();
                    allStudent = new Student[newAllStudent.length];
                    for(int i = 0;i<allStudent.length;i++){
                        allStudent[i] = newAllStudent[i];
                    }
                    System.out.println("Danh sach sinh vien sau khi them:");
                    showAll(allStudent);
                    break;
                }
                case 3:{
                    System.out.println("Nhap ma sinh vien muon chinh sua:");
                    int index = src.nextInt();
                    System.out.println("1. Change name:");
                    System.out.println("2. Change date of birth:");
                    System.out.println("3. Change mark:");
                    System.out.println("Enter your choice:");
                    int userChoice = src.nextInt();
                    changeElement(allStudent, index, userChoice);
                    System.out.println("Danh sach sinh vien sau khi chinh sua:");
                    showAll(allStudent);
                    break;
                }
                case 4:{
                    System.out.println("Nhap ma sinh vien muon xoa:");
                    int index = src.nextInt();
                    Student[] newAllStudent = new Student[allStudent.length-1];
                    for(int i = 0;i <allStudent.length;i++){
                        if(allStudent[i].getId()==index){
                            index = i;
                        }
                    }
                    for(int j = 0; j<index;j++){
                        newAllStudent[j] = allStudent[j];
                    }
                    for(int k=index;k<allStudent.length-1;k++){
                        newAllStudent[k] = allStudent[k+1];
                    }

                    allStudent = new Student[newAllStudent.length];
                    for(int l = 0; l<allStudent.length;l++){
                        allStudent[l] = new Student(newAllStudent[l].getId(),newAllStudent[l].getName(),newAllStudent[l].getDateOfBirth(),newAllStudent[l].getMark());
                    }
                    System.out.println("Danh sach sinh vien sau khi xoa:");
                    showAll(allStudent);
                    break;
                }
                case 5:{
                    findMaxMark(allStudent);
                    break;
                }
                case 6:{
                    sapXep(allStudent);
                    System.out.println("Danh sach sau khi sap xep:");
                    showAll(allStudent);
                    break;
                }
                case 0:{
                    System.out.println("Cam on da sd!!");
                    System.exit(0);
                }
                default:{
                    System.out.println("Invalid choice");
                }
            }
        } while (choice != 0);
    }

    static void showAll(Student[] allStudent) {
        System.out.printf("%-2s %-15s %-15s %-3s\n", "ID", "Name", "Date of Birth", "Mark");
        for (int i = 0; i<allStudent.length;i++) {
            allStudent[i].display();
        }
    }
    static void changeElement(Student[] allStudent, int index, int userChoice){
        Scanner src = new Scanner(System.in);
        for(int i = 0; i< allStudent.length;i++){
            if(index == allStudent[i].getId()){
                switch (userChoice){
                    case 1:{
                        System.out.println("Enter edit name:");
                        String newName = src.nextLine();
                        allStudent[i].setName(newName);
                        break;
                    }
                    case 2:{
                        System.out.println("Enter edit date of birth:");
                        String newDateOfBirth = src.nextLine();
                        allStudent[i].setDateOfBirth(newDateOfBirth);
                        break;
                    }
                    case 3:{
                        System.out.println("Enter edit mark:");
                        double newMark = src.nextDouble();
                        allStudent[i].setMark(newMark);
                        break;
                    }
                    default:{
                        System.out.println("Invalid choice");
                        break;
                    }
                }
            }
        }
    }
    static void findMaxMark(Student[] allStudent){
        double maxMark = allStudent[0].getMark();
        int index = 0;
        for(int i = 0; i<allStudent.length;i++){
            if(allStudent[i].getMark()>maxMark){
                maxMark = allStudent[i].getMark();
                index = i;
            }
        }
        System.out.println("Sinh vien co diem cao nhat la:");
        System.out.printf("%-2s %-15s %-15s %-3s\n", "ID", "Name", "Date of Birth", "Mark");
        allStudent[index].display();
    }
    static void sapXep(Student[] allStudent){
        for(int i = 0; i<allStudent.length-1;i++){
            for(int j = i+1; j<allStudent.length;j++){
                if(allStudent[i].getMark()<allStudent[j].getMark()){
                    int middleId = allStudent[i].getId();
                    allStudent[i].setId(allStudent[j].getId());
                    allStudent[j].setId(middleId);
                    String middleName = allStudent[i].getName();
                    allStudent[i].setName(allStudent[j].getName());
                    allStudent[j].setName(middleName);
                    String middleDateOfBirth = allStudent[i].getDateOfBirth();
                    allStudent[i].setDateOfBirth(allStudent[j].getDateOfBirth());
                    allStudent[j].setDateOfBirth(middleDateOfBirth);
                    double middleMark = allStudent[i].getMark();
                    allStudent[i].setMark(allStudent[j].getMark());
                    allStudent[j].setMark(middleMark);
                }
            }
        }
    }
}
