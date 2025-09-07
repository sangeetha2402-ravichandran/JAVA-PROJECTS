# Ball Game (Java AWT)

## Project Overview
This project is a simple **Java AWT application** where a blue ball moves inside a window in response to mouse movements. The ball gradually shifts its position towards the mouse cursor whenever the mouse is moved.

## Components
- **Frame**: Main application window with size `500x600` and title `"Ball Game"`.
- **Graphics (paint method)**: Draws a filled blue circle (the ball) at the current coordinates `(circleX, circleY)` with radius `20`.
- **MouseMotionListener**: Captures mouse movements and updates the ball’s position.

## Core Variables
- `circleX`: X-coordinate of the ball (initially 200).
- `circleY`: Y-coordinate of the ball (initially 200).
- `circleRadius`: Radius of the ball (20).

## Event Handling
- **mouseMoved(MouseEvent e)**:
  - Retrieves the mouse pointer’s coordinates `(x, y)`.
  - Compares them with the ball’s current center position.
  - Moves the ball **1 pixel at a time** toward the mouse pointer:
    - If mouse is left of the ball → ball moves right.
    - If mouse is right of the ball → ball moves left.
    - If mouse is above the ball → ball moves down.
    - If mouse is below the ball → ball moves up.
  - Calls `repaint()` to redraw the ball at the new position.

- **mouseDragged(MouseEvent e)**: Currently unused (empty method).

## How to Run
1. Ensure Java is installed on your system.
2. Save the code in a file named `BallGame.java`.
3. Compile the code:
   ```bash
   javac BallGame.java

