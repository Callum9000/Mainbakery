import java.util.List;
import java.util.ArrayList;

public class Inventory extends Products {
    public static void main(String[] args) {
        Singleton ingredient_list = Singleton.getInstance();
        ingredient_list = new ArrayList<String>();
        ingredient_list.add("1");
        System.out.println(ingredient_list);
    }
}

