package create.factory.prototype;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 22:18
 **/
@Data
public class Sheep implements Cloneable , Serializable {

  private String name;
  private Date birthday;

  //注意深浅复制
  @Override
  protected Object clone() throws CloneNotSupportedException {
    //底层是c实现的
    Object object = super.clone();

    return object;
  }


}
