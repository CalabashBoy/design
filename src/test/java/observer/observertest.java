package observer;

import org.junit.Test;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-20 00:02
 **/
public class observertest {

  @Test
  public void test(){
    ConcreteSubject subject = new ConcreteSubject();

    Observer observerA = new ObserverA();
    Observer observerB = new ObserverA();
    Observer observerC = new ObserverA();

    subject.registerobserver(observerA);
    subject.registerobserver(observerB);
    subject.registerobserver(observerC);

    subject.setState(3000);
  }
}
