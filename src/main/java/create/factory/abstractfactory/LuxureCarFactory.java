package create.factory.abstractfactory;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 00:20
 **/
public class LuxureCarFactory implements CarFactory {

  public Engine createEngine() {
    return new LuxuryEngine();
  }

  public Seat createSeat() {
    return new LuxurySeat();
  }

  public Tyre createTyre() {
    return new LuxuryTyre();
  }
}
