package CashRegister;

public class CashRegister {
   
    private int itemCount;
    private double totalPrice;
    private int totalCount;
    private int totalSales;
   
   
    public void addItem(double price) {
        itemCount++;
        totalPrice = totalPrice + price;
        totalCount++;
        totalSales+=price;
    }
   
    public double getTotal() {
        return totalPrice;
    }
   
    public int getCount() {
        return itemCount;
    }
public int getSalesTotal(){
    return totalSales;
}
public int getSalesCount(){
    return totalCount;
}
public void resetSales(){
    clear();
    totalSales=0;
    totalCount=0;
}
   public void clear() {
      itemCount = 0;
      totalPrice = 0;
   }
}
