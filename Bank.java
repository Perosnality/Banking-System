import java.util.Scanner;

public class Bank {
    double Balance;
    double PreviousTransaction;
    String CustomerName;
    String CustomerId;

    Bank(String cname, String cid)
    {
        this.CustomerName = cname;
        this.CustomerId = cid;

    }


    void deposit(int amount)
    {
        if(amount!=0)
        Balance = Balance+amount;
        PreviousTransaction = amount;
    }
    void withdraw(int amount)
    {
        if(amount!=0)
        Balance = Balance-amount;
        PreviousTransaction = -amount;
    }
    void getPreviousTransaction()
    {
        if(PreviousTransaction > 0)
        {
            System.out.println("Amount Deposited" +PreviousTransaction);
        }
        else if(PreviousTransaction < 0)
        {
            System.out.println("Amount Withdraw" +Math.abs(PreviousTransaction));

        }
        else
        {
            System.out.println("No Transaction Occured");
        }
    }
    void ShowMenu()
    {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome "+CustomerName);
        System.out.println("Your ID"+CustomerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");
        do{
            System.out.println("************");
            System.out.println("enter an option");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch(option)
            {
                case 'A':
                System.out.println("************");
                System.out.println("enter an option");
                System.out.println("************");
                System.out.println("Balance = " +Balance);
                System.out.println("\n");
                break;

                case 'B':
                System.out.println("************");
                System.out.println("enter an amount to be deposited");
                System.out.println("************");
                int amount = scanner.nextInt();
                deposit(amount);
                System.out.println("\n");
                break;

                case 'C':
                System.out.println("************");
                System.out.println("enter an amount to be Withdraw");
                System.out.println("************");
                int amount2 = scanner.nextInt();
                withdraw(amount2);
                System.out.println("\n");
                break;

                case 'D':
                System.out.println("************");
                getPreviousTransaction();
                System.out.println("************");
                System.out.println("\n");
                break;

                case 'E':
                System.out.println("********");
                break;

                default:
                System.out.println("Invalid Option");
                break;






            }
    
            
    
        } 
        while(option !='E');
        System.out.println("Thank you for our services");

    }

}