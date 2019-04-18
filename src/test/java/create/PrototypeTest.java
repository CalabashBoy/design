package create;

import create.factory.prototype.Sheep;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import org.junit.Test;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 22:21
 **/
public class PrototypeTest {

  @Test
  public void test() throws IOException, ClassNotFoundException {
    //序列化 反序列化实现
    Sheep s1 = new Sheep();
    s1.setBirthday(new Date());
    s1.setName("bibi");
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);

    oos.writeObject(s1);

    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bis);

    Sheep object = (Sheep) ois.readObject();
    System.out.println(object);
  }

  @Test
  public void test01() {
    long start = System.currentTimeMillis();

    for (int i = 0; i < 1000; i++) {
      LapTop lapTop = new LapTop();
    }

    long end = System.currentTimeMillis();

    System.out.println(end - start);
  }

  @Test
  public void test02() throws CloneNotSupportedException {
    long start = System.currentTimeMillis();

    LapTop lapTop = new LapTop();
    for (int i = 0; i < 1000; i++) {
      lapTop.clone();
    }

    long end = System.currentTimeMillis();

    System.out.println(end - start);
  }

  class LapTop implements Cloneable {

    public LapTop() {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {

      }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      Object clone = super.clone();
      return clone;
    }
  }
}
