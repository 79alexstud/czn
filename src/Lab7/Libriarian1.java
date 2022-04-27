package Lab7;

public class Libriarian1 extends User implements Libriarian {

    Libriarian1 (String fio, String login, String phone){
        super (fio, login, phone);
    };
    public void orderbook() {
        System.out.println(getFio()+" заказал книгу");
    }

}
