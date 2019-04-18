package proxy.staticproxy;

import lombok.Data;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 23:25
 **/
@Data
public class ProxyStar implements Star {
  private  Star star;

  public void confer() {
    System.out.println("代理 conger");
  }

  public void signContract() {
    System.out.println("代理 sign");
  }

  public void bookTicket() {
    System.out.println("代理 book");
  }

  public void sing() {
    star.sing();
  }

  public void collectMoney() {
    System.out.println("代理 collectMoney");
  }
}
