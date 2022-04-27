package Lab7;

public class Administrator1 extends User implements Administrator {
    Administrator1 (String fio, String login, String phone) {
     super(fio, login, phone);
    }

    public void findbook (){System.out.println(getFio()+" нашел книгу");}
    public void givebook () {System.out.println(getFio()+" отдал книгу");} // отдать книгу
    public void remind (){System.out.println(getFio()+" У вас просрочка");};    // напомнить о просрочке


}
