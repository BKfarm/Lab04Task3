public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000;
        double interest = 1.17;
        System.out.println("Starting balance: " + balance);
        balance = balance * 1.17;
        System.out.println("Balance after one month: " + balance);
        balance = balance * 1.17;
        System.out.println("Balance after two months: " + balance);
    }
}