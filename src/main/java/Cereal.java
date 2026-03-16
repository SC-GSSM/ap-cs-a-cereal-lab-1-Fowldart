/**
 * Cereal.java
 *
 * @author – Your name
 * @author – Class period
 *
 */
public class Cereal
{
    // private instance variables to hold info about a cereal from the data set
    // the name, calories, fiber, carbohydrates, and cups
    private String name;
    private int calories;
    private int fiber;
    private int carbohydrates;
    private double cups;

    // constructor that creates a cereal object
    public Cereal(String name, int calories, int fiber, int carbohydrates, double cups){
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

    public int getCalories(){
        return calories;
    }

    public int getFiber(){
        return fiber;
    }

    public int getCarbohydrates(){
        return carbohydrates;
    }

    public double getCups(){
        return cups;
    }

    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */

    public String toString(){
        return "Cereal: " + name + " which has " + calories + " and " + fiber + " grams of fiber " + " and "
        + carbohydrates + " grams of carobhydrates in " + cups + " cups.";
    }

}


