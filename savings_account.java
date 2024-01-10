package sa;
//package sa stands for savings account
import java.io.*;
public class savings_account
{
    String nm,bldgrp,add,dob,dt;
    double fd,no1,wd,no2;
    long pn;
    int age,cr;
    boolean a=false,b=false;
    void make_an_account()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        if(a==false)
        {
            System.out.println("\nPlease fill the details given below :");
            System.out.println("\n**************************************************************************************************************");
            System.out.print("\nName : ");
            nm=in.readLine();
            System.out.print("\nAge : ");
            age=Integer.parseInt(in.readLine());
            if(age>=18)
            {
                System.out.print("\nBlood Group : ");
                bldgrp=in.readLine();
                System.out.print("\nAddress : ");
                add=in.readLine();
                System.out.print("\nPhone Number : ");
                pn=Long.parseLong(in.readLine());
                System.out.print("\nDate of birth : ");
                dob=in.readLine();
                System.out.print("\nDo you have any criminal record? (1=YES 0=NO)");
                cr=Integer.parseInt(in.readLine());
                {
                    if(cr==1)
                    {
                        System.out.println("\nSorry you can't make an account.");
                        System.out.println("**************************************************************************************************************");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("\nCongratulations.You have your own account now.");
                        System.out.println("\n**************************************************************************************************************");
                        a=true;
                    }
                }
            }
            else
            {
                System.out.println("\nSorry you can't make an account.");
                System.out.println("\n**************************************************************************************************************");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("\nAccount has been made before. You cannot create another account.");
            System.out.println("Choose any other option.");
        }
    }

    void add_money_to_account()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        if(a==true)
        {
            System.out.print("\nHow much money you want to add to your account ? ");
            no1=Double.parseDouble(in.readLine());
            if(no1>=2000)
            {
                fd=fd+no1;
                System.out.println("\nRs. "+no1+" is added to your account");
                b=true;
            }
            else
            {
                System.out.println("\nIf you are adding for first time minimmum Rs. 2000 should be added to your account.");
            }
        }
        else
            System.out.println("\nYou haven't made an account.");
    }

    void withdraw_money()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        if(a==true && b==true)
        {
            System.out.print("\nHow much money you want to withdraw from your account having "+fd+"Rs balance ");
            no2=Double.parseDouble(in.readLine());
            wd=no2;
            if(fd-wd>=2000)
            {
                System.out.println("\nRs. "+wd+" is withdrawed from your account");
                fd=fd-wd;
            }
            else
            {
                System.out.println("\nRs. "+wd+" is unsuccessfull to withdraw from your account");
                System.out.println("because Rs.2000 should be left in your account");
            }
        }
        else
            System.out.println("\nYou haven't made any account or no money is added to your account.");
    }

    void view_balance()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        if(a==true && b==true)
        {
            System.out.println("\nMr./Mrs. "+nm+".Your account holds Rs. "+fd);
        }
        else
            System.out.println("\nYou haven't made any account or no money is added to your account.");
    }

    void view_personal_details()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        if(a==true)
        {
            System.out.println("**************************************************************************************************************");
            System.out.println("\nYour Personal Details are :");
            System.out.println("\nName : "+nm);
            System.out.println("\nAge : "+age);
            System.out.println("\nDate of birth : "+dob);
            System.out.println("\nBlood Group : "+bldgrp);
            System.out.println("\nAddress : "+add);
            System.out.println("\nPhone Number : "+pn);
            System.out.println("\n**************************************************************************************************************");
        }
        else
            System.out.println("\nYou haven't made an account.");
    }

    void delete_account()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        if(a==true)
        {
            System.out.println("\nYour account is deleted. You get Rs."+fd+" back.");
            System.exit(0);
        }
        else
            System.out.println("\nYou haven't made an account.");
    }
}