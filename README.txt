Name : Ashenka Soysa
Curtin ID :22714558 

The report explains each stage of the assignment in detail so that someone else can easily understand what was done and how the " Soysa_Ashenka22714558_ISErepo " folder is organized into two subfolders: documents and code.

Soysa_Ashenka22714558_ISErepo(Main folder)
|
|---documents(sub folder)
|            |---AshenkaSoysa_22714558_ISEReport.md
|            |---AshenkaSoysa_22714558_ISEReport.pdf
|            |---Screenshots(sub folder)
|
|---code(sub folder)
|        |---Main.java
|        |---Scenario_A.java
|        |---Scenario_B.java
|        |---TestCode.java
|
|---README.txt


documents folder:
This folder contains all the documentation for the assignment. The main file is:

    --AshenkaSoysa_22714558_ISEReport.md : This is the original Markdown version of the report.
    --AshenkaSoysa_22714558_ISEReport.pdf : This is the PDF version of the same report.
    --Screenshots : This folder contains all the relevant screenshots used in the report to support the explanation and show evidence of the program running correctly.

code folder:
This folder includes all the Java files used to build the actual program:

    --Scenario_A.java : Handles all operations related to the electromagnetic spectrum. Features include:
                                                                                        --Finding frequency bounds for a given colour.
                                                                                        --Converting between frequency (THz) and wavelength (nm).
                                                                                        --Converting between wavelength (nm) and frequency (THz).
                                                                                        --Checking if a frequency is in the visible, IR, or UV range.
                                                                                        --Mapping a frequency to a colour.
                                                                                        --Comparing two frequencies to determine if they represent the same colour.

    --Scenario_B.java : Focuses on colour-related fun facts. Given a colour, the program can:
                                                                                        --Return the matching stone when a colour is entered.
                                                                                        --Return a corresponding musical note when a colour is entered.
                                                                                        --Return an associated emotion when a colour is entered.

    --Main.java : This is the main class that runs the program. It acts as the user interface and coordinates inputs and method calls for both Scenario_A and Scenario_B.

    --TestCode.java : This contains test cases to verify that the methods in both Scenario_A and Scenario_B work as expected.

