package create;

import create.factory.abstractfactory.CarFactory;
import create.factory.abstractfactory.Engine;
import create.factory.abstractfactory.LuxureCarFactory;
import org.junit.Test;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-16 23:44
 **/
public class FactoryTest {
  @Test
  public void test(){
    CarFactory luxureCarFactory = new LuxureCarFactory();

    Engine e = luxureCarFactory.createEngine();
    e.run();
    e.start();
  }
}
