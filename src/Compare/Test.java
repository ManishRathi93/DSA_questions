package Compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


class Student{
    int age;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age,String name) {
        this.name = name;
        this.age = age;
    }
}

public class Test {
    public static void main(String[] args) {

//        Comparator<Student> comp = (o1, o2) -> {
//            if (o1.age  > o2.age) {
//                return 1;
//            }
//            if (o1.age < o2.age){
//                return -1;
//            }
//            return 0;
//        };

        Comparator<Student> comp = Comparator.comparing((Student s) -> s.name).reversed();

        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Manish"));
        list.add(new Student(14,"Rahul"));
        list.add(new Student(3,"Nikhil"));
        list.add(new Student(9,"Mohit"));


//        Collections.sort(list,comp);
        list.sort(comp);
//        for(Student stu : list){
//            System.out.println(stu);
//        }

        Consumer<Student> con = (s) -> System.out.println(s);
    }
}
