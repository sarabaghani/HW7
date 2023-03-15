package Question3;

public class Professor {
    String name;
    MyArray courses = new MyArray();

    public Professor(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name+" "+courses;
    }
}
