package Lab7;

public class Reader1 extends User implements Reader {

    Reader1 (String fio, String login, String phone){
      super (fio, login, phone);
    };
    public void takebook() {
        System.out.println(getFio()+" взял книгу");
    }
    public void retrieve () {
        System.out.println(getFio()+" вернул книгу");
    }
}
