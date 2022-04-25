package Lab6;

public class Main {
    public static void main (String [] args){

        Aspirant student = new Aspirant( "Alex", "Petrov","нет","Как управлять вселенной, не привлекая внимания санитаров");
        Student student1 = new Student("Oleg", "Ivanov","5B");
        Student arr [] = {student, student1};

        System.out.println("Группа - "+student.group);
        System.out.println("Аспирант - "+student.lastName+" "+student.FirstName);
        System.out.println("Средний бал - "+ (int)student.AverageMark);
        System.out.print("Оценки по четвертям - ");
        student.scoresQuart(student.scores);
        System.out.println("Научная работа - "+student.ScienceWork);

//     Выводим через метод
        student.getScholarship(student.AverageMark);
        System.out.println("Вывод через метод (Аспирант): "+student.scholar);
        student1.getScholarship(student1.AverageMark);
        System.out.println("Вывод через метод (Студент): "+student1.scholar);

//      Выводим через массив
        arr[0].getScholarship(arr[0].AverageMark);
        System.out.println("Вывод через массив (Аспирант): "+arr[0].scholar);
        arr[1].getScholarship(arr[1].AverageMark);
        System.out.println("Вывод через массив (Студент): "+arr[1].scholar);

//
//
//     Выводим через геттер и сеттер

//        student.setScholar(student.AverageMark);
//        System.out.println(student.getScholar());
//        student1.setScholar(student1.AverageMark);
//        System.out.println(student1.getScholar());
    }
}