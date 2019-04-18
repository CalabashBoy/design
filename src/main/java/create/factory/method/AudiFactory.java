package create.factory.method;

import create.factory.bean.Audi;
import create.factory.bean.Car;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 00:03
 **/
public class AudiFactory implements CarFactory{

  public Car create() {
    return new Audi();
  }
}
