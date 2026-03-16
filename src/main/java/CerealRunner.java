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
        ArrayList<Cereal> cerealList = new ArrayList<Cereal>();

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
                String calories = info[1];
                String fiber = info[2];
                String carbohydrates = info[3];
                String cups = info[4];
                

                // create a new Cereal object, and add it to the ArrayList
                Cereal c = new Cereal(name, calories, fiber, carbohydrates, cups);
                cerealList.add(c);

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

