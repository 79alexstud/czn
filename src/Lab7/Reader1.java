package Lab7;

public class Reader1 extends User implements Reader,Administrator {

    Reader1 (String fio, String login, String phone){
      super (fio, login, phone);
    };
    public void takebook() {
        System.out.println(getFio()+" взял книгу");
    }
    public void retrieve () {
        System.out.println(getFio()+" вернул книгу");
    }
    public void findbook (){System.out.println(getFio()+" нашел книгу");}
    public void givebook () {System.out.println(getFio()+" отдал книгу");} // отдать книгу
    public void remind (){System.out.println(getFio()+" У вас просрочка");};    // напомнить о просрочке
}
