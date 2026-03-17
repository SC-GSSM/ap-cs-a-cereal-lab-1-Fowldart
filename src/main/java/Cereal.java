/**
 * Cereal.java
 *
 * @author – William Phillips
 * @author – 8am
 *
 */
public class Cereal
{
    // private instance variables to hold info about a cereal from the data set
    // the name, calories, fiber, carbohydrates, and cups
    private String name;
    private String calories;
    private String fiber;
    private String carbohydrates;
    private String cups;

    // constructor that creates a cereal object
    public Cereal(String name, String calories, String fiber, String carbohydrates, String cups){
        this.name = name;
        this.calories = calories;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.cups = cups;
    }

    // accessor methods for each instance variable
    public void setName(String name){
        this.name = name;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public void setFiber(int fiber){
        this.fiber = fiber;
    }

    public void setCarbohydrates(int carbohydrates){
        this.carbohydrates = carbohydrates;
    }

    public void setCups(double cups){
        this.cups = cups;
    }

    public String getName(){
        return name;
    }

    public String getCalories(){
        return calories;
    }

    public String getFiber(){
        return fiber;
    }

    public String getCarbohydrates(){
        return carbohydrates;
    }

    public String getCups(){
        return cups;
    }

    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */

    public String toString(){
        return "Cereal: " + name + " which has " + calories + " and " + fiber + " grams of fiber " + " and "
        + carbohydrates + " grams of carobhydrates in " + cups + " cups.";
    }

}


