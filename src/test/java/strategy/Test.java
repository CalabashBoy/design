package strategy;

import flyweight.ConcreteChess;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-19 22:56
 **/
public class Test {

  @org.junit.Test
  public void test(){
    Strategy s1 = new OldCustomerFewStrategy();

    Context context = new Context(s1);

    context.printPrice(1000);
  }
}
