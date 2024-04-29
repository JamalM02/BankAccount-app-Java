public class BankAccount {
   private int Amount,BankNumbers;

    public void setAmount(int amount) {
        if(amount>0)
        this.Amount += amount;

        else
            System.out.println("ERROR, invalid Amount!");
    }

    public void setBankNumbers(int NewBankNum) {
        if(NewBankNum>0)
       this.BankNumbers=NewBankNum;

        else
            System.out.println("\nERROR! invalid Number");
    }

    public int getAmount() {
        return Amount;
    }

    public int getBankNumber() {

        return BankNumbers;
    }


    @Override
    public String toString() {
        return "New Bank Account " + "'"
                 + BankNumbers + "' Added!" +
                "\namount=" + Amount ;
    }
}
