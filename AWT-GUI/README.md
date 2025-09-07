
# Simple AWT GUI Form

## Project Overview
This project is a basic Java AWT application that creates a GUI form to collect user input: Email, Password, and Age. Upon clicking the Submit button, the input values are printed to the console.

## Components
- **Frame**: Main window of size 500x500 with title "AWT".
- **Labels**: Display text for Email, Password, and Age fields.
- **TextFields**: Input fields for Email, Password, and Age.
- **Button**: Submit button to trigger action.
- **ActionListener**: Handles button click event and prints the entered values.
- **Layout**: Null layout with manual positioning using `setBounds()`.

## How to Run
1. Ensure Java is installed on your system.
2. Compile the code: `javac Game1.java`
3. Run the program: `java Game1`
4. A GUI window will open. Enter details and click Submit to see output in the console.

## Notes
- Password field is not masked. For real applications, consider using `TextField.setEchoChar('*')`.
- Manual positioning may not be responsive on different screen sizes.
- Demonstrates basic AWT components and event handling in Java.
