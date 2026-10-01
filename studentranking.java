import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        
        if (s1.marks != s2.marks) {
            return s2.marks - s1.marks;
        }

        return s1.rollNo - s2.rollNo;
    }
}

public class studentranking {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Prince", 85));
        students.add(new Student(101, "Rahul", 95));
        students.add(new Student(104, "Aman", 85));
        students.add(new Student(102, "Kunal", 95));

        Collections.sort(students, new StudentComparator());

        
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
