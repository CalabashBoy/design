package state;

import org.junit.Test;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-19 23:44
 **/
public class StateTest {

  @Test
  public void test(){
    Home home = new Home();
    home.setState(new BookState());

    home.setState(new CheckedState());
    home.setState(new FreeState());
  }
}
