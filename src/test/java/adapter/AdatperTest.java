package adapter;

import org.junit.Test;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 22:59
 **/
public class AdatperTest {

  @Test
  public void test(){
    Adaptee adaptee = new Adaptee();
    Adapter t = new Adapter();

    t.setAdaptee(adaptee);
    t.handRequest();
  }
}
