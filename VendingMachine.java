public class VendingMachine {
    private VendingMachineState currentState;
    private int balance;
    private String selectedItem;
    private int itemPrice;

    public VendingMachine() {
        this.currentState = new IdleState(); // Initial state
        this.balance = 0;
        this.itemPrice = 10; // Example price for an item
    }

    public void setCurrentState(VendingMachineState state) {
        this.currentState = state;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void selectItem(String item) {
        currentState.selectItem(this, item);
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }
}