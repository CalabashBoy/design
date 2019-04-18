package flyweight;

import org.junit.Test;

/**
 * 享元模式
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 22:52
 **/
public class FlyWeightTest {

  @Test
  public void test() {

    ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("black");
    ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("black");

    chess1.display(new Coordinate(10, 10));
    chess2.display(new Coordinate(20, 20));
  }
}
