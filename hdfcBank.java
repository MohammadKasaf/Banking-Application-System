package bankingSystems;
import java.util.Random;

public class hdfcBank implements Bank{

    private long bankAccountNumber;
    private String password;

    private double balance;

    public static final double rateOfInterest=6.4;

    public hdfcBank(String password,double balance){

        Random random=new Random();
        this.bankAccountNumber=random.nextLong(100000000000L);
        this.password=password;
        this.balance=balance;

    }
    public String addMoney(String password, int money) {

        if(this.password.equals(password)){

            balance=balance+money;
            return "money successfully deposite !!";
        }
        else{
            return "you entered wrong password !!";
        }

    }

    public String checkBalance(String password) {

        if(this.password.equals(password)){

            return Double.toString(this.balance);
        }
        else{
             return "you entered wrong password !!";
        }


    }

    public String withdrawMoney(String password, int money) {


        if(this.password.equals(password)){

            if(this.balance>=money){
                this.balance=this.balance-money;
            }
            else{
                return "balance is not sufficient";
            }
        }
        else{
            return "you entered wrong password !!";
        }

        return "money has  been withdrawn new balance is "+this.balance;
    }

    public double getRateOfInterest(int years) {

        double totalInterest=(this.balance*hdfcBank.rateOfInterest*years)/100;
        return totalInterest;
    }
}
