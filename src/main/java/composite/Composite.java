package composite;


/**
 * 容器组建
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 00:04
 **/
public interface Composite extends Component {
  void add(Component component);
  void remove(Component component);
  Component getChild(int index);
}
