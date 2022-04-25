package Lab6;

public class Student {

    String FirstName, lastName, group, scholar;
    double AverageMark;
    double[] scores = {5, 5, 5, 5};

    Student(String FirstName, String lastName, String group) {
        this.FirstName = FirstName;
        this.lastName = lastName;
        this.group = group;
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += scores[i];
        }
        AverageMark = sum / (double) scores.length;
    }

    static void scoresQuart(double[] scores) {
        for (int i = 0; i < 4; i++) {
            System.out.print((int) scores[i] + " ");
        }
        System.out.println();
    }
    public void getScholarship(double AverageMark) {
        if (AverageMark == 5) {
            scholar = "100 р";
        } else {scholar = "80 р";}
        }



  // Возвращаем через геттер и сеттер
  /*     public String getScholar (){
           return scholar;
       }
       public void setScholar(double AverageMark) {
           if (this.AverageMark == 5) {
               this.scholar = "180 р";
           } else {this.scholar = "80 р";}
       }

      */
}