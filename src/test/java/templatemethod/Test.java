package templatemethod;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-19 23:05
 **/
public class Test {

  @org.junit.Test
  public void test() {
    BankTemplateMethod bankTemplateMethod = new BankTemplateMethod() {
      @Override
      public void transact() {
        System.out.println("我要存钱");
      }
    };

    bankTemplateMethod.process();
  }
}
