package java8to17featureexample;

public class RecordRunner {
    record Person(String name, int age) {
    }

    public static void main(String[] args) {
        Person p = new Person("tomcat", 31);
        Person p1 = new Person("java", 30);
        Person p2 = new Person("spring", 29);
        System.out.println(p.name() + "---" + p.age());
    }

}
