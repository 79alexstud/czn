package Lab7;

public class Main {
    public static void main(String[] args) {
        Libriarian1 libri1 = new Libriarian1("Ivanov Ivan Ivanich","Ivanov", "1234567");
        Reader1 read = new Reader1("Petrov Petr Petrovich","Petrov", "1234567");
        Provider1 prov = new Provider1("Sidorov Ivan Olegovich","Sidorov", "1234567");
        Administrator1 adm = new Administrator1("Ryzhikov Mefodiy Valerianovich","Ryzhikov", "1234567");
        read.takebook();
        adm.givebook();
        adm.findbook();
        adm.remind();
        libri1.orderbook();
        prov.getbook();
    }
}

