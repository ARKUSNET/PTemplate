package pattern_templeate_method.pattern_with_hook;

/**
 * Created by a.kuspakov on 11.10.2016.
 */
public class CoffeeWithHook extends CoffeeBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}