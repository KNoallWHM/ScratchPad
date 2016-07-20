package week1.day1.people;

/**
 * Created by katiebunnell on 7/11/16.
 */
public class School {



    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("Phill");
        t.setAge(99);
        t.setSalary(420.00);
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getGender());
        System.out.println(t.getSalary());

        Teacher t2 = new Teacher();
        t2.setName("Jenny");
        t2.setAge(22);
        t2.setGender("Female");
        t2.setSalary(49000.90);
        System.out.println(t2.getName());
        System.out.println(t2.getAge());
        System.out.println(t2.getGender());
        System.out.println(t2.getSalary());

        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());

//        Parent p = new Parent() ;
//        System.out.println(p.getHasStudent());

        Parent.getHasStudent();


    }
}
