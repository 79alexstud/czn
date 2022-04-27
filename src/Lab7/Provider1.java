package Lab7;

public class Provider1 extends User implements Provider {
    Provider1 (String fio, String login, String phone){
        super (fio, login, phone);
    }
    public void getbook() {
        System.out.println(getFio()+" принес книгу");
    }
}
