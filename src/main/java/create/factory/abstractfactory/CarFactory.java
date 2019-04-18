package create.factory.abstractfactory;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 00:19
 **/
public interface CarFactory {
  Engine createEngine();
  Seat createSeat();
  Tyre createTyre();
}
