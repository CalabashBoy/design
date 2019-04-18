package mediator;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 23:29
 **/
public class Development implements Department {

  private Mediator mediator;

  public Development(Mediator mediator){
    this.mediator = mediator;
    mediator.register("development",this);
  }

  public void selfAction() {
    System.out.println("专心研发");
  }

  public void outAction() {
    System.out.println("研发没钱了");
  }
}
