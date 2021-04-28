package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread thread1 = new Thread(new NumberGenerator("1st"));
        Thread thread2 = new Thread(new NumberGenerator("2nd"));
        //Trong hầu hết các trường hợp, lịch trình của thread được sắp xếp theo thứ tự ưu tiên của chúng (được gọi là lập kế hoạch ưu tiên).
        // Nhưng nó không được bảo đảm bởi vì nó phụ thuộc vào thông số kỹ thuật của JVM
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
