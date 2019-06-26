import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    //Creates an ArrayList which stores the number of tiramisu needed for each restaurant with the corresponding restaurant numerical ID
    //It also contains a method in which the total numbers inputted are added together and returned
    public static int amountOfTiramisu(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        //Allows the user to input characters into the program
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Creates an object from class Worker
        Worker worker = new Worker();

        //FOOD PROVIDER
        System.out.println("Food Provider, please enter the number of restaurants: ");
        //Checks if input is a valid integer
        while (!reader.hasNextInt()) {
            System.out.println("Please input a valid number");
            reader.nextLine();
        }

        //User inputs a number of restaurants
        int restaurant = Integer.parseInt(reader.nextLine());

        System.out.println("Please enter the number of portions of tiramisu ordered for each restaurant: ");
        //Checks if input is a valid integer
        while (!reader.hasNextInt()) {
            System.out.println("Please input a valid number");
            reader.nextLine();
        }

        int i;
        for (i = 1; i <= restaurant; i++) {
            //The number of portions for each restaurant are added to the amountOfTiramisu ArrayList
            int order = Integer.parseInt(reader.nextLine());
            System.out.println("Restaurant " + i + ": " + order);
            list.add(order);
        }

        //The sum of the amount of tiramisu from each restaurant is stored in the total variable and then displayed in the console
        int total = amountOfTiramisu(list);
        worker.totalTiramisu(total);
        //The amount of eggs are calculated and displayed in the console
        worker.amountOfEggs(total);

        //CHEF
        System.out.println("Chef, what restaurant number are you from?");
        //Checks if input is a valid integer
        while (!reader.hasNextInt()) {
            System.out.println("Please input a valid number");
            reader.nextLine();
        }

        //User inputs a number which corresponds with the restaurant ID
        int chefNumber = Integer.parseInt(reader.nextLine());
        //This variable retrieves the value stored in the ArrayList by inputting the number used for the restaurant ID
        int retrieve = list.get(chefNumber - 1);
        //The amount of eggs the chef will need for that particular restaurant is displayed in the console
        worker.amountOfEggs(retrieve);
    }
}
