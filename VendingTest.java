public class VendingTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectItem("Soda"); // Selects item, transitions to ItemSelectedState
        vendingMachine.insertCoin(5);     // Inserts coin
        vendingMachine.insertCoin(5);     // Inserts another coin
        vendingMachine.dispenseItem();    // Dispenses item, transitions to DispensingState and then IdleState

        vendingMachine.setOutOfOrder();   // Sets vending machine to OutOfOrderState
        vendingMachine.selectItem("Chips"); // Fails, machine is out of order
    }
}