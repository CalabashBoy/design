package mediator;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 23:28
 **/
public interface Mediator {
  void register(String dname, Department department);

  void commond(String dname);
}
