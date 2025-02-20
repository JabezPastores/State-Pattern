public interface VendingMachineState {
    void selectItem(VendingMachine vendingMachine, String item);
    void insertCoint(VendingMachine vendingMachine, int amount);
    void dispenseItem(VendingMachine vendingMachine);
    void setOutOfOrder(VendingMachine vendingMachine);
}