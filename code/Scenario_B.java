public class Scenario_B {

    // Finds a stone when a colour is given
    public static String getStone(String colour) {
        switch (colour.toLowerCase()) {
            case "red"
                return "The stone that matches your colour, Red, is Garnet.";
            case "orange":
                return "The stone that matches your colour, Orange, is Moonstone.";
            case "yellow":
                return "The stone that matches your colour, Yellow, is Topaz.";
            case "green":
                return "The stone that matches your colour, Green, is Emerald.";
            case "cyan":
                return "The stone that matches your colour, Cyan, is Turquoise.";
            case "blue":
                return "The stone that matches your colour, Blue, is Opal.";
            case "violet":
                return "The stone that matches your colour, Violet, is Amethyst.";
            default:
                return "Unknown colour. Please enter a valid colour name!";
        }
    }

    // Finds the musical note for the specific color
    public static String getNote(String colour) {
        switch (colour.toLowerCase()) {
            case "red":
                return "The musical note that matches your colour, Red, is C.";
            case "orange":
                return "The musical note that matches your colour, Orange, is D.";
            case "yellow":
                return "The musical note that matches your colour, Yellow, is E.";
            case "green":
                return "The musical note that matches your colour, Green, is F.";
            case "cyan":
                return "The musical note that matches your colour, Cyan, is G.";
            case "blue":
                return "The musical note that matches your colour, Blue, is A.";
            case "violet":
                return "The musical note that matches your colour, Violet, is B.";
            default
                return "Unknown colour. Please enter a valid colour name!";
        }
    }

    // Finds the matching emotion for the specific color
    public static String getEmotion(String colour) {
        switch (colour.toLowerCase()) {
            case "red":
                return "The emotion that matches your colour, Red, is Confidence.";
            case "orange":
                return "The emotion that matches your colour, Orange, is Happiness.";
            case "yellow":
                return "The emotion that matches your colour, Yellow, is Happiness.";
            case "green":
                return "The emotion that matches your colour, Green, is Peacefulness.";
            case "cyan":
                return "The emotion that matches your colour, Cyan, is Calm.";
            case "blue":
                return "The emotion that matches your colour, Blue, is Calm.";
            case "violet":
                return "The emotion that matches your colour, Violet, is Sadness.";
            default:
                return "Unknown colour. Please enter a valid colour name!";
        }
    }
}
