package Question3;

public class UniversityApplication {
    public static void main(String[] args) {
        Student reza = new Student("Reza Mohammadi", 5,"Mechanics");
        reza.courses.add("Maths1");
        reza.courses.add("Physics2");
        Professor yarahmadi = new Professor("yarahmadi");
        yarahmadi.courses.add("Maths1");
        yarahmadi.courses.add("Maths2");
        MyArray maths1Profs = new MyArray();
        maths1Profs.add("yarahmadi");
        MyArray maths2Profs = new MyArray();
        maths2Profs.add("yarahmadi");
        Course maths1 = new Course("Maths1",maths1Profs);
        Course maths2 = new Course("Maths2",maths2Profs);
        Student hajipour = new Student("Niloufar Hajipour");
        Student ahmadi = new Student("Hooman Ahmadi");
        maths1.students.add(hajipour);
        maths1.students.add(ahmadi);
        System.out.println(reza);
        System.out.println(yarahmadi);
        System.out.println(yarahmadi.courses);
        System.out.println(reza.courses);

    }
}
