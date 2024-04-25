import java.util.Scanner;

public class Power {
    public static void FTP () {
        Scanner scanner = new Scanner(System.in);

        String selection = "";
        int power = 0;
        int FTP;

        System.out.println("Enter your best 20 minute power: ");
            try {
                power = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input");
            }

            FTP = (int) (power * 0.95);
            System.out.println("Your FTP is " + FTP);
            System.out.println("Zone 1: " + (int) (FTP * 0) + " - " + (int) (FTP * 0.55));
            System.out.println("Zone 2: " + (int) (FTP * 0.55) + " - " + (int) (FTP * 0.75));
            System.out.println("Zone 3: " + (int) (FTP * 0.75) + " - " + (int) (FTP * 0.87));
            System.out.println("Zone 4: " + (int) (FTP * 0.87) + " - " + (int) (FTP * 0.94));
            System.out.println("Zone 5: " + (int) (FTP * 0.94) + " - " + (int) (FTP * 1.05));
            System.out.println("Zone 6: " + (int) (FTP * 1.05) + " - " + (int) (FTP * 1.20));
            System.out.println("Zone 7: " + (int) (FTP * 1.20) + " - " + (int) (FTP * 1.25));
            System.out.println("Would you like to do something else?: ");
            while (true) {
                selection = scanner.nextLine();
                if (selection.equalsIgnoreCase("yes") || selection.equalsIgnoreCase("y")){
                    System.out.println("What would you like to do?");
                    selection = scanner.nextLine();
                    if (selection.equalsIgnoreCase("calculate ftp") || (selection.equalsIgnoreCase("calculate functional threshold power")) || 
                    (selection.equalsIgnoreCase("ftp")) || (selection.equalsIgnoreCase("functional threshold power"))) {
                        Power.FTP();
                    } 
                }
            scanner.close();
        }
    }
}

