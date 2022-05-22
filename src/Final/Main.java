package Final;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        try {
            System.out.println("Введите с какого счета переводить");
            Scanner from_acc  = new Scanner(System.in);
            int id1 = from_acc.nextInt();
            System.out.println("Введите сумму перевода");
            double sum = from_acc.nextDouble();
            System.out.println("Введите на какой счет переводить");
            int id2 = from_acc.nextInt();
            Account acc1 = new Account(id1, 5000);
            Account acc2 = new Account(id2, 4300);
            Transaction<Account> tran1 = new Transaction<Account>(acc1, acc2, sum);
            tran1.execute();
        }
        catch (Exception e) {
            System.out.println("Что то пошло не так, попробуйте снова");
        }

    }
}
interface Accountable{
    int getId();
    double getSum();
    void setSum(double sum);
}
class Account implements Accountable{

    int id;
    double sum;
    Account(int id,double sum){
        this.id = id;
        this.sum = sum;
    }
    public int getId() { return id; }
    public double getSum() { return sum; }
    public void setSum(double sum) { this.sum = sum; }
}
class Transaction<T extends Accountable>{

    private T from;     // с какого счета перевод
    private T to;       // на какой счет перевод
    private double sum;    // сумма перевода

    Transaction(T from, T to, double sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute(){

        if (from.getSum() > sum)
        {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %d: %f \nAccount %d: %f \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        }
        else{
            System.out.printf("Сумма перевода превышает остаток");
        }
    }
}