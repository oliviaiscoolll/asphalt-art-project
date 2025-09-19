import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    PokemonPainter olivia = new PokemonPainter();


    //String input controls background color
    //Paints solid color background over back outline
    olivia.paintCharmanderOutline("white");

    //Paints eye
    //Sting input controls eye color
    olivia.paintCharmanderEye("black");

    //Colors in the outline
    //String input controls primary color
    olivia.colorCharmander("orange");
  }
}