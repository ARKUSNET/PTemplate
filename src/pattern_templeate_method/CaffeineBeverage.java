package pattern_templeate_method;

/**
 * Created by a.kuspakov on 11.10.2016.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCap();
        addCondiments();
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    private void pourInCap() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

}
