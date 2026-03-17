import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CerealRunner
{
    // create a private instance variable to store an ArrayList of Cereal objects

    public CerealRunner(String fileName)
    {
        // instantiate the ArrayList
        ArrayList<Cereal> cereals = new ArrayList<Cereal>();

        try
        {
            FileReader fileRdr = new FileReader(fileName);
            Scanner scan = new Scanner(fileRdr);
            while(scan.hasNext())
            {
                String myStr = scan.nextLine();

                // use the split method to parse the data into an array of
                //   String objects
                String[] info = myStr.split(",");

                // go through each String array element and save it
                //   into the appropriate variable which will be used to
                //   create a Cereal object
                String name = info[0];
                double calories = Double.parseDouble(info[1]);
                double fiber = Double.parseDouble(info[2]);
                double carbohydrates = Double.parseDouble(info[3]);
                double cups = Double.parseDouble(info[4]);
                

                // create a new Cereal object, and add it to the ArrayList
                Cereal c = new Cereal(name, calories, fiber, carbohydrates, cups);
                cereals.add(c);

            }
            scan.close();


        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        int numCereals = cereals.size();
        System.out.println(numCereals + " records created.");
    }

    public static void main(String[] args)
    {
        String fileName = "src/data/cerealSubset.csv";
        CerealRunner cr = new CerealRunner(fileName);
    }

}

