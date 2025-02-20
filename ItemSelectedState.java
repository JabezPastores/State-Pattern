public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Item already selected. Cannot select another item.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Coin inserted: " + amount);
        vendingMachine.setBalance(vendingMachine.getBalance() + amount);
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        if (vendingMachine.getBalance() >= vendingMachine.getItemPrice()) {
            System.out.println("Dispensing item...");
            vendingMachine.setBalance(vendingMachine.getBalance() - vendingMachine.getItemPrice());
            vendingMachine.setCurrentState(new DispensingState());
        } else {
            System.out.println("Insufficient balance. Please insert more coins.");
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Setting vending machine to Out of Order.");
        vendingMachine.setCurrentState(new OutOfOrderState());
    }
    @Override

    public void setIdle(VendingMachine vendingMachine){
        System.out.println("Vending machine is now idle.");
        vendingMachine.setCurrentState(new IdleState());
    }
}