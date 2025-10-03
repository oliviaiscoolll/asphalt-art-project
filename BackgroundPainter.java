import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus{
/* paints the background white
   paints it row by row
   uses for loops
 */
  public void paintBackground(){
    //loops it 5 times
    for (int i = 0; i<5; i++){
      moveRight();
      moveLeft();
    }

    moveRight();
    while(canMove()){
   paint("white");
   move();
  }
  paint("white");
  }

/* moves the painter to the right and paints each tile
   turns the painter around
  */
public void moveRight(){
  //paints the entire row white
  while(canMove()){
   paint("white");
   move();
  }
  //turns around
  paint("white");
  turnRight();
  move();
  paint("white");
  turnRight();
 
}

/* moves the painter to the left and paints each tile
   turns the painter around
  */
public void moveLeft(){
  while(canMove()){
   paint("white");
   move();
  }
  //turns around
  paint("white");
  turnLeft();
  move();
  paint("white");
  turnLeft();
}
 
}
