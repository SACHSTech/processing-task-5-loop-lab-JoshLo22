import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * A program that uses nested loops and draws a bunch of squares
   * 
   * @author: Joshua Lo
   */
  public void settings() {
    // put your size call here
    size(1200, 600);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines() {
    stroke(0);
    noFill();

    // Draw bottom row boxes
    rect(0, 300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // Draw top row boxes
    rect(0, 0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }

  /**
   * Draws the bottom left section
   */
  public void draw_section1() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + intRow * 10; // Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn * 10; // Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + intRow * 10 + 300; // Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn * 10; // Instead of zero, calculate the proper intY location using 'intColumn'
        if (intRow % 2 == 1) {
          fill(0);
        } else {
          fill(255);
        }

        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
}
  