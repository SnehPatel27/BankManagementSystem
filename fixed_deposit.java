package fd;
//package fd stands for fixed deposit
import java.io.*;
public class fixed_deposit
{
    String nm,bldgrp,add,dob,dt;
    double fd,no1,wd,no2;
    long pn;
    int age,cr,interest,deposit,time;
    public void accept_details() throws java.io.IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
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
        }
        else
        {
            System.out.println("\nSorry you can't make an account.");
            System.out.println("\n**************************************************************************************************************");
            System.exit(0);
        }
        System.out.println("\nCongratulations.You have your own account now.");
        System.out.print("\n\nHow much money you wish to save in your fixed deposit ? ");
        deposit = Integer.parseInt(in.readLine());
        System.out.print("\nFor what time period you want to store your money ? ");
        time = Integer.parseInt(in.readLine());
        if(deposit < 5000)
        {
            System.out.println("\nThe deposit is unsuccessful . The minimum deposit should be above 5000");
        }
        else
        {
            System.out.println("\n"+deposit+ " is successfully addded to your account .");
            System.out.println("\nThe interest rate is 3%");
            interest = 3*deposit/100;
            System.out.println("\nYour will get interest of "+interest+"Rs every year.");
            int amt = interest + deposit;
            System.out.println("\nYou can collect your total amount of "+amt+"Rs after "+time+" years");
        }
        System.out.println("\n**************************************************************************************************************");
    }
}