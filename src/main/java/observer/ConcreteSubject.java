package observer;


/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-19 23:59
 **/
public class ConcreteSubject extends Subject {
  private int state;

  public int getState()
  {
    return state;
  }

  public void setState(int state){
    this.state = state;
    this.notifyObservers();
  }
}
