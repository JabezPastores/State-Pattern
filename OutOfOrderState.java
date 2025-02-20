public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Vending machine is out of order. Cannot select items.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Vending machine is out of order. Cannot insert coins.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Vending machine is out of order. Cannot dispense items.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is already out of order.");
    }
}