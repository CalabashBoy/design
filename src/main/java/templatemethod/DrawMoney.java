package templatemethod;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-19 23:06
 **/
public class DrawMoney extends BankTemplateMethod{

  @Override
  public void transact() {
    System.out.println("我要取款");
  }
}
