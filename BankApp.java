import java.util.Scanner;

public class BankApp {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        int AccountNumber, AccountBalance, GInputs,MainAnswers;
        BankAccount[] Acc = new BankAccount[0];
        System.out.println("Hi, What can I do for you Today?");
        System.out.println("""

                New Account Press 1
                For Accounts Report List And Exit Press 3""");
        MainAnswers = input.nextInt();

        //יצירת חשבונות
        while(MainAnswers==1) {
            //כמה חשבונות?
            System.out.println("\nHow much accounts you wanna create?");
            GInputs = input.nextInt();
            Acc = new BankAccount[GInputs];
            //יצירת חשבון חדש
            for (int i=0; i < Acc.length; i++) {
                Acc[i] = new BankAccount();
                System.out.println("\nPlz enter Your ID Number for Account "+ i);
                AccountNumber = input.nextInt();

                int Err = 0;
                for (int j = 0; j <= i; j++)
                    if (AccountNumber == Acc[j].getBankNumber()) {
                        Err = 1;
                        break;
                    }


                if (Err == 0) {
                    Acc[i].setBankNumbers(AccountNumber);
                    System.out.println(Acc[i]);
                } else
                    System.out.println("\nERROR! Exist");

            }

            System.out.println("\nAny thing else?");
            System.out.println("To deposit money for exist account Press 2" +
                    "\nFor Accounts Report List And Exit Press 3");
            MainAnswers = input.nextInt();
        }

        //הפקדה
        while (MainAnswers == 2) {
            System.out.println("\nID for account deposit:");
            GInputs = input.nextInt();
            int i,j;
            int Err=0;

            for (i = 0; i < Acc.length; i++) {
                if (GInputs == Acc[i].getBankNumber()) {
                    j = i;
                    System.out.println("How much?");
                    AccountBalance = input.nextInt();
                    Acc[j].setAmount(AccountBalance);
                    System.out.println("\n***The Balance in Account " + Acc[j].getBankNumber() +
                            " Is " + Acc[j].getAmount() + " Shekels!***");break;
                }
                else
                    Err++;
            }
            if(Err==Acc.length)
            System.out.println("\nERROR! invalid number");


            System.out.println("\nAny thing else?");
            System.out.println("To deposit money for exist account Press 2" +
                    "\nFor Accounts Report List And Exit Press 3");
            MainAnswers = input.nextInt();
        }


        //דוח ויציאה
        if (MainAnswers==3) {
            System.out.println("\n************Accounts List**************");
            for (BankAccount bankAccount : Acc)
                System.out.println("***Account " + bankAccount.getBankNumber() +
                        " Balance " + bankAccount.getAmount() + " Shekels!***");
        }

        System.out.println("Have a nice day!:)");

    }



}
