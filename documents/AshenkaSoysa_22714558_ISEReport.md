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

- I created submodules with names that make it easy for me to understand their purpose. Each module was designed by thinking about what imports and exports it needs, and I kept the descriptions short to quickly explain what each one does.

---

### Submodule : ColourFrequencyBounds

- **Imports**: None  
- **Exports**: String (frequency range message)  
- **Description**: When a colour name is given, returns the upper and lower bounds of its frequency range in the known 
Electromagnetic spectrum .

---

### Submodule : FrequencyToWavelengthConverter

- **Imports**: None  
- **Exports**: double (wavelength in nm)  
- **Description**: Converts a given frequency (THz) to wavelength (nm) using `wavelength = 300000 / frequency`.Validates positive input.

---

### Submodule : WavelengthToFrequencyConverter

- **Imports**: None  
- **Exports**: double (frequency in THz)  
- **Description**: Converts a given wavelength (nm) to frequency (THz) using `frequency = 300000 / wavelength`.Validates positive input.

---

### Submodule : InRange

- **Imports**: None  
- **Exports**: FrequencyRangeResult (range info)  
- **Description**: Checks if a frequency is within visible light (400-790 THz), IR (1-399 THz), or UV (791-30,000 THz) 
ranges. Returns structured result with range classification.

---

### Submodule : FrequencyToColour

- **Imports**: None  
- **Exports**: String (colour/out-of-range message)  
- **Description**: Takes a frequency value and returns the corresponding visible colour.If the frequency is below 400 THz, it returns "Too low — below red"; if it's above 790 THz, it returns "Too high — above violet".

---

### Submodule : FrequencyComparison

- **Imports**: FrequencyToColour  
- **Exports**: String (comparison result)  
- **Description**: Compares two frequencies and reports whether they produce the same or different colours, or if they 
fall outside the visible range.

---

### Submodule : FindStone

- **Imports**: None  
- **Exports**: String (stone message)  
- **Description**: Returns the gemstone for a given colour .

---

### Submodule : FindMusicalNote

- **Imports**: None  
- **Exports**: String (musical note message)  
- **Description**: Returns the musical note for a colour .

---

### Submodule : FindMatchingEmotion

- **Imports**: None  
- **Exports**: String (emotion message)  
- **Description**: Returns the emotion linked to a colour.

---







