package mediator;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 23:29
 **/
public class Market implements Department {

  private Mediator mediator;

  public Market(Mediator mediator) {
    this.mediator = mediator;
    mediator.register("market", this);
  }

  public void selfAction() {
    System.out.println("项目立项");
  }

  public void outAction() {
    System.out.println("市场部汇报工作，项目进度，需要资金支持");
  }
}
