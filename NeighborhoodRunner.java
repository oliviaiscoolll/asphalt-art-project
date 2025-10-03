import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
  // Fills and paints in the background
  BackgroundPainter Olivia = new BackgroundPainter();
    Olivia.setPaint(100000);

    Olivia.paintBackground();
// Paints flower
 FlowerPainter fp = new FlowerPainter();
    fp.setPaint(100000);
    fp.paintFlower();
    
  }
}