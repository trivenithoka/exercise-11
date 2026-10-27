The aim of this experiment is to build a Tip Calculator app using JavaFX components, demonstrating how to design a user interface with FXML, handle user interactions, perform input validation, and display results.

Problem Statement
Build a Tip Calculator application using JavaFX that:

Accepts Bill Amount and Tip Percentage as user inputs.
Calculates the Tip Amount when the "Calculate Tip" button is clicked.
Displays the tip amount in a label.
Handles invalid input (non-numeric values) by displaying an error message.
Provides a Reset button to clear all fields and labels.
Input
Bill Amount (numeric)
Tip Percentage (numeric)
Output
Tip Amount displayed as Tip Amount: $X.XX
Error message for invalid input
Example Output:

Bill Amount: 50.00
Tip Percentage: 15
Tip Amount: $7.50
Algorithm
Step‑1: Create the FXML file (tip_calculator.fxml) with:

A VBox as the root layout.
A Label for the title ("Tip Calculator").
Two TextField components for Bill Amount and Tip Percentage.
Two Button components for Calculate and Reset.
Two Label components for Tip Amount and Error Message.
Step‑2: Create the Controller class (TipCalculatorController):

Use @FXML annotations to inject UI components.
Implement calculateTip() method:
Parse bill amount and tip percentage.
Calculate tip amount.
Display the result in tipAmountLabel.
Catch NumberFormatException and display error message.
Implement reset() method:
Clear all fields and labels.
Step‑3: Create the Main Application class:

Load the FXML file.
Set the scene and show the stage.
Step‑4: Compile and run the application.

Examples
Example 1: Valid Input
Bill Amount: 50.00
Tip Percentage: 15
Output: Tip Amount: $7.50
Example 2: Invalid Input
Bill Amount: abc
Tip Percentage: 15
Output: Error: Invalid input. Please enter numbers.
Example 3: Reset
Clicking Reset clears all fields.
Constraints
The FXML file and controller must be correctly linked using fx:controller.
Input fields must be validated for numeric input.
The application must handle exceptions gracefully.
