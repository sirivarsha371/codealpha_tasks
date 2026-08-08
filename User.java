public class User {
    private String name;
    private double balance;
    public User(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    public String getName() {
        return name;
    }
        public double getBalance(){
            return balance;
        }
        public void addBalance(double amount){
        balance+=amount;
        }
        public boolean withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            return true;
        }
        return false;
        }
}
