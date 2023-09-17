/**
 * Class for personal account management.
 * @author Galina
 * @version 1.0
 * @since 14.09.2023
 */
public class PersonalAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;
    private Amount[] transactions = new Amount[20];
    private int transactionsNum;

    /**
     *
     * @param accountNumber  A unique identifier for the account.
     * @param accountHolder The name of the account holder.
     */

    public PersonalAccount(int accountNumber,String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        balance = 0.0;
        transactionsNum = 0;
    }

    /**
     * A method to deposit money into the account.
     * @param amount amount of money to make a deposit
     */
    public void deposit(double amount){
        transactions[transactionsNum++] = new Amount(amount,TransactionType.Deposit);
        balance += amount;
    }

    /**
     * A method to withdraw money from the account
     * @param amount amount of money to make a withraw
     */
    public void withdraw(double amount){
        if(balance == 0 || amount > balance){
            System.out.println("Sorry , but you can not make a withdraw >>> Your balance is empty !");
        }else{
            transactions[transactionsNum++] = new Amount(amount,TransactionType.Withdrawal);
            balance -= amount;
        }

    }

    /**
     * Prints a history of transaction
     */
    public void printTransactionHistory(){
        if(transactionsNum == 0){
            System.out.println("The history of transaction is empty >>>");
        }else{
            for(int i = 0; i < transactionsNum;i++){
                System.out.println(transactions[i]);
            }
        }

    }

    /**
     *
     * @return current balance of the person
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @return A unique identifier for the account.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @return The name of account holder
     */
    public String getAccountHolder() {
        return accountHolder;
    }
}