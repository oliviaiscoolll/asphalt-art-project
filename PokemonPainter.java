/*
 * DOCUMENTATION KEY
 * Subclass of the Mural Painter Class, which is a subclass of the Painter Plus class
 * 
 * paintBackground(color, 32);
Sets background

turnRight();
Turn command

paintLine("black", 4);
Paints a line

paint("black");
Paints a tile

public void paintCharmanderEye(String color)
Adds eye details

paint("white");
Fills with white color

public void colorCharmander(String color)
Fills Charmander

paintLine("red", 3);
Adds red color

paint("Wheat", 3);
Adds a wheat color tile

turnRight();
Turns right
 */

import org.code.neighborhood.*;

public class PokemonPainter extends MuralPainter
  {
    public void paintCharmanderOutline(String color)
    {
      paintBackground(color, 32);

      turnRight();
      
       for(int i=1; i<=15; i++)
         {
           move();
         }

       turnRight();

       for(int i=1; i<=7; i++)
         {
           move();
         }

      turnRight();

      paintLine("black", 4);

      turnLeft();

      move();

      paintLine("black", 2);

      turnLeft();

      move();

      paint("black");

      turnLeft();
      turnLeft();

      move();
      turnLeft();

      move();
      turnRight();

      paintLine("black", 2);

      turnLeft();
      move();

      turnRight();
      paintLine("black", 2);

      turnLeft();
      move();
      turnRight();
      move();
      paint("black");

      move();
      turnLeft();
      move();

      paintLine("black", 2);

      move();

      turnRight();
      move();
      turnLeft();
      paintLine("black", 3);

      turnRight();
      move();
      paint("black");

      move();
      turnLeft();
      move();
      paintLine("black", 3);

      move();
      turnLeft();
      move();
      turnRight();
      paintLine("black", 2);

      move();
      turnLeft();
      move();
      paint("black");

      move();
      turnRight();
      move();
      paint("black");

      turnLeft();
      move();
      turnLeft();
      move();
      paintLine("black", 3);

      turnRight();
      move();
      turnLeft();
      move();
      paintLine("black", 3);

      turnLeft();
      move();
      turnRight();
      move();
      paintLine("black", 2);

      move();
      turnRight();
      move();
      paint("black");

      move();
      turnLeft();
      move();
      paintLine("black", 4);

      turnRight();
      move();
      turnRight();

       for(int i=0; i<3; i++)
         {
           move();
         }

      paintLine("black", 2);

      move();
      turnLeft();
      move();
      paint("black");

      move();
      turnRight();

      move();
      paintLine("black", 2);

      turnLeft();
      move();
      turnRight();
      move();
      paintLine("black", 2);

      move();
      turnLeft();
      move();
      paint("black");

      move();
      turnRight();
      move();
      paint("black");

      move();
      turnLeft();
      move();
      paintLine("black", 4);

      move();
      turnLeft();
      move();
      paint("black");

      turnRight();
      move();
      turnLeft();
      move();
      paintLine("black", 2);

      move();
      turnRight();
      move();
      paintLine("black", 1);

      move();
      turnLeft();
      move();
      paintLine("black", 2);

      move();
      turnLeft();
      move();
      paint("black");

      move();
      turnRight();
      move();
      turnLeft();
      paintLine("black", 2);

      move();
      turnRight();
      move();
      turnLeft();
      paintLine("black", 3);

      for(int i=0; i<3; i++)
         {
           move();
         }

      paint("black");

      turnRight();
      move();
      turnRight();
      move();
      paint("black");

      turnLeft();
      move();
      turnLeft();
      move();
      paintLine("black", 2);

      turnLeft();
      for(int i=0; i<2; i++)
         {
           move();
         }
      turnLeft();
      for(int i=0; i<5; i++)
         {
           move();
         }
      turnLeft();
      move();
      paintLine("black", 2);

      move();
      turnRight();
      move();
      paint("black");

      turnAround();
      for(int i=0; i<2; i++)
         {
           move();
         }
      paint("black");

      turnAround();
      move();
      turnLeft();
      move();
      turnLeft();
      paintLine("black", 3);

      move();
      turnRight();
      move();
      turnLeft();
      paintLine("black", 3);

      turnAround();
      move();
      turnLeft();
      move();
      paint("black");
    }

    public void paintCharmanderEye(String color)
    {
      turnAround();
      for(int i=0; i<11; i++)
         {
           move();
         }
      turnLeft();

      for(int i=0; i<3; i++)
         {
           move();
         }

      turnLeft();
      paintLine(color, 3);

      turnRight();
      move();
      turnRight();
      paintLine(color, 2);

      move();
      paint("white");
    }

    public void colorCharmander(String color)
    {
      for(int i=0; i<3; i++)
        {
          move();
        }
      turnLeft();
      move();
      turnAround();
      paintLine(color, 4);

      turnRight();
      move();
      turnLeft();
      move();
      turnAround();
      paintLine(color, 6);

      turnLeft();
      move();
      turnLeft();
      paintLine(color, 7);

      turnRight();
      move();
      turnRight();
      paintLine(color, 3);

      turnLeft();
      move();
      turnLeft();
      paintLine(color, 4);

      turnRight();
      move();
      turnRight();
      paintLine(color, 4);

      turnLeft();
      move();
      turnLeft();
      paintLine(color, 4);
      turnAround();
      paintLine(color, 9);

      turnRight();
      move();
      turnRight();
      paintLine(color, 3);
      turnAround();
      paintLine(color, 4);

      turnRight();
      move();
      turnRight();
      paintLine(color, 4);

      turnLeft();
      move();
      turnLeft();
      paintLine(color, 3);
      
      turnLeft();
      for(int i=0; i<3; i++)
         {
           move();
         }
      turnLeft();
      paintLine(color, 10);

      turnRight();
      move();
      turnLeft();
      move();
      turnAround();
      paintLine(color, 9);

      turnLeft();
      move();
      turnLeft();
      for(int i=0; i<3; i++)
         {
           move();
         }
      paintLine(color, 2);
      for(int i=0; i<2; i++)
         {
           move();
         }
      paintLine(color, 3);
      for(int i=0; i<3; i++)
         {
           move();
         }
      paintLine(color, 2);

      turnRight();
      move();
      turnRight();
      paintLine(color, 2);
      for(int i=0; i<2; i++)
         {
           move();
         }
      paintLine(color, 5);
      for(int i=0; i<2; i++)
         {
           move();
         }
      paintLine("Wheat", 2);

      turnLeft();
      move();
      turnLeft();
      paintLine("Wheat", 3);
      for(int i=0; i<3; i++)
         {
           move();
         }
      paintLine(color, 3);
      for(int i=0; i<2; i++)
         {
           move();
         }
      paint(color);

      turnRight();
      move();
      turnRight();
      for(int i=0; i<2; i++)
         {
           move();
         }
      paintLine(color, 4);
      move();
      paintLine("Wheat", 3);
      for(int i=0; i<2; i++)
         {
           move();
         }
      paint("white");

      turnLeft();
      move();
      turnLeft();
      for(int i=0; i<3; i++)
         {
           move();
         }
      paintLine("Wheat", 2);
      move();
      paintLine(color, 3);

      for(int i=0; i<4; i++)
         {
           move();
         }
      turnLeft();
      for(int i=0; i<4; i++)
         {
           move();
         }
      paintLine(color, 2);
      for(int i=0; i<3; i++)
         {
           move();
         }
      paintLine("red", 3);
      for(int i=0; i<3; i++)
         {
           move();
         }
      turnRight();

      move();
      turnRight();
      paintLine("red", 5);
      move();
      paintLine("yellow", 2);
      move();
      paintLine(color, 2);

      turnLeft();
      move();
      turnLeft();
      for(int i=0; i<3; i++)
         {
           move();
         }
      paintLine("yellow", 2);
      move();
      paintLine("red", 3);

      turnRight();
      move();
      turnRight();
      for(int i=0; i<2; i++)
         {
           move();
         }
      paintLine("red", 3);

      for(int i=0; i<10; i++)
         {
           move();
         }
      turnRight();
      for(int i=0; i<7; i++)
         {
           move();
         }
      paint("white");
      move();
      paint(color);
      move();
      paint("white");

      turnRight();
      move();
      turnRight();
      move();
      paint(color);

      for(int i=0; i<7; i++)
         {
           move();
         }
    }
  }
