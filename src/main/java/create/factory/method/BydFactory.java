package create.factory.method;

import create.factory.bean.Byd;
import create.factory.bean.Car;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 00:04
 **/
public class BydFactory implements CarFactory {

  public Car create() {
    return new Byd();
  }
}
