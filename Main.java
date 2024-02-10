import bankingSystems.sbiBank;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("welcome to bank");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter you password !!");
        String password = sc.next();
        System.out.println("Enter the initial balance you want to add ");
        int initialBalance = sc.nextInt();

        sbiBank bankAc = new sbiBank(name,password,initialBalance);

        System.out.println("Your Bank account has been created !!");

        System.out.println("Enter the money you want to add ");

        int money = sc.nextInt();
        String result = bankAc.addMoney(password,money);
        System.out.println(result);

        System.out.println("Enter the money you want to withdraw !!");

        money = sc.nextInt();
        System.out.println("Enter the password !!");
        password = sc.next();
        result = bankAc.withdrawMoney(password,money);
        System.out.println(result);


        System.out.println("Lets see you balance now !!");

        System.out.println("Enter the password !!");
        password = sc.next();
        result = bankAc.checkBalance(password);
        System.out.println(result);

        System.out.println("Enter the time you want to save money for ");
        int years = sc.nextInt();

        double rateOfInterest = bankAc.getRateOfInterest(years);

        System.out.println("Total Interest that will be earned is "+rateOfInterest);


    }
}