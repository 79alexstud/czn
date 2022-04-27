package Lab6;

public class Main {
    public static void main (String [] args){

        Aspirant student = new Aspirant( "Alex", "Petrov","Как управлять вселенной, не привлекая внимания санитаров");
        Student student1 = new Student("Oleg", "Ivanov","5B");
        Student arr [] = {student, student1};

        System.out.println("Аспирант - "+student.lastName+" "+student.FirstName);
        System.out.println("Средний бал - "+ student.AverageMark);
        System.out.print("Оценки по четвертям - ");
        student.scoresQuart(student.scores);
        System.out.println("Научная работа - "+student.ScienceWork);

//     Выводим через метод
        //student.getScholarship(student.AverageMark);
        System.out.println("Вывод через метод (Аспирант): "+student.getScholarship(student.AverageMark));
        //student1.getScholarship(student1.AverageMark);
        //System.out.println("Вывод через метод (Студент): "+student1.scholar);
        System.out.println("Вывод через метод (Аспирант): "+student1.getScholarship(student1.AverageMark));
//      Выводим через массив
        //arr[0].getScholarship(arr[0].AverageMark);
        System.out.println("Вывод через массив (Аспирант): "+arr[0].getScholarship(student.AverageMark));
        //arr[1].getScholarship(arr[1].AverageMark);
        System.out.println("Вывод через массив (Студент): "+arr[1].getScholarship(student1.AverageMark));

//
//
//     Выводим через геттер и сеттер

//        student.setScholar(student.AverageMark);
//        System.out.println(student.getScholar());
//        student1.setScholar(student1.AverageMark);
//        System.out.println(student1.getScholar());
    }
}