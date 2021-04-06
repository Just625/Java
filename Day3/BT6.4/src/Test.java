import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] id = {5, 2, 3};
        String[] name = {"Nguyễn Văn A", "Nguyễn Văn B", "Nguyễn Văn C"};
        String[] bDay = {"2/2/2002", "3/3/2003", "4/4/2004"};
        double[] mark = {8.5, 6.5, 9.9};
        Scanner src = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hiển thị danh sách sinh viên");
        System.out.println("2. Thêm một sinh viên mới ");
        System.out.println("3. Chỉnh sửa thông tin của một sinh viên khi biết mã sinh viên ");
        System.out.println("4. Xóa một sinh viên khỏi danh sách khi biết mã sinh viên ");
        System.out.println("5. Tìm sinh viên có điểm cao nhất ");
        System.out.println("6. Sắp xếp danh sách sinh viên theo điểm từ cao xuống thấp ");
        System.out.println("0. Thoát chương trình");
        System.out.println("Enter your choice:");
        int choice = src.nextInt();
        switch (choice) {
            case 0: {
                System.exit(0);
                break;
            }
            case 1: {
                showArray(id, name, bDay, mark);
                break;
            }
            case 2: {
                addEle(id, name, bDay, mark);
//                id = new int[newId.length];
//                name = new String[newId.length];
//                bDay = new String[newId.length];
//                mark = new double[newId.length];
//                for (int j = 0; j < newId.length; j++) {
//                    id[j] = newId[j];
//                    name[j] = newName[j];
//                    bDay[j] = newBDay[j];
//                    mark[j] = newMark[j];
//                }
//                showArray(id, name, bDay, mark);
                break;
            }
            case 3: {
                System.out.println("Nhập vào mã sinh viên muốn chỉnh sửa:");
                int idChange = src.nextInt();
                System.out.println("Chọn thông tin mà bạn muốn chỉnh sửa:");
                System.out.println("1. Tên sinh viên");
                System.out.println("2. Ngày sinh");
                System.out.println("3. Điểm thi");
                System.out.println("Nhập lựa chọn:");
                int userChoice = src.nextInt();
                editEle(id, name, bDay, mark, idChange, userChoice);
                break;
            }
            case 4: {
                deleteEle(id, name, bDay, mark);
                break;
            }
            case 5: {
                getMax(id, name, bDay, mark);
                break;
            }
            case 6: {
                sapXepGiamDan(id, name, bDay, mark);
                showArray(id, name, bDay, mark);
                break;
            }
            default: {
                System.out.println("Invalid choice");
            }
        }
    }

    static void showArray(int[] id, String[] name, String[] bDay, double[] mark) {
        System.out.printf("%-2s %-15s %-15s %-2s", "ID", "Name", "Date of birth", "Mark");
        for (int i = 0; i < id.length; i++) {
            System.out.printf("\n%-2d %-15s %-15s %-2.1f", id[i], name[i], bDay[i], mark[i]);
        }
    }

    static void addEle(int[] id, String[] name, String[] bDay, double[] mark) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập vào id sv mới:");
        int newestID = src.nextInt();
        src.nextLine();
        System.out.println("Nhập vào tên sv mới:");
        String newestName = src.nextLine();
        System.out.println("Nhập vào ngày, tháng, năm sinh:");
        String newestBDay = src.nextLine();
        System.out.println("Nhập vào điểm của sv mới:");
        double newestMark = src.nextDouble();
        int[] newId = new int[id.length + 1];
        String[] newName = new String[id.length + 1];
        String[] newBDay = new String[id.length + 1];
        double[] newMark = new double[id.length + 1];
        for (int i = 0; i < id.length; i++) {
            newId[i] = id[i];
            newName[i] = name[i];
            newBDay[i] = bDay[i];
            newMark[i] = mark[i];
        }
        newId[id.length] = newestID;
        newName[id.length] = newestName;
        newBDay[id.length] = newestBDay;
        newMark[id.length] = newestMark;
        showArray(newId, newName, newBDay, newMark);
    }

    static void editEle(int[] id, String[] name, String[] bDay, double[] mark, int idChange, int userChoice) {
        for (int i = 0; i < id.length; i++) {
            if (id[i] == idChange) {
                idChange = i;
            }
        }
        Scanner src = new Scanner(System.in);
        switch (userChoice) {
            case 1: {
                System.out.println("Nhập vào tên bạn muốn thay đổi:");
                String newName = src.nextLine();
                name[idChange] = newName;
                break;
            }
            case 2: {
                System.out.println("Nhập vào ngày sinh bạn muốn đổi:");
                String newBDay = src.nextLine();
                bDay[idChange] = newBDay;
                break;
            }
            case 3: {
                System.out.println("Nhập vào điểm bạn muốn thay đổi:");
                double newMark = src.nextDouble();
                mark[idChange] = newMark;
                break;
            }
        }
        showArray(id, name, bDay, mark);
    }

    static void deleteEle(int[] id, String[] name, String[] bDay, double[] mark) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên bạn muốn xóa");
        int index = src.nextInt();
        for (int i = 0; i < id.length; i++) {
            if (id[i] == index) {
                index = i;
            }
        }
        int[] newId = new int[id.length - 1];
        String[] newBDay = new String[id.length - 1];
        String[] newName = new String[id.length - 1];
        double[] newMark = new double[id.length - 1];
        for (int i = 0; i < index; i++) {
            newId[i] = id[i];
            newName[i] = name[i];
            newBDay[i] = bDay[i];
            newMark[i] = mark[i];
        }
        for (int i = index; i < id.length - 1; i++) {
            newId[i] = id[i + 1];
            newName[i] = name[i + 1];
            newBDay[i] = bDay[i + 1];
            newMark[i] = mark[i + 1];
        }
        showArray(newId, newName, newBDay, newMark);
    }

    static void getMax(int[] id, String[] name, String[] bDay, double[] mark) {
        int index = 0;
        double max = mark[0];
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] > max) {
                max = mark[i];
                index = i;
            }
        }
        System.out.printf("%-2s %-15s %-15s %-2s", "ID", "Name", "Date of birth", "Mark");
        System.out.printf("\n%-2d %-15s %-15s %-2.1f", id[index], name[index], bDay[index], mark[index]);
    }

    static void sapXepGiamDan(int[] id, String[] name, String[] bDay, double[] mark) {
        for (int i = 0; i < mark.length - 1; i++) {
            for (int j = i + 1; j < mark.length; j++) {
                if (mark[j] > mark[i]) {
                    int middleID = id[i];
                    id[i] = id[j];
                    id[j] = middleID;
                    String middleName = name[i];
                    name[i] = name[j];
                    name[j] = middleName;
                    String middleBDay = bDay[i];
                    bDay[i] = bDay[j];
                    bDay[j] = middleBDay;
                    double temp = mark[i];
                    mark[i] = mark[j];
                    mark[j] = temp;
                }
            }
        }
    }
}
