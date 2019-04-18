package decorator;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 22:05
 **/
public class AICar extends SuperCar {

  public AICar(ICar car) {
    super(car);
  }

  @Override
  public void move() {
    super.move();
    autoMove();
  }

  public void autoMove(){
    System.out.println("zidong pao ");
  }



}
