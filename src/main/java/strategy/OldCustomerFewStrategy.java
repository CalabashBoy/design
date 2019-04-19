package strategy;

/**
 * @program: design
 * @description: 普通小批量客户
 * @author: Calabash
 * @create: 2019-04-19 22:51
 **/
public class OldCustomerFewStrategy implements Strategy {

  public double getPrice(double standPrice) {
    System.out.println("0.85");
    return standPrice * 0.85;
  }
}
