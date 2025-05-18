import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        try {
            do {
                System.out.println("\n===== Colour & Frequency Interactive Menu =====");
                System.out.println("1. Get Frequency Bounds for a Colour");
                System.out.println("2. Convert Frequency to Wavelength");
                System.out.println("3. Convert Wavelength to Frequency");
                System.out.println("4. Check if a Frequency is in Visible Range");
                System.out.println("5. Convert Frequency to Colour");
                System.out.println("6. Compare Two Frequencies");
                System.out.println("7. Get Stone for a Colour");
                System.out.println("8. Get Musical Note for a Colour");
                System.out.println("9. Get Emotion for a Colour");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                    System.out.print("Enter a colour: ");
                    String colour = scanner.nextLine();
                    try {
                        double[] bounds = Scenario_A.ColourFrequencyBounds(colour);
                        System.out.println(colour + " frequency bounds: " + bounds[0] + " THz to " + bounds[1] + " THz");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter frequency in THz: ");
                    if (scanner.hasNextDouble()) {  // Check if the input is a valid number
                        double freq = scanner.nextDouble();
                        try {
                            double wavelength = Scenario_A.convertFrequencyToWavelength(freq);
                            System.out.println("Wavelength: " + wavelength + " nm");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a numeric frequency value.");
                        scanner.nextLine();  
                    }
                    break;

                case 3:
                    System.out.print("Enter wavelength in nm: ");
                    if (scanner.hasNextDouble()) {  
                        double wavelength = scanner.nextDouble();
                        try {
                            double frequency = Scenario_A.convertWavelengthToFrequency(wavelength);
                            System.out.println("Frequency: " + frequency + " THz");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a numeric wavelength value.");
                        scanner.nextLine();  
                    }
                    break;

                case 4:
                    System.out.print("Enter frequency in THz: ");
                    if (scanner.hasNextDouble()) {
                        double checkFreq = scanner.nextDouble();
                        try {
                            String rangeResult = Scenario_A.InRange(checkFreq);
                            System.out.println(rangeResult);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a numeric frequency value.");
                        scanner.nextLine(); // Clear the invalid input
                    }
                    break;

                case 5:
                    System.out.print("Enter frequency in THz: ");
                    if (scanner.hasNextDouble()) {
                        double freqToColour = scanner.nextDouble();
                        try {
                            String colourResult = Scenario_A.FrequencyToColour(freqToColour);
                            System.out.println(colourResult);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a numeric frequency value.");
                        scanner.nextLine(); // Clear invalid input
                    }
                    break;

                case 6:
                    try {
                        System.out.print("Enter first frequency in THz: ");
                        double firstFrequencyInput = scanner.nextDouble();
                        scanner.nextLine(); // clear newline

                        System.out.print("Enter second frequency in THz: ");
                        double secondFrequencyInput = scanner.nextDouble();
                        scanner.nextLine(); // clear newline

                        String comparisonMessage = Scenario_A.FrequencyComparison(firstFrequencyInput, secondFrequencyInput);
                        System.out.println(comparisonMessage);
                    } catch (Exception e) {
                        System.out.println("Error: Please enter valid numeric values for both frequencies.");
                        scanner.nextLine(); // clear invalid input
                    }
                    break;

                    case 7:
                    try {
                        System.out.print("Enter a colour: ");
                        String stoneColour = scanner.nextLine();

                        String stoneResult = Scenario_B.getStone(stoneColour);
                        System.out.println(stoneResult);
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a valid colour.");
                    }
                    break;


                case 8:
                    try {
                        System.out.print("Enter a colour: ");
                        String noteColour = scanner.nextLine();
                        String noteResult = Scenario_B.getNote(noteColour);
                        System.out.println(noteResult);
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a valid colour.");
                    }
                    break;
                case 9:
                    try {
                        System.out.print("Enter a colour: ");
                        String emotionColour = scanner.nextLine().trim();

                        String emotionResult = Scenario_B.getEmotion(emotionColour);
                        System.out.println(emotionResult);
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a valid colour.");
                    }
                    break;

                    case 0:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 0);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer (0-9).");
        }  
        
        scanner.close();
    }
}
