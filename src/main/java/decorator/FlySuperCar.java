package decorator;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 22:04
 **/
public class FlySuperCar extends SuperCar {

  public FlySuperCar(ICar car) {
    super(car);
  }

  public void fly() {
    System.out.println("可以飞");
  }

  @Override
  public void move() {
    super.move();
    fly();
  }
}
