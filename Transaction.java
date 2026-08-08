public class Transaction {
    private String type;
    private String stocksymbol;
    private int quantity;
    private double price;
    public Transaction(String type,String stocksymbol,int quantity,double price){
        this.type=type;
        this.stocksymbol=stocksymbol;
        this.quantity=quantity;
        this.price=price;
    }
    public void display(){
        System.out.println(type+"|"+stocksymbol+"|quantity:"+quantity+"|price:"+price);
    }
}
