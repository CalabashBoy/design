package state;

/**
 * @program: design
 * @description: 空闲
 * @author: Calabash
 * @create: 2019-04-19 23:41
 **/
public class BookState implements State {

  public void handler() {
    System.out.println("房间已经预定");
  }
}
