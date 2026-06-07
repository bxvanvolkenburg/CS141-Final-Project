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

            handleChoice(choice, scanner);
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

    private static void handleChoice(String choice, Scanner scanner) {
        switch (choice) {
            case "1" -> {
                System.out.println("You selected navigation for jobs for women in STEM.");
                System.out.println("Top 3 Jobs for Women in STEM:");
                System.out.println("1. Software Engineer/Developer");
                System.out.println("2. Data Scientist / Data Analyst");
                System.out.println("3. Cybersecurity Specialist / Information Security Analyst");
            }
            case "2" -> {
                System.out.println("You selected scholarships for women in STEM.");
                handleScholarship(scanner);
            }
            case "3" -> {
                System.out.println("You selected educational resources for women in STEM.");
                System.out.println("Upcoming Conferences for Women in STEM:");
                System.out.println("1. Defcon Conference - Aug 6 - 9th, Las Vegas");
                System.out.println("2. The Global Women in Stem Leadership Summit - September 14 - 15, Atlanta");
                System.out.println("3. NSF Scholars Meeting - October 9-11th, DC");
                System.out.println("4. Society of Women Engineers - November 5-7th, Boston");
            }
            case "4" -> {
                System.out.println("You selected STEM clubs (SWE) (Join the EvCC STEM Club).");
                System.out.println("Contact Information:");
                System.out.println("Name: Kristine Washburn");
                System.out.println("Email: kwashburn@everettcc.edu");
            }
            case "5" -> {
                System.out.println("You selected support for women in STEM.");
                System.out.println("Girls Who Code: https://girlswhocode.com");
                System.out.println("American Association of University Women (AAUW): https://www.aauw.org");
            }
            default -> System.out.println("Invalid option. Please choose a number from 1 to 6 or q to quit.");
        }
    }

    private static void handleScholarship(Scanner scanner) {
        System.out.print("How many credits are you taking? ");
        try {
            int credits = Integer.parseInt(scanner.nextLine().trim());
            
            if (credits > 20) {
                System.out.println("Error: You cannot take more than 20 credits.");
            } else if (credits > 10) {
                System.out.println("You are eligible for the E-Stem Scholarship: $2500");
            } else {
                System.out.println("You are eligible for the E-Stem Scholarship: $1500");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number of credits.");
        }
    }
}
