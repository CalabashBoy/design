package create;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.Assert;
import org.junit.Test;
import create.singleton.SingletonDemo4;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-16 23:18
 **/
public class SingletonTest {

  /**
   * 反序列化测试
   *
   * @author: calabash
   * @param:
   * @return:
   * @date:2019/4/16
   **/
  @Test
  public void test()
      throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

    Class<SingletonDemo4> clazz = (Class<SingletonDemo4>) Class.forName(
        "create.singleton.SingletonDemo4");

    Constructor<SingletonDemo4> declaredConstructor = clazz.getDeclaredConstructor(null);

    declaredConstructor.setAccessible(true);

    SingletonDemo4 s3 = declaredConstructor.newInstance();
    SingletonDemo4 s4 = declaredConstructor.newInstance();

    Assert.assertNotEquals(s3, s4);
  }
}
