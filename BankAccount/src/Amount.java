/**
 * This class represents a transaction amount
 *
 */
public class Amount {

    private double amount;
    TransactionType transactionType;
    public Amount(double amount,TransactionType tt){
        this.amount = amount;
        transactionType = tt;
    }

    public String toString(){
        return amount + " " + transactionType;
    }

}