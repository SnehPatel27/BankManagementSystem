package sa;
import java.util.Scanner;
import java.io.*;
import lo.*;
import fd.*;
import bd.*;
class choice
{
    public static void main(String args[]) throws java.io.IOException
    {
        Scanner sc= new Scanner(System.in);
        savings_account ob = new savings_account();
        bank_details ob2 = new bank_details();
        fixed_deposit ob1 = new fixed_deposit();
        loan ob3 = new loan();
        char ch=1;
        char ch1;
        System.out.println("\n\nYou are requested to read the instructions carefully ..");

        System.out.println("\n\nHow may we help you today");
        while(true)
        {
            System.out.println("\n\n1) Savings account ");
            System.out.println("2) Fixed Deposit ");
            System.out.println("3) Loan with seconds ");
            System.out.println("4) Exit");
            System.out.print("\n\nWhat would you prefer ? ");
            ch1 = sc.next().charAt(0);

            if(ch1=='1')
            {
                while (true)
                {
                    System.out.println("\n\n**************************************************************************************************************");
                    System.out.println("\n\n1) Create your Bank Account");
                    System.out.println("2) Add money to your Bank Account");
                    System.out.println("3) Withdraw money from bank account");
                    System.out.println("4) View balance");
                    System.out.println("5) View personal details");
                    System.out.println("6) delete account");
                    System.out.println("\n\n**************************************************************************************************************");
                    System.out.println("\n\nEnter your choice from 1 to 6");
                    ch = sc.next().charAt(0);
                    switch(ch)
                    {
                        case '1':
                        {
                            ob.make_an_account();
                            break;
                        }
                        case '2':
                        {
                            ob.add_money_to_account();
                            break;
                        }
                        case '3':
                        {
                            ob.withdraw_money();
                            break;
                        }
                        case '4':
                        {
                            ob.view_balance();
                            break;
                        }
                        case '5':
                        {
                            ob.view_personal_details();
                            break;
                        }
                        case '6':
                        {
                            ob.delete_account();
                            break;
                        }
                        default:
                        {
                            System.out.println("Wrong number entered");
                            System.exit(0);
                        }
                    }
                }
            }

            if(ch1=='2')
            {
                ob1.accept_details();
            }

            if(ch1=='3')
            {
                ob3.accept_loan_details();
            }
            
            if(ch1=='4')
            {
                System.out.println("\nThank you for visiting .");
                
                InputStreamReader read = new InputStreamReader(System.in);
                BufferedReader in = new BufferedReader(read);
                
                System.out.println("\nCan you please give feedback .");
                String str = in.readLine();
                
                FileWriter f = new FileWriter("feedback.txt",true);
                BufferedWriter b = new BufferedWriter(f);
                
                b.write(str);
                b.newLine();
                b.close();
                System.out.println("\n\n**************************************************************************************************************");
                System.exit(0);
            }
        }
    }
}