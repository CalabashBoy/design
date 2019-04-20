package create.singleton;

/**
 * 优点：从它的实现中我们可以看到，这种方式的实现比较简单，在类加载的时候就完成了实例化，避免了线程的同步问题。
 * 缺点：由于在类加载的时候就实例化了，所以没有达到Lazy Loading(懒加载)的效果，也就是说可能我没有用到这个实例，但是它
 *       也会加载，会造成内存的浪费(但是这个浪费可以忽略，所以这种方式也是推荐使用的)。
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
