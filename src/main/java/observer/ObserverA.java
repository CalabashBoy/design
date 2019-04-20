package observer;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-20 00:01
 **/
public class ObserverA implements Observer {

  private int myState;


  public void update(Subject subject) {
    myState = ((ConcreteSubject)subject).getState();
    System.out.println("状态变化" + myState);
  }
}
