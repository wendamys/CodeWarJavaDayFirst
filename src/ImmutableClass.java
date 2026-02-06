import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}


public final class ImmutableClass {
    private final String name;
    private final int age;
    private final double money;
    private final List<Student> students;


    public ImmutableClass(String name, int age, double money, List<Student> students) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.students = deepCopy(students);
    }

    private List<Student> deepCopy(List<Student> original) {
        List<Student> copy = new ArrayList<>();
        for (Student s: original) {
            copy.add(new Student(s.getName(), s.getAge()));
        }
        return copy;
    }

    public List<Student> getStudents() {
        return deepCopy(students);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan" , 25));
        studentList.add(new Student("Tanya", 30));
        ImmutableClass Stepan = new ImmutableClass("Stepan", 25, 25600.30, studentList);
        System.out.println(Stepan.getName() + " " + Stepan.getAge() + " На счете " + Stepan.getMoney());

        System.out.println("Студенты:");
        for (Student s: Stepan.getStudents()) {
            System.out.println(" -" + s.getName());
        }
    }

 }




