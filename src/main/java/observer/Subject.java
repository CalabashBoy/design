package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-19 23:56
 **/
public class Subject {

  protected List<Observer> observerList = new ArrayList<Observer>();

  public void registerobserver(Observer observer){
    observerList.add(observer);
  }

  public void removeObserver(Observer observer){
    observerList.remove(observer);
  }

  public void notifyObservers(){
    for (Observer observer : observerList)
    {
      observer.update(this);
    }
  }
}
