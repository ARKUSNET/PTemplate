package pattern_templeate_method.pattern_with_hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by a.kuspakov on 11.10.2016.
 */
public abstract class CoffeeBeverageWithHook {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    public abstract void brew();
    public abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Boiling water");
    }

    private void boilWater() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        String answer = null;

        System.out.println("Would you like mild and sugar with your coffee (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        } catch(IOException ioe){
            System.out.println("IO error trying to read your answer");
        }
        if(answer == null){
            return "no";
        }
        return  answer;
    }
}