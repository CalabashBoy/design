package mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 23:33
 **/
public class President implements Mediator {

  private Map<String, Department> map = new HashMap<String, Department>();


  public void register(String dname, Department department) {
    map.put(dname, department);
  }

  public void commond(String dname) {
    map.get(dname).selfAction();
  }
}
