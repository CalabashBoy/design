package create.singleton;

/**
 * 延时加载，真正用的时候再初始化
 * 效率低
 * @program: design
 * @description: 懒汉方式
 * @author: Calabash
 * @create: 2019-04-16 22:53
 **/
public class SingletonDemo2 {

  private SingletonDemo2 instance;

  private SingletonDemo2() {
  }

  public synchronized SingletonDemo2 getInstance() {
    if (instance == null) {
      instance = new SingletonDemo2();
    }

    return instance;
  }
}
