package adapter;

import lombok.Data;

/**
 * 一种是继承方案
 * 一种是组合
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 23:01
 **/
@Data
public class Adapter  implements Target {

  private Adaptee adaptee;

  public void handRequest() {
    this.adaptee.request();
  }
}
