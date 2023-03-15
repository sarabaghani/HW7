package Question3;

public class Student {
    String name;
    int term;
    String major;
    MyArray courses = new MyArray();
    public Student(String name, int term, String major) {
        this.name = name;
        this.term = term;
        this.major = major;
    }

    public Student(String name) {
        this.name = name;
    }
@Override
    public String toString(){
        return name+" "+term+" "+major+" "+courses;
}

}
