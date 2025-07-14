// JobApplication.java
import java.util.Scanner;

public class JobApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== R Job Finder Application Form ===\n");

        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dob = input.nextLine();

        String[] educationLevels = {
            "Uneducated", "Primary School", "Secondary School",
            "High School Diploma", "Undergraduate", "Bachelor's Degree",
            "Master's Degree", "PhD or Doctorate"
        };

        System.out.println("\nSelect your level of education:");
        for (int i = 0; i < educationLevels.length; i++) {
            System.out.println((i + 1) + ". " + educationLevels[i]);
        }
        System.out.print("Enter your choice (1-" + educationLevels.length + "): ");
        int eduChoice = input.nextInt();
        input.nextLine(); // consume newline

        String educationLevel = (eduChoice >= 1 && eduChoice <= educationLevels.length) ?
                educationLevels[eduChoice - 1] : "Invalid Selection";

        String fieldOfStudy = "N/A";
        if (!educationLevel.equals("Uneducated") && !educationLevel.equals("Invalid Selection")) {
            System.out.print("Enter your field of study: ");
            fieldOfStudy = input.nextLine();
        }

        System.out.println("\nPreferred Job Type:");
        System.out.println("1. Online/Remote\n2. Physical/In-Person");
        System.out.print("Enter your choice (1 or 2): ");
        int jobTypeChoice = input.nextInt();
        input.nextLine();
        String jobType = (jobTypeChoice == 1) ? "Remote" : "Physical";

        String region = "Global";
        if (jobType.equals("Remote")) {
            String[] regions = {"Africa", "Europe", "North America", "South America", "Asia", "Australia"};
            System.out.println("\nSelect your preferred region:");
            for (int i = 0; i < regions.length; i++) {
                System.out.println((i + 1) + ". " + regions[i]);
            }
            System.out.print("Enter your choice (1-" + regions.length + "): ");
            int regionChoice = input.nextInt();
            input.nextLine();
            if (regionChoice >= 1 && regionChoice <= regions.length) {
                region = regions[regionChoice - 1];
            }
        }

        System.out.println("\n--- Application Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Education Level: " + educationLevel);
        if (!educationLevel.equals("Uneducated") && !educationLevel.equals("Invalid Selection")) {
            System.out.println("Field of Study: " + fieldOfStudy);
            System.out.println("* Please upload your last result and CV to proceed *");
        }
        System.out.println("Preferred Job Type: " + jobType);
        if (jobType.equals("Remote")) {
            System.out.println("Region: " + region);
        }

        // Simulate matched jobs (mocked)
        System.out.println("\n--- Recommended Job Matches ---");
        if (educationLevel.equals("Uneducated")) {
            if (jobType.equals("Remote")) {
                System.out.println("- Online Task Worker (Remote) – www.remotasks.com");
            } else {
                System.out.println("- Manual Laborer (On-site) – www.indeed.com");
            }
        } else if (!educationLevel.equals("Invalid Selection")) {
            System.out.println("- Matched job listings based on your qualifications and field of study will appear here.");
            System.out.println("* Sample: Research Assistant, Admin Officer, Software Tester, etc.");
        } else {
            System.out.println("No jobs found for invalid education level.");
        }

        System.out.println("\nThank you for applying with R Job Finder!");
        input.close();
    }
}
