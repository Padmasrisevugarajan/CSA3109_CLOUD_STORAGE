import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {

    private static List<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[]args) {
        displayMenu();
    }

    public static void displayMenu() {
        while (true) {
            System.out.println("+--------------------------------------+");
            System.out.println("| Task Manager                            |");
            System.out.println("+--------------------------------------+");

            if (tasks.isEmpty()) {
                System.out.println("|                                      |");
            } else {
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println("| - " + tasks.get(i) + "                          |");
                }
                System.out.println("|                                      |");
            }

            System.out.println("| + Add Task                            |");
            System.out.println("|                                      |");
            System.out.println("| Title: [_______________________]       |");
            System.out.println("| Description: [_______________________] |");
            System.out.println("+--------------------------------------+");

            System.out.println("Enter your choice: (a) Add Task, (q) Quit");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("a")) {
                addTask();
            } else if (choice.equalsIgnoreCase("q")) {
                System.out.println("Exiting Task Manager.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        tasks.add(title); // For simplicity, we only add the title
        System.out.println("Task added.");
    }
}
