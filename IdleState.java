public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Item " + item + " selected.");
        vendingMachine.setCurrentState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Cannot insert coins in Idle state.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Cannot dispense items in Idle state.");
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