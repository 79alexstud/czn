package Lab6;

public class Aspirant extends Student {
    String ScienceWork;
    public Aspirant (String FirstName, String lastName, String group, String ScienceWork){
    super(FirstName,lastName,group);
    this.ScienceWork = ScienceWork;
    }

    //Возвращаем через метод

        @Override
    public void getScholarship(double AverageMark) {
        if (AverageMark == 5) {
            scholar = "200 р";
        } else {scholar = "180 р";}
        }

//    Возвращаем через геттер и сеттер

//    @Override
//    public String getScholar() {
//        return scholar;
//    }
//
//    @Override
//    public void setScholar(double AverageMark) {
//            if (this.AverageMark == 5) {
//                this.scholar = "200 р";
//            } else {this.scholar = "180 р";}
//           }
//

}
