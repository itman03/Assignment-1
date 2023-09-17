import static java.lang.System.out;

public class PersonalAccountDemo {
    public static void main(String[] args) {
        PersonalAccount myAccount = new PersonalAccount(1,"Galina");
        myAccount.printTransactionHistory();
        out.println(myAccount.getAccountHolder() + " " + myAccount.getAccountNumber() + " " + myAccount.getBalance());
        myAccount.deposit(200);
        out.println(myAccount.getBalance());
        myAccount.printTransactionHistory();
        myAccount.withdraw(300);
        out.println(myAccount.getBalance());
        myAccount.printTransactionHistory();
    }
}