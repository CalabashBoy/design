import decorator.Car;
import decorator.FlySuperCar;
import org.junit.Test;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 22:07
 **/
public class DecoratorTest {

  @Test
  public void test(){

    Car car = new Car();
    car.move();

    FlySuperCar flySuperCar = new FlySuperCar(car);
    flySuperCar.move();
  }

}
