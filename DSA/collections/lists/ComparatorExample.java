package DSA.collections.lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

 class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ComparatorExample {
    
    public static void main(String[] args) {
        // Comparator example code would go here
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        numbers.sort((o1, o2) -> {
            return o1 - o2;
        });
        System.out.println("Sorted numbers: " + numbers);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22)); 
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 23)); 
        students.add(new Student("James", 22));
        Comparator<Student> studeComparator = Comparator.comparingInt(Student::getAge)
                .thenComparing(Student::getName);
        students.sort((s1, s2) -> {
            return s1.getAge() - s2.getAge();
        });
        System.out.println("Students sorted by age:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }

}
