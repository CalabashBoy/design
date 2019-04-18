package mediator;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 23:29
 **/
public class Finacial implements Department {

  private Mediator mediator;

  public Finacial(Mediator mediator) {
    this.mediator = mediator;
    mediator.register("finacial", this);
  }

  public void selfAction() {
    System.out.println("数钱");
  }

  public void outAction() {
    System.out.println("汇报工作，钱太多了");
  }
}
