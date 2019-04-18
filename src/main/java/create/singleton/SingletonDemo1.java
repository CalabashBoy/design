package create.singleton;

/**
 * 饿汉方式
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-16 22:49
 **/
public class SingletonDemo1 {

  //由于加载类时，天然线程安全的
  //没有延时加载模式
  private static SingletonDemo1 instance = new SingletonDemo1();

  private SingletonDemo1() {

  }

  public static SingletonDemo1 getInstance() {
    return instance;
  }
}
