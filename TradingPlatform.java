import java.util.ArrayList;
public class TradingPlatform {
    private ArrayList<Stock>stocks;
    private ArrayList<Transaction>transactions;
    public TradingPlatform(){
        stocks=new ArrayList<>();
        transactions=new ArrayList<>();
    }
    public void addStock(Stock stock){
        stocks.add(stock);
    }
    public void showStocks(){
        System.out.println("----Available Stocks----");
        for(Stock stock:stocks){
            System.out.println(stock.getSymbol()+"|"+stock.getName()+"|Price:"+stock.getPrice());
        }
    }
    public void buyStock(User user,Stock stock,int quantity){
        double total=stock.getPrice()*quantity;
        if(user.withdraw(total)) {
            transactions.add(new Transaction("BUY", stock.getSymbol(), quantity, stock.getPrice()));
            System.out.println("Stock Purchased Successfully");
        }else{
            System.out.println("Insufficient balance!");
        }
    }
    public void showTransactions(){
        System.out.println("------Transactions------");
        for(Transaction transaction:transactions){
            transaction.display();
        }
    }


    }

