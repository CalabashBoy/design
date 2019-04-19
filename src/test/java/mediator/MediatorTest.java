package mediator;

import org.junit.Test;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 23:36
 **/
public class MediatorTest {
  @Test
  public void test(){
    Mediator mediator = new President();

    Department development = new Development(mediator);
    Market market = new Market(mediator);
    Finacial finacial = new Finacial(mediator);


  }
}
