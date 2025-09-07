# Tally Counter (Java AWT)

## Project Overview
This project is a simple **Java AWT application** that functions as a digital tally counter. It displays a number in a text field, with two buttons to either **increment the count** or **reset it to zero**.

## Components
- **Frame**: Main application window with size `500x500` and title `"AWT"`.
- **TextField (display)**: Shows the current counter value (starts at 0).
- **Button (Increment)**: Increases the counter value by 1 each time it is clicked.
- **Button (Reset)**: Resets the counter value back to 0.

## Event Handling
- **Increment Button ActionListener**  
  - Retrieves the current value from the text field using `display.getText()`.
  - Converts it to an integer using `Integer.parseInt()`.
  - Increments the value (`++num`) and updates the display using `setText()`.
  
- **Reset Button ActionListener**  
  - Sets the display value directly to `"0"`.

## Layout
- Uses `null` layout with manual positioning (`setBounds()`).
- Components are positioned:
  - Display field: `(50, 50, 300, 50)`
  - Increment button: `(100, 150, 100, 30)`
  - Reset button: `(200, 150, 100, 30)`

## How to Run
1. Ensure Java is installed on your system.
2. Save the code in a file named `Tally.java`.
3. Compile the code:
   ```bash
   javac Tally.java

