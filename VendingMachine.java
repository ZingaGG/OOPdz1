public interface VendingMachine {
    HotDrink getHotDrink(String name, double volume, double temperature) throws IllegalStateException;
}