public class Bank {
    public static void main( String[] args ) {
        Customer2 saurabh = new Customer2("saurabh",23,"Himachal Pradesh");
        saurabh.showAccountdetails();
        System.out.println(saurabh.getName());
        System.out.println(saurabh.getAge());
        System.out.println(saurabh.getState());
        saurabh.deposit();
        saurabh.withdraw();
        saurabh.showBal();
        System.out.println("--------------------------------------------------------");
        saurabh.deposit();;
        Customer2 shubham = new Customer2("shubham",22,"Orissa");
        shubham.showAccountdetails();
        System.out.println(shubham.getName());
        System.out.println(shubham.getAge());
        System.out.println(shubham.getState());
        shubham.deposit();
        shubham.withdraw();
        shubham.showBal();
    }


}
