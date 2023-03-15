package Question3;

public class Course {
     String name;
     MyArray students = new MyArray();
     MyArray profs = new MyArray();

     public Course(String name, MyArray profs) {
          this.name = name;
          this.profs = profs;
     }
     @Override
     public String toString(){
          return name+" "+students+" "+profs;
     }
}
