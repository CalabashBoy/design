package decorator;

import javax.swing.Icon;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 22:02
 **/
public class SuperCar implements ICar {

  private ICar iCar;

  public SuperCar(ICar car) {
    iCar = car;
  }

  public void move() {
    iCar.move();
  }
}
