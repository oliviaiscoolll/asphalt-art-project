import org.code.neighborhood.*;

public class PainterPlus extends Painter{

//Method for turning right
  
public void turnRight(){
  this.turnLeft();
  turnLeft();
  turnLeft();
  }

//Method for taking all paint buckets on a square (not used)
  
public void takeAllPaint(){
  while (isOnBucket()) {
      takePaint();
    }
}

//Method for painting until no paint reamins in the bucket
  
public void paintToEmpty(String color) {
    while (hasPaint()) {
  paint(color);
  move();
    }
}
}