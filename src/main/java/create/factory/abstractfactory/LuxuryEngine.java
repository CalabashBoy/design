package create.factory.abstractfactory;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 00:15
 **/
public class LuxuryEngine implements Engine {

  public void run() {
    System.out.println("转得快");
  }

  public void start() {
    System.out.println("可以自动启动");
  }
}
