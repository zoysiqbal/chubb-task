import java.util.ArrayList;

public class Worker {
    private int tiramisu;
    private int eggs;
    private int total;

    public Worker() {
        this.tiramisu = tiramisu;
        this.eggs = eggs;
        this.total = total;
    }


    public void totalTiramisu(int total) {
        //This method displays the sum of all the tiramisus ordered from each restaurant
        System.out.println("The total number of tiramisu ordered: " + total);
    }

    public void amountOfEggs(int tiramisu) {
        //This method calculates and displays the amount of eggs needed for both the Food Provider and the Chef
        eggs = tiramisu * 3;
        System.out.println("You will need " + eggs + " eggs");
    }

}