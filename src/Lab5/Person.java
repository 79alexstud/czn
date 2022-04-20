package Lab5;

public class Person {
    String FullName;
    int age;

    Person(String fullName, int age) {
        this.FullName = fullName;
        this.age = age;
    }

    static void move(String fullName) {
        System.out.println(fullName + " движется");
    }

    static void talk(String fullName) {
        System.out.println(fullName+ " говорит");
    }

    Person() {}
}