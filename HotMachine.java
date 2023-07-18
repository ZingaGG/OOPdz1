import java.util.List;

public class HotMachine implements VendingMachine {
    private List<HotDrink> hotDrinks;

    public HotMachine(List<HotDrink> hotDrinks){
        this.hotDrinks = hotDrinks;
    }

    public HotDrink getHotDrink(String name, double volume, double temperature){
        for (HotDrink hotDrink : hotDrinks) {
            if((hotDrink.get_name().equalsIgnoreCase(name)) && (hotDrink.get_volume() == volume) && (hotDrink.accessTemperature((Coffee)hotDrink) == temperature)){
                return (Coffee)hotDrink;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
