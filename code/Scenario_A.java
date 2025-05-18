public class Scenario_A{

    // Frequency bounds for each colour
    public static double[] ColourFrequencyBounds(String colour) {
        double[] result = null;
        
        colour = colour.toLowerCase(); // Convert the color name to lowercase
        
        switch (colour) {
            case "red":
                result = new double[]{400, 479};
                break;
            case "orange":
                result = new double[]{480, 509};
                break;
            case "yellow":
                result = new double[]{510, 529};
                break;
            case "green":
                result = new double[]{530, 599};
                break;
            case "cyan":
                result = new double[]{600, 619};
                break;
            case "blue":
                result = new double[]{620, 669};
                break;
            case "violet":
                result = new double[]{670, 790};
                break;
            default:
                throw new IllegalArgumentException("Please enter a valid colour name.");
        }
        
        return result;
    }

    // Converts frequency (THz) to wavelength (nm) using the formula
    public static double convertFrequencyToWavelength(double frequencyTHz) {
        if (frequencyTHz <= 0) {
            throw new IllegalArgumentException("Frequency must be positive");
        }
        double wavelength=300000 /  frequencyTHz;
        return wavelength;
    }

    // Converts wavelength (nm) to frequency (THz) using the formula
    public static double convertWavelengthToFrequency(double wavelengthNm) {
        if (wavelengthNm <= 0) {
            throw new IllegalArgumentException("Wavelength must be positive");
        }
        double frequency=300000 / wavelengthNm;
        return frequency;
    }

    // Check if a frequency is in the visible range of the electromagnetic spectrum
    public static String InRange(double frequencyTHz) {
   	 if (frequencyTHz < 0 || frequencyTHz > 30000) {
        	throw new IllegalArgumentException("Frequency must be between 0 and 30,000 THz.");
   	 }

   	 if (frequencyTHz >= 400 && frequencyTHz <= 790) {
        	return "The frequency entered lies within the Visible Light range (400–790 THz).";
   	 } else if (frequencyTHz >= 1 && frequencyTHz <= 399) {
        	return "The frequency entered lies within the Infrared (IR) range (1–399 THz), which is not visible to the human eye.";
   	 } else if (frequencyTHz >= 791 && frequencyTHz <= 30000) {
        	return "The frequency entered lies within the Ultraviolet (UV) range (791–30,000 THz), which is beyond the visible spectrum.";
   	 } else {
        	return "The frequency is out of the known electromagnetic range (1–30,000 THz).";
    }
}
    // Converts a frequency (THz) to its corresponding visible colour, or returns a message if it's outside the visible light range.
    public static String FrequencyToColour(double frequencyTHz) {
        if (frequencyTHz <= 0) {
            return "Please enter a positive frequency that is above zero.";
        }

        if (frequencyTHz >= 400 && frequencyTHz <= 479) {
            return "Colour: Red";
        } else if (frequencyTHz >= 480 && frequencyTHz <= 509) {
            return "Colour: Orange";
        } else if (frequencyTHz >= 510 && frequencyTHz <= 529) {
            return "Colour: Yellow";
        } else if (frequencyTHz >= 530 && frequencyTHz <= 599) {
            return "Colour: Green";
        } else if (frequencyTHz >= 600 && frequencyTHz <= 619) {
            return "Colour: Cyan";
        } else if (frequencyTHz >= 620 && frequencyTHz <= 669) {
            return "Colour: Blue";
        } else if (frequencyTHz >= 670 && frequencyTHz <= 790) {
            return "Colour: Violet";
        } else if (frequencyTHz < 400) {
            return "Too low — below red";
        } else {
            return "Too high — above violet";
        }
    }

    // Compares two frequencies to check if they produce the same or different colours
    public static String FrequencyComparison(double freq1, double freq2) {
        if (freq1 <= 0 || freq2 <= 0) {
            return "Please enter positive frequencies that are above zero.";
        }

        String colour1 = FrequencyToColour(freq1);
        String colour2 = FrequencyToColour(freq2);

        if (colour1.equals(colour2)) {
            return "The frequencies produce the same colour: " + colour1;
        } else if (colour1.contains("Too") || colour2.contains("Too")) {
            return "One or both frequencies are outside the visible range.";
        } else {
            return "The frequencies produce different colours: " + colour1 + " and " + colour2 + ".";
        }
    }
}

