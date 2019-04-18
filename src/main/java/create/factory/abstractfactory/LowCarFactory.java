package create.factory.abstractfactory;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 00:21
 **/
public class LowCarFactory implements CarFactory {

  public Engine createEngine() {
    return new LowEngine();
  }

  public Seat createSeat() {
    return new LowSeat();
  }

  public Tyre createTyre() {
    return new LowTyre();
  }
}
