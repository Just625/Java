public class Student {
    private int id;
    private String name;
    private String dateOfBirth;
    private double mark;
    Student(int id, String name, String dateOfBirth, double mark){
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.mark = mark;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getMark() {
        return this.mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    public void display(){
        System.out.printf("%-2d %-15s %-15s %-3.2f\n", this.id, this.name, this.dateOfBirth, this.mark);
    }
}
