package bankingSystems;

public interface Bank {

    public  String addMoney(String password,int money);

    public String  checkBalance(String password);

    public String withdrawMoney(String password,int money);

    public double getRateOfInterest(int years);
}
