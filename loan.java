package lo;
//package lo stands for loan
import java.util.Scanner;
import java.io.*;
public class loan 
{
    String name,bg,add;
    int age,loan;
    String bday;
    long ph;
    char ch;    
    public void accept_loan_details() throws java.io.IOException
    {
        Scanner sc = new Scanner(System.in);
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("\n**************************************************************************************************************");
        System.out.print("\nName : ");
        name = sc.nextLine();
        System.out.print("\nAge : ");
        age = sc.nextInt();
        if(age<18)
        {
            System.out.println("\nLoan is granted only to people of age 18 or above");
            System.exit(0);
        }
        else
        {
            System.out.print("\nAddress : ");
            add = in.readLine();
            System.out.print("\nBlood group : ");
            bg = in.readLine();
            System.out.print("\nEnter Phone Number : ");
            ph = sc.nextLong();
            System.out.print("\nEnter Your Birth date : ");
            bday = in.readLine();
            System.out.println("\n\nOur bank offers these loans");
            System.out.println("1) Home Loan");
            System.out.println("2) Car Loan");
            System.out.println("3) Educational loan");
            System.out.println("4) Gold Loan");
            System.out.println("5) Bussiness Loan");

            System.out.print("\n\nEnter your choice .");
            ch = sc.next().charAt(0);
            System.out.print("\nHow much amount of loan do you want ? ");
            loan = sc.nextInt();
            switch(ch)
            {
                case '1':
                {
                    if(loan>1000000) 
                    {
                        System.out.println("\nLoan limit is 1000000 .");
                    }
                    else
                    {
                        System.out.println("\nCongratulations !! You have been granted loan of "+loan);
                    }
                    break;
                }
                case '2':
                {
                    if(loan>200000)
                    {
                        System.out.println("\nLoan limit is 200000 . ");
                    }
                    else
                    {
                        System.out.println("\nCongratulations !! You have been granted loan of "+loan);
                    }
                    break;
                }
                case '3':
                {
                    if(loan>100000)
                    {
                        System.out.println("\nLoan limit is 100000 . ");
                    }
                    else
                    {
                        System.out.println("\nCongratulations !! You have been granted loan of "+loan);
                    }
                    break;
                }
                case '4':
                {
                    if(loan>50000)
                    {
                        System.out.println("\nLoan limit is 50000 . ");
                    }
                    else
                    {
                        System.out.println("\nCongratulations !! You have been granted loan of "+loan);
                    }
                    break;
                }
                case '5':
                {
                    if(loan>150000)
                    {
                        System.out.println("\nLoan limit is 150000 . ");
                    }
                    else
                    {
                        System.out.println("\nCongratulations !! You have been granted loan of "+loan);
                    }
                    break;
                }
                default :
                System.out.println("\nWrong choice entered ");
            }
        }
        System.out.println("\n**************************************************************************************************************");
    }
}