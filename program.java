import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee("Latte", 1, 2);
        Coffee coffee2 = new Coffee("Cacao", 2, 4);
        Coffee coffee3 = new Coffee("Espresso", 3, 6);

        List<HotDrink> list = new ArrayList<>();
        list.add(coffee1);
        list.add(coffee2);
        list.add(coffee3);

        HotMachine hotMachine = new HotMachine(list);
        System.out.println("----------------------------");
        System.out.println(hotMachine.getHotDrink("Latte", 1, 2)); // Рабочая проверка
        System.out.println("-------------------------------");
        System.out.println(hotMachine.getHotDrink("Latte", 2, 2)); // Неправильные параметры
    }
}
