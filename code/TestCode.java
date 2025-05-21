public class TestCode {

    public static void main(String[] args) {
        TestColourFrequencyBounds();
        TestconvertFrequencyToWavelength();
        TestconvertWavelengthToFrequency();
        TestInRange();
        TestFrequencyToColour();
        TestFrequencyComparison();
        TestgetStone();
        TestgetNote();
        TestgetEmotion();
    }
	
    //Test to check frequency bounds for a given colour
    public static void TestColourFrequencyBounds() {
        try {
            assert "The frequency bounds for Red are: 400 THz to 479 THz".equals(Scenario_A.ColourFrequencyBounds("red")) : "Red bounds not matching";
            assert "The frequency bounds for Orange are: 480 THz to 509 THz".equals(Scenario_A.ColourFrequencyBounds("Orange")) : "Orange bounds not matching";
            assert "The frequency bounds for Yellow are: 510 THz to 529 THz".equals(Scenario_A.ColourFrequencyBounds("YELLOW")) : "Yellow bounds not matching";
            assert "The frequency bounds for Green are: 530 THz to 599 THz".equals(Scenario_A.ColourFrequencyBounds("Green")) : "Green bounds not matching";
            assert "The frequency bounds for Cyan are: 600 THz to 619 THz".equals(Scenario_A.ColourFrequencyBounds("cyan")) : "Cyan bounds not matching";
            assert "The frequency bounds for Blue are: 620 THz to 669 THz".equals(Scenario_A.ColourFrequencyBounds("blue")) : "Blue bounds not matching";
            assert "The frequency bounds for Violet are: 670 THz to 790 THz".equals(Scenario_A.ColourFrequencyBounds("Violet")) : "Violet bounds not matching";
            assert "Please enter a valid colour name.".equals(Scenario_A.ColourFrequencyBounds("white")) : "Invalid colour check failed (white)";
            assert "Please enter a valid colour name.".equals(Scenario_A.ColourFrequencyBounds("")) : "Invalid colour check failed (empty)";
            assert "Please enter a valid colour name.".equals(Scenario_A.ColourFrequencyBounds("Soysa")) : "Invalid colour check failed (Soysa)";
            System.out.println("[PASS] TestColourFrequencyBounds");
        } catch (AssertionError e) {
            System.out.println("[FAIL] TestColourFrequencyBounds - " + e.getMessage());
        }
    }
	
    //Test to check if frequency to wavelength converstion works properly
    public static void TestconvertFrequencyToWavelength() {
        try {
            assert "Wavelength: 537.6344086021505 nm".equals(Scenario_A.convertFrequencyToWavelength(558)) : "Incorrect wavelength for 558 THz";
            assert "Wavelength: 1.0 nm".equals(Scenario_A.convertFrequencyToWavelength(300000)) : "Incorrect wavelength for 300000 THz";
            assert "Wavelength: 300000.0 nm".equals(Scenario_A.convertFrequencyToWavelength(1)) : "Incorrect wavelength for 1 THz";

            try {
                Scenario_A.convertFrequencyToWavelength(0);
                System.out.println("[FAIL] TestconvertFrequencyToWavelength - Did not throw for 0");
            } catch (IllegalArgumentException e) {
                assert "Frequency must be positive".equals(e.getMessage()) : "Wrong exception message for freq 0";
            }

            try {
                Scenario_A.convertFrequencyToWavelength(-1);
                System.out.println("[FAIL] TestconvertFrequencyToWavelength - Did not throw for -1");
            } catch (IllegalArgumentException e) {
                assert "Frequency must be positive".equals(e.getMessage()) : "Wrong exception message for freq -1";
            }

            System.out.println("[PASS] TestconvertFrequencyToWavelength");
        } catch (AssertionError e) {
            System.out.println("[FAIL] TestconvertFrequencyToWavelength - " + e.getMessage());
        }
    }
	
    //Test to check if wavelenght to frequency conversion functions as said the the testing tables
    public static void TestconvertWavelengthToFrequency() {
        try {
            assert "Frequency: 537.6344086021505 THz".equals(Scenario_A.convertWavelengthToFrequency(558)) : "Incorrect frequency for 558 nm";
            assert "Frequency: 300000.0 THz".equals(Scenario_A.convertWavelengthToFrequency(1)) : "Incorrect frequency for 1 nm";
            assert "Frequency: 1.0 THz".equals(Scenario_A.convertWavelengthToFrequency(300000)) : "Incorrect frequency for 300000 nm";

            try {
                Scenario_A.convertWavelengthToFrequency(0);
                System.out.println("[FAIL] TestconvertWavelengthToFrequency - Did not throw for 0");
            } catch (IllegalArgumentException e) {
                assert "Wavelength must be positive".equals(e.getMessage()) : "Wrong exception message for wavelength 0";
            }

            try {
                Scenario_A.convertWavelengthToFrequency(-50);
                System.out.println("[FAIL] TestconvertWavelengthToFrequency - Did not throw for -50");
            } catch (IllegalArgumentException e) {
                assert "Wavelength must be positive".equals(e.getMessage()) : "Wrong exception message for wavelength -50";
            }

            System.out.println("[PASS] TestconvertWavelengthToFrequency");
        } catch (AssertionError e) {
            System.out.println("[FAIL] TestconvertWavelengthToFrequency - " + e.getMessage());
        }
    }
	
    //To check the range of which a frequency falls into in the known EMS 
    public static void TestInRange() {
        try {
            assert "The frequency entered lies within the Visible Light range (400–790 THz).".equals(Scenario_A.InRange(500)) : "500 THz should be visible";
            assert "The frequency entered lies within the Infrared (IR) range (1–399 THz), which is not visible to the human eye.".equals(Scenario_A.InRange(1)) : "1 THz should be IR";
            assert "The frequency entered lies within the Ultraviolet (UV) range (791–30,000 THz), which is beyond the visible spectrum.".equals(Scenario_A.InRange(30000)) : "30000 THz should be UV";
            assert "The frequency is out of the known electromagnetic range (1–30,000 THz).".equals(Scenario_A.InRange(0)) : "0 should be out of range";
            assert "Frequency must be between 0 and 30,000 THz.".equals(Scenario_A.InRange(-1)) : "-1 should throw bounds error";
            assert "Frequency must be between 0 and 30,000 THz.".equals(Scenario_A.InRange(30001)) : "30001 should throw bounds error";
            System.out.println("[PASS] TestInRange");
        } catch (AssertionError e) {
            System.out.println("[FAIL] TestInRange - " + e.getMessage());
        }
    }
	
    //Tests whether the code gives the correct colour matching for a given frequency
    public static void TestFrequencyToColour() {
        try {
            assert "Red".equals(Scenario_A.FrequencyToColour(450)) : "450 THz should be Red";
            assert "Orange".equals(Scenario_A.FrequencyToColour(507)) : "507 THz should be Orange";
            assert "Yellow".equals(Scenario_A.FrequencyToColour(520)) : "520 THz should be Yellow";
            assert "Green".equals(Scenario_A.FrequencyToColour(570)) : "570 THz should be Green";
            assert "Cyan".equals(Scenario_A.FrequencyToColour(610)) : "610 THz should be Cyan";
            assert "Blue".equals(Scenario_A.FrequencyToColour(635)) : "635 THz should be Blue";
            assert "Violet".equals(Scenario_A.FrequencyToColour(790)) : "790 THz should be Violet";
            assert "Please enter a positive frequency that is above zero.".equals(Scenario_A.FrequencyToColour(-1)) : "Negative frequency not handled";
            assert "Please enter a positive frequency that is above zero.".equals(Scenario_A.FrequencyToColour(0)) : "Zero frequency not handled";
            assert "Too low — below red".equals(Scenario_A.FrequencyToColour(200)) : "200 THz should be below red";
            assert "Too high — above violet".equals(Scenario_A.FrequencyToColour(791)) : "791 THz should be above violet";
            System.out.println("[PASS] TestFrequencyToColour");
        } catch (AssertionError e) {
            System.out.println("[FAIL] TestFrequencyToColour - " + e.getMessage());
        }
    }
	
    //Tests whether two frequencies are the same,different or outside the visible range according to the inputs
    public static void TestFrequencyComparison() {
        try {
            assert "The frequencies produce the same colour: Blue".equals(Scenario_A.FrequencyComparison(621, 660)) : "621 & 660 should be Blue";
            assert "One or both frequencies are outside the visible range.".equals(Scenario_A.FrequencyComparison(440, 1)) : "1 THz is IR";
            assert "The frequencies produce different colours: Red and Blue.".equals(Scenario_A.FrequencyComparison(450, 650)) : "450 & 650 should be Red and Blue";
            assert "One or both frequencies are outside the visible range.".equals(Scenario_A.FrequencyComparison(1, 791)) : "1 & 791 are out";
            assert "One or both frequencies are outside the visible range.".equals(Scenario_A.FrequencyComparison(2, 399)) : "Both are IR";
            assert "One or both frequencies are outside the visible range.".equals(Scenario_A.FrequencyComparison(800, 1000)) : "Both UV";
            assert "Please enter positive frequencies that are above zero.".equals(Scenario_A.FrequencyComparison(-1, 500)) : "-1 not valid";
            assert "Please enter positive frequencies that are above zero.".equals(Scenario_A.FrequencyComparison(500, -1)) : "-1 not valid";
            assert "Please enter positive frequencies that are above zero.".equals(Scenario_A.FrequencyComparison(-1, 0)) : "-1 & 0 not valid";
            System.out.println("[PASS] TestFrequencyComparison");
        } catch (AssertionError e) {
            System.out.println("[FAIL] TestFrequencyComparison - " + e.getMessage());
        }
    }
	
    // Tests whether the correct stone is returned for valid colours
    public static void TestgetStone() {
        try {
            assert "The stone that matches your colour, Red, is Garnet.".equalsIgnoreCase(Scenario_B.getStone("red")) : "Stone for Red wrong";
            assert "The stone that matches your colour, Orange, is Moonstone.".equalsIgnoreCase(Scenario_B.getStone("Orange")) : "Stone for Orange wrong";
            assert "The stone that matches your colour, Yellow, is Topaz.".equalsIgnoreCase(Scenario_B.getStone("yellow")) : "Stone for Yellow wrong";
            assert "The stone that matches your colour, Green, is Emerald.".equalsIgnoreCase(Scenario_B.getStone("GREEN")) : "Stone for Green wrong";
            assert "The stone that matches your colour, Cyan, is Turquoise.".equalsIgnoreCase(Scenario_B.getStone("cyan")) : "Stone for Cyan wrong";
            assert "The stone that matches your colour, Blue, is Opal.".equalsIgnoreCase(Scenario_B.getStone("Blue")) : "Stone for Blue wrong";
            assert "The stone that matches your colour, Violet, is Amethyst.".equalsIgnoreCase(Scenario_B.getStone("VIOLET")) : "Stone for Violet wrong";
            assert "Unknown colour. Please enter a valid colour name!".equalsIgnoreCase(Scenario_B.getStone("cya")) : "Invalid cyan spelling not handled";
            assert "Unknown colour. Please enter a valid colour name!".equalsIgnoreCase(Scenario_B.getStone("white")) : "Invalid colour check failed(white)";
            assert "Unknown colour. Please enter a valid colour name!".equalsIgnoreCase(Scenario_B.getStone("")) : "Empty input not handled";
            System.out.println("[PASS] TestgetStone");
        } catch (AssertionError e) {
            System.out.println("[FAIL] TestgetStone - " + e.getMessage());
        }
    }
	
    // Tests whether the correct note is returned for valid colours
    public static void TestgetNote() {
        try {
            assert "The musical note that matches your colour, Red, is C.".equalsIgnoreCase(Scenario_B.getNote("red")) : "Note for Red wrong";
            assert "The musical note that matches your colour, Orange, is D.".equalsIgnoreCase(Scenario_B.getNote("Orange")) : "Note for Orange wrong";
            assert "The musical note that matches your colour, Yellow, is E.".equalsIgnoreCase(Scenario_B.getNote("Yellow")) : "Note for Yellow wrong";
            assert "The musical note that matches your colour, Green, is F.".equalsIgnoreCase(Scenario_B.getNote("Green")) : "Note for Green wrong";
            assert "The musical note that matches your colour, Cyan, is G.".equalsIgnoreCase(Scenario_B.getNote("CYAN")) : "Note for Cyan wrong";
            assert "The musical note that matches your colour, Blue, is A.".equalsIgnoreCase(Scenario_B.getNote("Blue")) : "Note for Blue wrong";
            assert "The musical note that matches your colour, Violet, is B.".equalsIgnoreCase(Scenario_B.getNote("Violet")) : "Note for Violet wrong";
            assert "Unknown colour. Please enter a valid colour name!".equalsIgnoreCase(Scenario_B.getNote("viole")) : "Invalid violet spelling not handled";
            assert "Unknown colour. Please enter a valid colour name!".equalsIgnoreCase(Scenario_B.getNote("white")) : "Invalid colour check failed(white)";
            assert "Unknown colour. Please enter a valid colour name!".equalsIgnoreCase(Scenario_B.getNote("")) : "Empty input not handled";
            System.out.println("[PASS] TestgetNote");
        } catch (AssertionError e) {
            System.out.println("[FAIL] TestgetNote - " + e.getMessage());
        }
    }
	
    // Tests whether the correct emotion is returned for valid colours
    public static void TestgetEmotion() {
        try {
            assert "The emotion that matches your colour, Red, is Confidence.".equals(Scenario_B.getEmotion("Red")) : "Emotion for Red wrong";
            assert "The emotion that matches your colour, Orange, is Happy.".equals(Scenario_B.getEmotion("Orange")) : "Emotion for Orange wrong";
            assert "The emotion that matches your colour, Yellow, is Happy.".equals(Scenario_B.getEmotion("Yellow")) : "Emotion for Yellow wrong";
            assert "The emotion that matches your colour, Green, is Peaceful.".equals(Scenario_B.getEmotion("Green")) : "Emotion for Green wrong";
            assert "The emotion that matches your colour, Cyan, is Calm.".equals(Scenario_B.getEmotion("Cyan")) : "Emotion for Cyan wrong";
            assert "The emotion that matches your colour, Blue, is Calm.".equals(Scenario_B.getEmotion("Blue")) : "Emotion for Blue wrong";
            assert "The emotion that matches your colour, Violet, is Bravery.".equals(Scenario_B.getEmotion("Violet")) : "Emotion for Violet wrong";
            assert "Unknown colour. Please enter a valid colour name!".equals(Scenario_B.getEmotion("re")) : "Invalid red spelling not handled";
            assert "Unknown colour. Please enter a valid colour name!".equals(Scenario_B.getEmotion("Silver")) : "Invalid colour check failed(silver)";
            assert "Unknown colour. Please enter a valid colour name!".equals(Scenario_B.getEmotion("")) : "Empty input not handled";

            System.out.println("[PASS] TestgetEmotion");
        } catch (AssertionError e) {
            System.out.println("[FAIL] TestgetEmotion - " + e.getMessage());
        }
    }
}
