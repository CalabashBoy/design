package command;

import org.junit.Test;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-19 22:38
 **/
public class CommandTest {

  @Test
  public void test() {
    Command c = new ConcreteCommand(new Receiver());

    Invoke invoke = new Invoke(c);

    invoke.call();
  }
}
