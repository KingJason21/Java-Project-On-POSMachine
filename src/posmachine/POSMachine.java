
package posmachine;

import java.util.*;
public class POSMachine {
    
    private String POS;
    private final long bal = 23_500_000L;
    
    public POSMachine (String name){
        POS = name;
    }
    public void setPOS (String name){
        POS = name;
    }
    public String getPOS(){
        return POS;
    }
    
    // Display Headings
    
    public void displayHeadings(){
        System.out.printf("Welcome to %s!\n\n", getPOS());
    }
    
    // Display OPtions for Transaction.
    public void Transactions(){
        
        Scanner input = new Scanner (System.in);
        
      
        int password;
        int password1 = 1234;
        boolean atmCard = true;
        
        while(atmCard == true){
        System.out.println("Input ATM ");
            atmCard = input.nextBoolean();
           
            if (atmCard == true){
             System.out.println("Card Accepted!!!\n");
            System.out.print("Enter Password: \n");
            password = input.nextInt();
        
   
            if ((password == password1))
            {
                System.out.printf("\n%s\n%s\n%s\n%s\n%s\n%s\n",
                        "Choose from the Option below for your Transaction",
                        "> Press 1 to Withdraw Cash ",
                        "> Press 2 to Credit your Account ",
                        "> Press 3 to make a Transfer ",
                        "> Press 4 to Pay Bills ",
                        "> Press 5 to check Balance ");
                int Option = input.nextInt();
                
                OUTER:
                switch (Option){
                    case 1:
                        System.out.printf("\n%s\n%s\n%s\n%s\n%s\n\n",
                                "How much do you want to Withdraw.",
                                "> Press 1 to withdraw 5,000 ",
                                "> Press 2 to withdraw 20,000 ",
                                "> Press 3 to withdraw 40,000 ",
                                "> Press 4 for Others ");
                        int withdraw = input.nextInt();
                        switch (withdraw){
                            case 1:
                                System.out.printf("\n%s\n%s\n%s\n",
                                        "Please wait... The Machimne is Connecting "
                                                + "with the Server...\n.\n.\n.\n.",
                                        "Your withdraw of $5,000 is Successful.",
                                        "Please take your Cash and your Recepit.\n");
                                break OUTER;
                            case 2:
                                System.out.printf("\n%s\n%s\n%s\n",
                                        "Please wait... The Machimne is Connecting "
                                                + "with the Server...\n.\n.\n.\n.",
                                        "Your withdraw of $20,000 is Successful.",
                                        "Please take your Cash and your Recepit.\n");
                                break OUTER;
                            case 3:
                                System.out.printf("\n%s\n%s\n%s\n",
                                        "Please wait... The Machimne is Connecting "
                                                + "with the Server...\n.\n.\n.\n.",
                                        "Your withdraw of $40,000 is Successful.",
                                        "Please take your Cash and your Recepit.\n");
                                break OUTER;
                            case 4:
                            {
                                System.out.println("How much do you want to Withdraw");
                                int much = input.nextInt();
                                System.out.println("Please wait... The Machine is "
                                        + "Connecting to the Server... \n.\n.\n.\n."
                                        + "\nYour withdraw"
                                        + " of $" + much + " is Successful.\nPlease take "
                                        + "your Cash " + much + " and your Recepit\n");
                                break OUTER;
                            }
                            default:
                                System.out.println("Enter a Valid Option");
                                break OUTER;
                        }
                        
                    case 2:
                    {
                        System.out.printf("\n%s\n\n%s\n",
                                "How much do you want to Credit to your Account.",
                                "Enter Amount ");
                        int credit = input.nextInt();
                        System.out.println("Please wait... The Machine is Connecting "
                                + "to the Server... \n.\n.\n.\n.\nThe sum of "
                                + "" + credit + " has "
                                        + "been Added to your Balance.\n");
                        break;
                    }    
                    case 3:
                    {
                    int money;
                    System.out.print("Enter Amount to Transfer: ");
                            money = input.nextInt();
                        if ( money > 1){
                            
                            System.out.print("Enter Recepient Account Number: ");
                            long No = input.nextLong();

                        System.out.println("\nPlease wait... The Machine is Connecting "
                                + "to the Server...\n.\n.\n.\n.\nYou are about to make a Transfer "
                                + "of $" + money + " to this Account Number " + No);
                            System.out.printf("\n%s\n%s\n%s\n",
                                    "Do you wish to Continue",
                                    "> Press 1 for YES",
                                    "> Press 2 for NO");
                            int cont = input.nextInt();
                            switch (cont) {
                                case 1:
                                    System.out.printf("\n%s\n%s%s %s %s\n\n",
                                            "Your Transaction was Successful.",
                                            "You Transfered the sum of $", money, 
                                    "to this account Number", No);
                                    break OUTER;
                                case 2:
                                    System.out.println("Thank you for banking with"
                                            + " us.\nPlease take "
                                            + "your card.\n");
                                    break OUTER;
                            }
                            
                                
                        }
                    }
                    case 4:
                        System.out.println("What Bills Aare you Paying For\n"
                        + "> Press 1 to Recharge for DSTV\n"
                        + "> Press 2 to Recharge for GOTV\n"
                        + "> Press 3 to Top Up Airtime\n"
                        + "> Press 4 to Top Up Data\n");
                        int bills = input.nextInt();
                        switch (bills){
                            case 1:
                            {
                                System.out.print("Enter IUC Number: ");
                                int iuc = input.nextInt();
                                System.out.print("Enter Amount to Recharge: ");
                                int recharge = input.nextInt();
                                System.out.println("\nPlease wait... the Machine is "
                                        + "Connecting to the Server...\n.\n.\n.\n."
                                        + "\nYour Recharge"
                                        + " of $" + recharge + " to this ICU Number "
                                                + iuc + " is Successful.\n");
                                break OUTER;
                            }
                            case 2:
                                {
                                System.out.print("Enter IUC Number: ");
                                long iuc = input.nextLong();
                                System.out.println("Enter Amount to Recharge: ");
                                int recharge = input.nextInt();
                                System.out.println("\nPlease wait... the Machine is "
                                        + "Connecting to the Server...\nYour Recharge"
                                        + " of $" + recharge + " to this ICU Number "
                                                + iuc + " is Successful.\n");
                                break OUTER;
                            }
                            case 3:
                            {
                                System.out.print("Enter Phone Number: ");
                                long phone = input.nextLong();
                                System.out.print("How much do you want to Recharge: ");
                                int card = input.nextInt();
                                System.out.println("\nPlease wait... the Machine is "
                                        + "Connecting to the Server...\n.\n.\n.\n."
                                        + "\nYour Recharge"
                                        + " of $" + card + " to this Phone Number "
                                                + phone + " is Successful\n");
                                break OUTER;
                            }
                            case 4:
                            {
                                 System.out.print("Enter Phone Number: ");
                                long phone = input.nextLong();
                                System.out.print("How much Data do you want to Recharge: ");
                                int card = input.nextInt();
                                System.out.println("\nPlease wait... the Machine is "
                                        + "Connecting to the Server...\n.\n.\n.\n."
                                        + "\nYour Purchase"
                                        + " of $" + card + " worth of Data to this Phone Number "
                                                + phone + " is Successful\n");
                                break OUTER;
                            }
                            
                        }
                        
                    case 5:
                        System.out.println("Your Account Balance is $" + bal +".00\n");
                        break;
                        
                    default:
                        System.out.println("Please choose A valid Option.");
                        break;
                      
                }
                
            }
            else
                    System.out.println("Please Enter the Right Password next Time\n"
                            + "You've been LOgged Off\n");
            
        } 
            
            else
                System.out.println("Card Ejected!!!\n");
        }
        System.out.println("Thank you for Banking with us.");
        
    }

}
