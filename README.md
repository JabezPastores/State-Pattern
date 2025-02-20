# State Pattern for Vending Machine

## Problem Statement
A vending machine needs to manage multiple states, each with specific rules and restrictions. The current implementation relies on conditional statements within the `VendingMachine` class, making it difficult to maintain as the number of states grows.

## States and Their Behavior

1. **Idle State:**
   - Allows item selection.
   - Disallows dispensing items and inserting coins.

2. **Item Selected State:**
   - Allows inserting coins and dispensing items.
   - Disallows selecting another item.

3. **Dispensing State:**
   - Disallows all operations.
   - Automatically transitions back to the `Idle` state after dispensing is complete.

4. **Out of Order State:**
   - Disallows all operations.

## Solution: Implementing the State Pattern
To improve maintainability and flexibility, we implement the **State Pattern**, replacing conditional logic with state-specific behavior.

### Key Components:

- **State Interface (`VendingMachineState`)**
  - Defines common actions: `selectItem()`, `insertCoin()`, `dispenseItem()`, and `setOutOfOrder()`.

- **Concrete State Classes**
  - Implement `VendingMachineState` for each vending machine state:
    - `IdleState`
    - `ItemSelectedState`
    - `DispensingState`
    - `OutOfOrderState`

- **Vending Machine Class (`VendingMachine`)**
  - Maintains attributes for **item inventory** and **balance**.
  - Holds a reference to the current state (`VendingMachineState`).
  - Delegates operations to the current state instead of handling logic internally.

## Benefits
- **Improved Maintainability:** Encapsulating state-specific behavior makes the code easier to modify and extend.
- **Better Scalability:** New states can be added without modifying existing logic.
- **Increased Readability:** Eliminates complex conditional statements, making the code more intuitive.

By applying the **State Pattern**, we create a more flexible and maintainable vending machine system.

