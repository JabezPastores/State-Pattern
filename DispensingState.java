public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Cannot select items while dispensing.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Cannot insert coins while dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Item dispensed");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Cannot set out of order while dispensing.");
    }
    @Override

    public void setIdle(VendingMachine vendingMachine){
        System.out.println("Vending machine is now idle.");
        vendingMachine.setCurrentState(new IdleState());
    }
}