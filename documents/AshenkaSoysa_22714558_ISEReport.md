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
- **Exports**: frequencybounds(double[])
- **Description**: When a colour name is given, returns the upper and lower bounds of its frequency range in the known 
Electromagnetic spectrum .
- **Design Decision**: Uses a switch-case for mapping known colour names.  
- **Assumptions**: Input is a valid visible colour name (case-insensitive).

### Submodule : FrequencyToWavelengthConverter

- **Imports**: frequencyTHz(double)  
- **Exports**: wavelength(double)  
- **Description**: Converts a given frequency (THz) to wavelength (nm) using `wavelength = 300000 / frequency`.Validates positive input.
- **Design Decision**: Uses the Formula 1 given in the Figure 1.
- **Assumptions**: Input must be positive and non-zero.

### Submodule : WavelengthToFrequencyConverter

- **Imports**: wavelengthNm(double)  
- **Exports**:  frequency(double)
- **Description**: Converts a given wavelength (nm) to frequency (THz) using `frequency = 300000 / wavelength`.Validates positive input.
- **Design Decision**: Uses the Formula 2 given in the Figure 1(inversing the previous formula).
- **Assumptions**: Input must be positive and non-zero, and in .

### Submodule : InRange

- **Imports**: frequencyTHz(double)  
- **Exports**: rangeResult (double)  
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

### Submodule : FindStone

- **Imports**: colour(String)  
- **Exports**: stoneResult(String)  
- **Description**: Returns the gemstone for a given colour .
- **Design Decision**: Uses a switch-case for mapping.  
- **Assumptions**: Input has to be a valid visible colour and unknown colours return a default error string.

### Submodule : FindMusicalNote

- **Imports**: colour(String)  
- **Exports**: noteResult(String)  
- **Description**: Returns the musical note for a colour .
- **Design Decision**: Uses a switch-case for mapping.  
- **Assumptions**: Input has to be a valid visible colour and unknown colours return a default error string.

### Submodule : FindMatchingEmotion

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
 
 ![Valid InputA](/home/vboxuser/Desktop/Soysa_Ashenka22714558_ISErepo/documents/Screenshots/VALID1.png)

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

