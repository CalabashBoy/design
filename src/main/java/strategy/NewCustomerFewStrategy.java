package strategy;

/**
 * @program: design
 * @description: 普通小批量客户
 * @author: Calabash
 * @create: 2019-04-19 22:51
 **/
public class NewCustomerFewStrategy implements Strategy {

  public double getPrice(double standPrice) {
    System.out.println("不打折原价");
    return standPrice;
  }
}
