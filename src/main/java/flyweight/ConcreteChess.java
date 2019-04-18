package flyweight;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 22:45
 **/
public class ConcreteChess implements ChessFlyWeight {

  private String color;

  public ConcreteChess(String color) {
    super();
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void display(Coordinate coordinate) {
    System.out.println("棋子颜色" + color);
    System.out.println("棋子位置" + coordinate.getX() + " " + coordinate.getY());
  }
}
