public class Main {
    public static void main(String[] args){
        TradingPlatform platform=new TradingPlatform();
        Stock apple=new Stock("AAPL","Apple",180.0);
        Stock tesla=new Stock("TSLA","Tesla",250.0);
        platform.addStock(apple);
        platform.addStock(tesla);
        User user=new User("Siri",1000.0);
        platform.showStocks();
        System.out.println("\nUser:"+user.getName());
        System.out.println("Balance:"+user.getBalance());
        System.out.println("\n ----Buying Stock----");
        platform.buyStock(user,apple,2);
        System.out.println("\nRemaining Balance:"+user.getBalance());
        platform.showTransactions();

    }
}
