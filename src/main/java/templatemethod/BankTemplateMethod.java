package templatemethod;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-19 23:03
 **/
public abstract class BankTemplateMethod {

  public void takeNumber(){
    System.out.println("取号");
  }

  public abstract void transact();//具体业务

  public void evaluate(){
    System.out.println("买单");
  }

  public final void process(){
    this.takeNumber();

    this.transact();

    this.evaluate();
  }
}
