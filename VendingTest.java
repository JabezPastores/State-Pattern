public class VendingTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectItem("Soda"); 
        vendingMachine.insertCoin(5);    
        vendingMachine.insertCoin(5);     
        vendingMachine.dispenseItem();   
        vendingMachine.setIdle();
        
        vendingMachine.setOutOfOrder();  
        vendingMachine.selectItem("Chips"); 
    }
}