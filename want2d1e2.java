import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class want2d1e2 {

    static ArrayList<String> protein = new ArrayList<String>(
            Arrays.asList("Chicken", "Fish", "Beef", "Tofu", "Soybeans"));
    static ArrayList<String> carbohydrates = new ArrayList<String>(
            Arrays.asList("Steamed rice", "Bread", "Noodles", "Potatoes", "Corn"));
    static ArrayList<String> fibre = new ArrayList<String>(
            Arrays.asList("Water spinach", "Carrots", "Broccoli", "Cabbage", "Kale"));
    static ArrayList<String> Vitamin = new ArrayList<String>(
            Arrays.asList("Orange", "Apple", "Banana", "Mango", "Watermelon"));
    static ArrayList<String> fat = new ArrayList<String>(
            Arrays.asList("Olive oil", "Coconut oil", "Peanut butter", "Coconut milk", "Avocado"));
    static boolean running = true;
    static boolean running3 = true;

    private static void manageFoodList(ArrayList<String> foodList, String foodType) {
        Scanner sc = new Scanner(System.in);
        running = true;
        while (running) {
            System.out.println("====Edit Data====");
            System.out.println("=+=+=Enter Number 1 - 4=+=+=");
            System.out.println(" 1 : Add Data");
            System.out.println(" 2 : Remove Data");
            System.out.println(" 3 : Change Data");
            System.out.println(" 4 : Return to Menu");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("=== What did you want to add in " + foodType + " === ");
                    String itemToAdd = sc.nextLine();
                    foodList.add(itemToAdd);
                    System.out.println("Updated list of " + foodType + ":");
                    for (String item : foodList) {
                        System.out.print("(" + item + ") ");
                    }
                    System.out.println("\n");
                    break;

                case 2:
                System.out.println("=== What did you want to delete " + foodType + " ===");
                String itemToRemove = sc.nextLine();

                System.out.println("Are you sure you want to delete " + itemToRemove + "? (yes/no)");
                String confirm = sc.nextLine();
                
                if (confirm.equalsIgnoreCase("yes")) {
                    if (foodList.remove(itemToRemove)) {
                        System.out.println(foodType + " Removed Successfully.");
                    } else {
                        System.out.println(foodType + " Not found.");
                    }
                    System.out.println("=== Updated list of " + foodType + " ===");
                    for (String item : foodList) {
                        System.out.print("(" + item + ") ");
                    }
                    System.out.println("\n");
                } else {
                    System.out.println("Deletion cancelled.");
                }
                break;
                case 3:
                    System.out.println("=== What menu do you want to change?" + foodType+" ===");
                    String itemToEdit = sc.nextLine();
                    if (foodList.contains(itemToEdit)) {
                        System.out.print("Change to ");
                        String newItemName = sc.nextLine();
                        foodList.set(foodList.indexOf(itemToEdit), newItemName);
                        System.out.println("Updated list of " + foodType + ":");
                        for (String item : foodList) {
                            System.out.print("(" + item + ") ");
                        }
                        System.out.println("\n");
                    } else {
                        System.out.println(foodType + "=== Not Found ===");
                    }
                    break;

                case 4:
                    System.out.println("=== Return to Menu ===");
                    running = false;
                    break;

                default:
                    System.out.println("=== Sorry we don't get it ===");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        running3 = true;
        while (running3) {
            System.out.println("=== Enter the food group you want to view ===");
            System.out.println(" 1 : Protein");
            System.out.println(" 2 : Carbohydrates");
            System.out.println(" 3 : Fibre");
            System.out.println(" 4 : Vitamin");
            System.out.println(" 5 : Fat");
            System.out.println(" 6 : Exit the Program ");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 1:
                    System.out.println("=== List of Proteins ===");
                    for (String item : protein) {
                        System.out.print("(" + item + ") ");
                    }
                    System.out.println("\n");
                    manageFoodList(protein, "=== Protein ===");
                    break;
                case 2:
                    System.out.println("=== List of Carbohydrates ===");
                    for (String item : carbohydrates) {
                        System.out.print("(" + item + ") ");
                    }
                    System.out.println("\n");
                    manageFoodList(carbohydrates, "=== Carbohydrates ===");
                    break;
                case 3:
                    System.out.println("=== List of Fibre ===");
                    for (String item : fibre) {
                        System.out.print("(" + item + ") ");
                    }
                    System.out.println("\n");
                    manageFoodList(fibre, "=== Fibre ===");
                    break;
                case 4:
                    System.out.println("=== List of Fruits ===");
                    for (String item : Vitamin) {
                        System.out.print("(" + item + ") ");
                    }
                    System.out.println("\n");
                    manageFoodList(Vitamin, "=== Fruits ===");
                    break;
                case 5:
                    System.out.println("=== List of Fat ===");
                    for (String item : fat) {
                        System.out.print("(" + item + ") ");
                    }
                    System.out.println("\n");
                    manageFoodList(fat, "=== Fat ===");
                    break;
                case 6:
                    System.out.println("=== End of Program ===");
                    running3 = false;
                    break;
                default:
                    System.out.println("=== Sorry, we don't get it ===");
                    break;
            }
        }
    }
}