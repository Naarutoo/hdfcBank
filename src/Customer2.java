import java.util.Scanner;

public class Customer2 extends BankOperations2 implements BankOperations {
    private String Name;
    private int Age;
    private String State;

    public Customer2( String name, int age, String state ) {
        Name = name;
        Age = age;
        State = state;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getState() {
        return State;
    }

    Scanner s = new Scanner(System.in);
    @Override
    public void deposit() {
        System.out.println("Enter amount to be deposited");
        int amount = s.nextInt();
        System.out.println(amount+" is depodited to account");
    }

    @Override
    public void showBal() {
        System.out.println("Balance: ");
        System.out.println("System is not showing balance");
    }

    @Override
    public void withdraw() {
        System.out.println("Enter amount to be withdrawl");
       int wihdrawl = s.nextInt();
        System.out.println(wihdrawl+" is going to withdraw from account");
    }

    @Override
    public void showAccountdetails() {
        System.out.println("Account details are as follow ");
    }
}
