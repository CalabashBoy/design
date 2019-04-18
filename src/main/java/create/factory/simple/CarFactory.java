package create.factory.simple;

import create.factory.bean.Audi;
import create.factory.bean.Byd;
import create.factory.bean.Car;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-16 23:55
 **/
public class CarFactory {

  public static Car createCar(String type) {
    if ("Audi".equals(type)) {
      return new Audi();
    } else if ("Byd".equals(type)) {
      return new Byd();
    } else {
      return null;
    }
  }
}
