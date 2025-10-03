import org.code.neighborhood.*;

public class FlowerPainter extends PainterPlus {


/* paints the flower step by step
   uses basic move and paint methods
   uses turnRight and turnLeft
 */
  public void paintFlower() {
    //moves to the start
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
//paints the blue part of the flower
    paint("blue");
    turnRight();
    move();
    paint("blue");
    move();
    paint("blue");
    move();
    turnRight();
    move();
    paint("blue");
    move();
    paint("blue");
    move();
    turnRight();
    
    move();
    paint("blue");
    move();
    paint("blue");
    move();
    paint("blue");

    move();
    turnRight();
    move();
    paint("blue");
    move();
    paint("blue");

    turnRight();
    move();
    paint("blue");
    move();
    paint("blue");
    move();
    paint("blue");

    turnRight();
    move();
    turnRight();
//paints the yellow center
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");

    turnRight();
    move();
    move();
    move();
    turnRight();
    move();
    turnLeft();
//paints the stem
    paint("green");
    move();
    paint("green");
    turnRight();
    move();
    paint("green");
    turnRight();
    turnRight();
    move();
    turnRight();

    move();
    paint("green");
    turnLeft();
    move();
    paint("green");
    turnRight();
    turnRight();
    move();
    turnLeft();
    move();

    paint("green");
    move();
    paint("green");
    

    
  }
}
