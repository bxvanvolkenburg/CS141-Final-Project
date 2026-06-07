import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            System.out.print("Choose an option (or q to quit): ");
            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("q") || choice.equals("6")) {
                System.out.println("Exiting. Goodbye!");
                break;
            }

            handleChoice(choice);
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("1. Navigation for jobs for women in STEM");
        System.out.println("2. Scholarships for women in STEM");
        System.out.println("3. Educational resources for women in STEM");
        System.out.println("4. STEM clubs (SWE) (Join the EvCC STEM Club)");
        System.out.println("5. Support for women in STEM");
        System.out.println("6. Exit");
    }

    private static void handleChoice(String choice) {
        switch (choice) {
            case "1" -> System.out.println("You selected navigation for jobs for women in STEM.");
            case "2" -> System.out.println("You selected scholarships for women in STEM.");
            case "3" -> System.out.println("You selected educational resources for women in STEM.");
            case "4" -> System.out.println("You selected STEM clubs (SWE) (Join the EvCC STEM Club).");
            case "5" -> {
                System.out.println("You selected support for women in STEM.");
                System.out.println("Girls Who Code: https://girlswhocode.com");
                System.out.println("American Association of University Women (AAUW): https://www.aauw.org");
            }
            default -> System.out.println("Invalid option. Please choose a number from 1 to 6 or q to quit.");
        }
    }
}
