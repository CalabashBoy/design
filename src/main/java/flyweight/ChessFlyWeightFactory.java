package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂
 *
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 22:48
 **/
public class ChessFlyWeightFactory {

  private static Map<String, ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();

  public static ChessFlyWeight getChess(String color) {
    if (map.get(color) != null) {
      return map.get(color);
    } else {
      ChessFlyWeight cfw = new ConcreteChess(color);
      map.put(color, cfw);
      return cfw;
    }
  }
}
