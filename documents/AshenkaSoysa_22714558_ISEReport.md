# ISE Final Assignment Report

## cover page

- Assesment name: ISAD Final Assignment
- Full name: Widanalage Chamith Ashenka Soysa
- Curtin Student ID: 22714558
- practical class:
    - date - Thursday
    - time - 1.30 pm - 3.30pm

---

## Introduction

For this project, I used JAVA to implement the code.Analyzing color-related properties using electromagnetic (EM) 
spectrum data is the main purpose of this project.The main folder contains two subfolders: "code" for all java source 
files, "documents" for markdown and screenshots.The application is divided into two main scenarios: Scenario A and 
Scenario B. The code follows good modularity principles. Scenario A is organized into six functional modules, while 
Scenario B is implemented using three focused modules. Testing has been conducted using both black-box and white-box 
approaches, and version control has been used throughout development. Test results and Git logs are included in the 
documents as screenshots.  

---

##Module Description

- I created submodules with names that make it easy for me to understand their purpose. Each module was designed by 
thinking about what imports and exports it needs, and I kept the descriptions short to quickly explain what each one 
does.

---

### Submodule : ColourFrequencyBounds

- **Imports**: colour(String) 
- **Exports**: result(String)
- **Description**: When a colour name is given, returns a string of the upper and lower bounds of its frequency range in the known 
Electromagnetic spectrum .
- **Design Decision**: Uses a switch-case for mapping known colour names.  
- **Assumptions**: Input is a valid visible colour name (case-insensitive).

### Submodule : convertFrequencyToWavelength

- **Imports**: frequencyTHz(double)  
- **Exports**: wavelength(String)  
- **Description**: Converts a given frequency (THz) to wavelength (nm) using `wavelength = 300000 / frequency`.Validates positive input.
- **Design Decision**: Uses the Formula 1 given in the Figure 1.
- **Assumptions**: Input must be positive and non-zero.

### Submodule : convertWavelengthToFrequency

- **Imports**: wavelengthNm(double)  
- **Exports**:  frequency(String)
- **Description**: Converts a given wavelength (nm) to frequency (THz) using `frequency = 300000 / wavelength`.Validates positive input.
- **Design Decision**: Uses the Formula 2 given in the Figure 1(inversing the previous formula).
- **Assumptions**: Input must be positive and non-zero, and in .

### Submodule : InRange

- **Imports**: frequencyTHz(double)  
- **Exports**: rangeResult (String)  
- **Description**: Checks if a frequency is within visible light (400-790 THz), IR (1-399 THz), or UV (791-30,000 THz) 
ranges. Returns a message indicating which range the frequency belongs to.
- **Design Decision**: Used if else to clearly seperate and prioritize checks for each frequency band.
- **Assumptions**: Frequency is between 1 and 30,000 THz. Frequencies outside this are considered invalid.

### Submodule : FrequencyToColour

- **Imports**: frequencyTHz(double)  
- **Exports**: colour(String)  
- **Description**: Takes a frequency value and returns the corresponding visible colour. If the frequency is below 400 
THz, it returns "Too low — below red"; if it's above 790 THz, it returns "Too high — above violet".
- **Design Decision**: Used if else to match the frequency ranges clearly.
- **Assumptions**: Frequency might lie outside the visible range and valid positive inputs.

### Submodule : FrequencyComparison

- **Imports**: freq1(double),freq2(double)  
- **Exports**: comparisonResult(String)  
- **Description**: Compares two frequencies and reports whether they produce the same or different colours, or if they 
fall outside the visible range.
- **Design Decision**: Uses the FrequencyToColour method for both inputs and compares results.
- **Assumptions**: Both input frequencies can be in within or outside visible range and are valid positive values.

### Submodule : getStone

- **Imports**: colour(String)  
- **Exports**: stoneResult(String)  
- **Description**: Returns the gemstone for a given colour .
- **Design Decision**: Uses a switch-case for mapping.  
- **Assumptions**: Input has to be a valid visible colour and unknown colours return a default error string.

### Submodule : getNote

- **Imports**: colour(String)  
- **Exports**: noteResult(String)  
- **Description**: Returns the musical note for a colour .
- **Design Decision**: Uses a switch-case for mapping.  
- **Assumptions**: Input has to be a valid visible colour and unknown colours return a default error string.

### Submodule : getEmotion

- **Imports**: colour(String)  
- **Exports**: emotionResult(String)  
- **Description**: Returns the emotion linked to a colour.
- **Design Decision**: Uses a switch-case for mapping.  
- **Assumptions**: Input has to be a valid visible colour and unknown colours return a default error string.

---

## Modularity

### Description on how to run your production code with correct commands.

1. User has to open the terminal and navigate to the directory where the project is located using the below command.

```
cd /home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo
```

2. Next, the user has to go to the directory where the production code is located using the below command.

```
cd code
```

3. The user has to run the production code using the below command.

```
javac Scenario_A.java ; javac Scenario_B.java ; javac Main.java
```

Step 4: The user has to Run the main class using the below command.

```
java Main
```

---

### Sample output of the production code

1. Main Menu Output:

 ![Main Menu](/home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo/documents/Screenshots/MENU.png)

2. When a Valid Input(A) is given: 
 
 ![Valid InputA](/home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo/documents/Screenshots/VALIDNEW.png)

3. When a Valid Input(B) is given:

 ![Valid InputB](/home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo/documents/Screenshots/VALID2.png)

4. When an Invalid Input(A) is given:

 ![Invalid InputA](/home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo/documents/Screenshots/INVALID2.png)

5. When an Invalid Input(B) is given:

 ![Invalid InputB](/home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo/documents/Screenshots/INVALID1.png)

### Different Modularity Concepts applied

### 3. Different Modularity Concepts applied in the code

1. **Independent Modules**  
   Each module should have a clear purpose and should be able to function independently, without relying heavily on 
other modules for its core functionality.
   - Example: `Scenario_A` deals with frequency and calculations, while `Scenario_B` handles mappings colours to stones, musical notes, and emotions.

2. **Code Reusability**  
   Writing methods that can be used in different parts of the program or in other programs without rewriting the logic.     - Example: Methods like `getStone`, `getNote`, `convertFrequencyToWavelength`, and `FrequencyToColour` can be reused in any project that involves colour or frequency analysis.

3. **High Cohesion**  
   A module performs a single, well-defined task and makes it easier to understand and maintain.
   - Example: `Scenario_A` only contains logic for colour frequencies and spectrum ranges and `Scenario_B` only mapping colours to stones, musical notes and emotions.

4. **Loose Coupling**  
    Modules are independent, with minimal dependencies.   
   - Example: We can update or test `Scenario_B` without needing to touch or modify `Scenario_A`.

5. **Encapsulation**  
   Internal logic is hidden inside methods, and only necessary functionalities are exposed through method calls.  
   - Example: When the user provides a frequency(ex:-700), the method FrequencyToColour() will returns the matching 
colour. The user doesn’t need to understand how the colour is calculated.All the internal checking and logic are hidden inside the method.

### 4A. Modularity Review checklist

| **Category**         | **Check**                        | **Result** | **Explanation** |
| -------------------- | -------------------------------- | ---------- | -----------------------------------------------------------------------------------------------|
| **Global Variables** | No global variables used         |   Pass     | All variables are declared locally inside methods. |
| **Control Flags**    | No unnecessary boolean flags     |   Failed   | Code uses boolean flags which is a type of control flags in the `InRange` method|
| **High Cohesion**    | Each method has one focused task |   Pass     | Methods like `getStone` or `convertFrequencyToWavelength` handle one job. |
| **Loose Coupling**   | Modules/classes are independent  |   Pass     | `Scenario_A` and `Scenario_B` don’t rely on each other’s internal workings. |
| **Error Handling**   | Handles invalid input gracefully |   Pass     | Returns clear messages for invalid inputs (e.g., “Frequency must be between 0 and 30,000 THz”).|

![before refactoring](/home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo/documents/Screenshots/beforerefactor.png)

### 4B. Modularity Review checklist after Refactoring

| **Category**         | **Check**                        | **Result** | **Explanation** |
| -------------------- | -------------------------------- | ---------- | -----------------------------------------------------------------------------------------------|
| **Global Variables** | No global variables used         |   Pass     | All variables are declared locally inside methods. |
| **Control Flags**    | No unnecessary boolean flags     |   Pass     | `InRange` method was refactored and now uses if-else instead of control flags|
| **High Cohesion**    | Each method has one focused task |   Pass     | Methods like `getStone` or `convertFrequencyToWavelength` handle one job. |
| **Loose Coupling**   | Modules/classes are independent  |   Pass     | `Scenario_A` and `Scenario_B` don’t rely on each other’s internal workings. |
| **Error Handling**   | Handles invalid input gracefully |   Pass     | Returns clear messages for invalid inputs (e.g., “Frequency must be between 0 and 30,000 THz”).|

![after refactoring_log](/home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo/documents/Screenshots/refactorlog.png)

![after refactoring](/home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo/documents/Screenshots/afterrefactor.png)

## Black-Box testing

### Submodule : `ColourFrequencyBounds`
- Equivalance Partitioning

| Category         | Test Data | Expected Console Output                                     |
| ---------------- | ---------| ------------------------------------------------------------ |
| valid colour     | "red"    | The frequency bounds for Red are: 400 THz to 479 THz         |
| valid colour     | "Orange" | The frequency bounds for Orange are: 480 THz to 509 THz      |
| valid colour     | "YELLOW" | The frequency bounds for Yellow are: 510 THz to 529 THz      |
| valid colour     | "Green"  | The frequency bounds for Green are: 530 THz to 599 THz       |
| valid colour     | "cyan"   | The frequency bounds for Cyan are: 600 THz to 619 THz        |
| valid colour     | "blue"   | The frequency bounds for Blue are: 620 THz to 669 THz        |
| valid colour     | "Violet" | The frequency bounds for Violet are: 670 THz to 790 THz      |
| invalid colour   | "white"  | Please enter a valid colour name.                            |
| invalid colour   |   ""     | Please enter a valid colour name.                            | 
| invalid colour   | "Soysa"  | Please enter a valid colour name.                            |

-  This submodule is responsible for giving the the upper and lower bounds when a colour is given. I have tested all the valid colour names and the frequency bounds are correct. also when I give invalid colour name it gives the error message.

### Submodule : `convertFrequencyToWavelength`
- Equivalance Partitioning

| Category  | Test Data (THz) | Expected Console Output      |
| --------- | ----------- | -------------------------------- |
| frequencyThz > 0          | 558         | Wavelength: 537.6344086021505 nm |
| frequencyThz > 0          | 300000      | Wavelength: 1.0 nm               |
| frequencyThz > 0         | 1           | Wavelength: 300000.0 nm          |
| frequencyTHz <= 0         | 0           | Frequency must be positive       |
| frequencyTHz <= 0         | -1          | Frequency must be positive       |

- This submodule is responsible for converting a given frequency (in terahertz) to its corresponding wavelength (in nanometers). I have tested a range of valid input values, and the outputs are accurate. The submodule also correctly handles invalid inputs (such as zero or negative values) by displaying an appropriate error message.

### Submodule : `convertWavelengthToFrequency`
- Equivalance Partitioning

| Category  | Test Data (nm) | Expected Console Output        |
| --------- | ---------- | ---------------------------------- |
| wavelengthNm > 0         | 558        | Frequency: 537.6344086021505 THz   |
| wavelengthNm > 0         | 1          | Frequency: 300000.0 THz            |
| wavelengthNm > 0          | 300000     | Frequency: 1.0 THz                 |
| wavelengthNm <= 0         | 0          | Frequency must be positive         |
| wavelengthNm <= 0         | -50        | Frequency must be positive         |

- This submodule is designed to convert a given wavelength (in nanometers) to its corresponding frequency (in terahertz). I have verified the output for all valid input values, and the results are accurate. Additionally, the submodule correctly handles invalid inputs by displaying an appropriate error message.

### Submodule : `InRange`
- Equivalance Partitioning

| Category  | Test Data (THz) | Expected Console Output       |
| --------- | ---------- | ---------------------------------- |
| frequencyTHz >= 400 && frequencyTHz <= 790 | 500 | The frequency entered lies within the Visible Light range (400–790 THz). |
| frequencyTHz >= 1 && frequencyTHz <= 399   | 1 | The frequency entered lies within the Infrared (IR) range (1–399 THz), which is not visible to the human eye. |
| frequencyTHz >= 791 && frequencyTHz <= 30000 | 30000 | The frequency entered lies within the Ultraviolet (UV) range (791–30,000 THz), which is beyond the visible spectrum. |
| frequencyTHz =0   | 0 | The frequency is out of the known electromagnetic range (1–30,000 THz). |
| frequencyTHz < 0 OR frequencyTHz > 30000   | -1 | Frequency must be between 0 and 30,000 THz. |
| frequencyTHz < 0 OR frequencyTHz > 30000   | 30001 | Frequency must be between 0 and 30,000 THz. |

- Boundary Value Analysis

| Boundary               | Test Data (THz) | Expected Console Output                  |
| ---------------------- | -----------     | -------------------------------------------- |
| Lower IR Boundary      | 1               | The frequency entered lies within the Infrared (IR) range (1–399 THz), which is not visible to the human eye. |
| Upper IR Boundary      | 399             | The frequency entered lies within the Infrared (IR) range (1–399 THz), which is not visible to the human eye. |
| Lower Visible Boundary | 400             | The frequency entered lies within the Visible Light range (400–790 THz).            |
| Upper Visible Boundary | 790             | The frequency entered lies within the Visible Light range (400–790 THz).            |
| Lower UV Boundary      | 791             | The frequency entered lies within the Ultraviolet (UV) range (791–30,000 THz), which is beyond the visible spectrum.      |
| Upper UV Boundary      | 30000           | The frequency entered lies within the Ultraviolet (UV) range (791–30,000 THz), which is beyond the visible spectrum.      |
| Below IR /Invalid      | 0               | The frequency is out of the known electromagnetic range (1–30,000 THz).  |
| Above UV /Invalid      | 30001           | Frequency must be between 0 and 30,000 THz.  |

- This submodule checks if a given frequency falls within the visible, infrared, or ultraviolet range using the InRange method. It correctly categorizes frequencies and handles invalid inputs with appropriate error messages.

### Submodule : `FrequencyToColour`
- Equivalance Partitioning

| Category                                   | Test Data(THz) |   Expected Console Output |
|--------------------------------------------|--------------|---------------------------- |
| frequencyTHz >= 400 && frequencyTHz <= 479 | 450      |  Red    |
| frequencyTHz >= 480 && frequencyTHz <= 509 | 507      |  Orange |
| frequencyTHz >= 510 && frequencyTHz <= 529 | 520      |  Yellow |
| frequencyTHz >= 530 && frequencyTHz <= 599 | 570      |  Green  |
| frequencyTHz >= 600 && frequencyTHz <= 619 | 610      |  Cyan   |
| frequencyTHz >= 620 && frequencyTHz <= 669 | 635      |  Blue   |
| frequencyTHz >= 670 && frequencyTHz <= 790 | 790      |  Violet |
| frequencyTHz <= 0                          | -1       | Please enter a positive frequency that is above zero. |
| frequencyTHz <= 0                          | 0        | Please enter a positive frequency that is above zero. |
| frequencyTHz < 400                         | 200      | Too low — below red                                   |
| frequencyTHz > 790                         | 791      | Too high — above violet                               |

- Boundary Value Analysis

| Test Case              | Test Data (THz) | Expected Console Output                               |
| ---------------------- | --------------- | ----------------------------------------------------- |
| Below Red / Invalid    | 399             | Too low — below red                                   |
| Red Lower Bound        | 400             | Red                                           |
| Red Upper Bound        | 479             | Red                                           |
| Orange Lower Bound     | 480             | Orange                                        |
| Orange Upper Bound     | 509             | Orange                                        |
| Yellow Lower Bound     | 510             | Yellow                                        |
| Yellow Upper Bound     | 529             | Yellow                                        |
| Green Lower Bound      | 530             | Green                                         |
| Green Upper Bound      | 599             | Green                                         |
| Cyan Lower Bound       | 600             | Cyan                                          |
| Cyan Upper Bound       | 619             | Cyan                                          |
| Blue Lower Bound       | 620             | Blue                                          |
| Blue Upper Bound       | 669             | Blue                                          |
| Violet Lower Bound     | 670             | Violet                                        |
| Violet Upper Bound     | 790             | Violet                                        |
| Above Violet / Invalid | 791             | Too high — above violet                               |
| Zero  / Invalid        | 0               | Please enter a positive frequency that is above zero. |
| Negative / Invalid     | -1              | Please enter a positive frequency that is above zero. |

- This submodule converts a given frequency to its corresponding visible color or returns a message if it's outside the visible range or if the frequency is less than or equal to zero. I've verified the outputs for valid inputs, and it correctly handles invalid values with appropriate messages.

### Submodule : `FrequencyComparison`
- Equivalance Partitioning

| Category                                                          | Test Data(THz) | Expected Console Output                                          |
|-------------------------------------------------------------------|----------------|------------------------------------------------------------------|
| Both Frequencies are in the same range                            | (621,660)      | The frequencies produce the same colour: Blue                    |
| When one Frequency is outside of the visible range                | (440,1)        | One or both frequencies are outside the visible range.           |
| When the Frequencies entered are different                        | (450,650)      | The frequencies produce different colours: Red and Blue.         |
| When both are outside the visible range                           | (1,791)        | One or both frequencies are outside the visible range.           |
| When both frequencies are outside visible range and are below 400 | (2,399)        | The frequencies produce the same colour: Too low — below red     |
| When both frequencies are outside visible range and are above 790 | (800,1000)     | The frequencies produce the same colour: Too high — below violet |
| When freq1 <= 0 (freq2 valid)                                     | (-1, 500)      | Please enter positive frequencies that are above zero.           |
| When freq2 <= 0 (freq1 valid)                                     | (500, -1)      | Please enter positive frequencies that are above zero.           |
| When both <= 0                                                    | (-1, 0)        | Please enter positive frequencies that are above zero.           |

- This submodule checks whether two given frequencies produce the same visible color. It also validates if either frequency is out of range or non-positive. I’ve tested both valid and invalid inputs, and it handles all cases correctly with appropriate messages.

### Submodule : `getStone`
- Equivalance Partitioning

| Category       | Test Data | Expected Console Output                                   |
| -------------- | --------  | --------------------------------------------------------- |
| valid colour   | "red"     | The stone that matches your colour, Red, is Garnet.       |
| valid colour   | "Orange"  | The stone that matches your colour, Orange, is Moonstone. |
| valid colour   | "yellow"  | The stone that matches your colour, Yellow, is Topaz.     |
| valid colour   | "GREEN"   | The stone that matches your colour, Green, is Emerald.    |
| valid colour   | "cyan"    | The stone that matches your colour, Cyan, is Turquoise.   |
| valid colour   | "Blue"    | The stone that matches your colour, Blue, is Opal.        |
| valid colour   | "VIOLET"  | The stone that matches your colour, Violet, is Amethyst.  |
| invalid colour | "cya"     | Unknown colour. Please enter a valid colour name!         |
| invalid colour | "white"   | Unknown colour. Please enter a valid colour name!         |
| invalid colour | ""        | Unknown colour. Please enter a valid colour name!         |

- This submodule will give the user the ability to enter a colour and will output the gemstone that matches that colour. I tested the code and it will give a error message for invalid colours and will give the correct gemstone for valid colours.

### Submodule : `getNote`
- Equivalance Partitioning

| Category       | Test Data    | Expected Console Output                                  |
| -------------- | ------------ | -------------------------------------------------------- |
| valid colour   | "red"        | The musical note that matches your colour, Red, is C.    |
| valid colour   | "Orange"     | The musical note that matches your colour, Orange, is D. |
| valid colour   | "Yellow"     | The musical note that matches your colour, Yellow, is E. |
| valid colour   | "Green"      | The musical note that matches your colour, Green, is F.  |
| valid colour   | "CYAN"       | The musical note that matches your colour, Cyan, is G.   |
| valid colour   | "blue"       | The musical note that matches your colour, Blue, is A.   |
| valid colour   | "Violet"     | The musical note that matches your colour, Violet, is B. |
| invalid colour | "viole"      | Unknown colour. Please enter a valid colour name!        |
| invalid colour | "White"      | Unknown colour. Please enter a valid colour name!        |
| invalid colour | ""           | Unknown colour. Please enter a valid colour name!        |

- This submodule will give the user the ability to enter a colour and will output the musical note that matches that colour. I tested the code and it will give a error message for invalid colours and will give the correct musical note for valid colours.

### Submodule : `getEmotion`
- Equivalance Partitioning

| Category       | Test Data    | Expected Console Output                                       |
| -------------- | ------------ | ------------------------------------------------------------- |
| valid colour   | "Red"        | The emotion that matches your colour, Red, is Confidence.     |
| valid colour   | "Orange"     | The emotion that matches your colour, Orange, is Happy.       |
| valid colour   | "Yellow"     | The emotion that matches your colour, Yellow, is Happy.       |
| valid colour   | "Green"      | The emotion that matches your colour, Green, is Peaceful.     |
| valid colour   | "Cyan"       | The emotion that matches your colour, Cyan, is Calm.          |
| valid colour   | "Blue"       | The emotion that matches your colour, Blue, is Calm.          |
| valid colour   | "Violet"     | The emotion that matches your colour, Violet, is Bravery.     |
| invalid colour | "re"         | Unknown colour. Please enter a valid colour name!             |
| invalid colour | "Silver"     | Unknown colour. Please enter a valid colour name!             |
| invalid colour | ""           | Unknown colour. Please enter a valid colour name!             |

- This submodule will give the user the ability to enter a colour and will output the emotion that matches that colour. I tested the code and it will give a error message for invalid colours and will give the correct emotion for valid colours.

## White-Box testing

### Submodule : `FrequencyToColour`
- Construct used : `if-else`

|  Path Description                      | Test Data (frequencyTHz)      | Expected Result                                       |
| -------------------------------------- | ----------------------------- | ----------------------------------------------------- |
| Enter first `if` part                  | 0                             | Please enter a positive frequency that is above zero. |
| Enter second `if` part (Red)           | 450                           | Colour: Red                                           |
| Enter first `else-if` part (Orange)    | 490                           | Colour: Orange                                        |
| Enter second `else-if` part (Yellow)   | 515                           | Colour: Yellow                                        |
| Enter third `else-if` part (Green)     | 550                           | Colour: Green                                         |
| Enter fourth `else-if` part (Cyan)     | 610                           | Colour: Cyan                                          |
| Enter fifth `else-if` part (Blue)      | 650                           | Colour: Blue                                          |
| Enter sixth `else-if` part (Violet)    | 700                           | Colour: Violet                                        |
| Enter seventh `else-if` part (Too low) | 300                           | Too low — below red                                   |
| Enter `else` part (Too high)           | 800                           | Too high — above violet                               |

- I have used if-else logic in the FrequencyToColour submodule to accurately assign the corresponding colour based on the frequency entered by the user, provided the input is valid.

### Submodule : `getStone`
- Construct used : `switch cases`

| Path Description                | Test Data               | Expected Result                                           |
| ------------------------------- | ----------------------- | --------------------------------------------------------- |
| Enter the case "red"            | "red"                   | The stone that matches your colour, Red, is Garnet.       |
| Enter the case "orange"         | "orange"                | The stone that matches your colour, Orange, is Moonstone. |
| Enter the case "yellow"         | "yellow"                | The stone that matches your colour, Yellow, is Topaz.     |
| Enter the case "green"          | "green"                 | The stone that matches your colour, Green, is Emerald.    |
| Enter the case "cyan"           | "cyan"                  | The stone that matches your colour, Cyan, is Turquoise.   |
| Enter the case "blue"           | "blue"                  | The stone that matches your colour, Blue, is Opal.        |
| Enter the case "violet"         | "violet"                | The stone that matches your colour, Violet, is Amethyst.  |
| Enter the case default          | "pink"                  | Unknown colour. Please enter a valid colour name!         |
| Enter the case "red" (Case-insensitive check) | "RED"                   | The stone that matches your colour, Red, is Garnet.       |
| Empty input                     | ""                      | Unknown colour. Please enter a valid colour name!         |

- I have used switch cases in the getStone submodule and each case is checking the input against a specific colour name. If the input matches a case, the corresponding stone name is returned. If the input does not match any case, the default case is executed, which returns an error message.

## Test implementation and test execution

### How to run the test implementation code

1. User has to open the terminal and navigate to the directory where the project is located using the below command.

```
cd /home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo
```

2. Next, the user has to go to the directory where the test code is located using the below command.

```
cd code
```

3. The user has to run the test code using the below command.

```
javac TestCode.java 
```

Step 4: The user has to Run the TestCode class using the below command.

```
java -ea TestCode
```
- Output of the Test implementation

![BeforeFixingErrors](/home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo/documents/Screenshots/BeforeFixingErrors.png)

I fixed the test case errors and the below image has the fixed version

![AfterFixingErrors](/home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo/documents/Screenshots/AfterFixingErrors.png)

---

## Summary table of my work

| Module name |            Design of test cases              |                         |            |              |                       |      Test code implementation and execution     |     |            |
|-------------|--------------------|----------------|-----------|--------------|-----------------------|-------------------------|------|------------|
|             | *BB (EP)*            | *BB (BVA)*       | *WB*        | *Data type/s*  |*Form of Input/output*    | *EP*         | *BVA*  | *White-Box*  |
|ColourFrequencyBounds       |done|not done         |not done   |String        |Input:String Output:String        | done         |not done |not done |
|convertFrequencyToWavelength|done|not done         |not done   |double,String |Input:double Output:String        | done         |not done |not done |
|convertWavelengthToFrequency|done|not done         |not done   |double,String |Input:double Output:String        | done         |not done |not done |
|InRange                     |done|    done         |not done   |double,String |Input:double Output:String        | done         |not done |not done |
|FrequencyToColour           |done|    done         |    done   |double,String |Input:double Output:String        | done         |not done |not done |
|FrequencyComparison         |done|not done         |not done   |double,String |Input:double,double Output:String | done         |not done |not done |
|getStone                    |done|not done         |    done   |String        |Input:String Output:String        | done         |not done |not done |
|getNote                     |done|not done         |not done   |String        |Input:String Output:String        | done         |not done |not done |
|getEmotion                  |done|not done         |not done   |String        |Input:String Output:String        | done         |not done |not done |
