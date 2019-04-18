package create.factory.simple;

import create.factory.bean.Audi;
import create.factory.bean.Byd;
import create.factory.bean.Car;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 00:01
 **/
public class CarFactory2 {
  public static Car createAudi(){
    return new Audi();
  }

  public static Car createByd(){
    return new Byd();
  }
}
