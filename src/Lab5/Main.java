package Lab5;

public class Main {
    public static void main (String [] args) {
   Person person = new Person();
    person.move ("Олег");
    person.talk ("Марина");
    Person person1 = new Person("Антон", 23);
        System.out.println(person1.FullName+ " говорит: Мне - "+ person1.age);
        }
}
