package create.singleton;

/**
 * 线程安全,类加载天然线程安全 懒加载，初始化类不会立刻初始化静态内部类
 *
 * @program: design
 * @description: 静态内部类实现
 * @author: Calabash
 * @create: 2019-04-16 23:04
 **/
public class SingletonDemo4 {

  private static class SingletonClassInstance {

    private static final SingletonDemo4 instance = new SingletonDemo4();
  }

  private SingletonDemo4() {
  }

  public SingletonDemo4 getInstance(){
    return SingletonClassInstance.instance;
  }
}
