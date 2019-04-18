package create.factory.abstractfactory;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 00:16
 **/
public class LowEngine implements Engine {

  public void run() {
    System.out.println("转得慢");
  }

  public void start() {
    System.out.println("无法自动启动");
  }
}
