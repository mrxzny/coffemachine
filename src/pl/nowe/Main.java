package pl.nowe;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        //Cups
        /*System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(cups * 200 + " ml of water");
        System.out.println(cups * 50 + " ml of milk");
        System.out.println(cups * 15 + " g of coffee beans");
        */

        int coffe_count = 0;

        System.out.println("Write how many ml of water the coffee machine has: ");

        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has: ");

        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");

        int gram = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");

        int cups = scanner.nextInt();

        while (water >= 200 && milk >= 50 && gram >=15){
            water -= 200;
            milk  -= 50;
            gram  -= 15;
            coffe_count ++;
        }
        int diff = coffe_count - cups;
        if ((coffe_count > cups || coffe_count == cups) && diff == 0) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (coffe_count > cups || coffe_count == cups){
            System.out.println("Yes, I can make that amount of coffee (and even " + diff+ " more than that)");
        } else {
            System.out.println("No, I can make only " + coffe_count + " cup(s) of coffee");
        }
    }
}