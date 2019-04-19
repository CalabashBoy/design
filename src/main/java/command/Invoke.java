package command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: design
 * @description: 命令的调用者和发起者
 * @author: Calabash
 * @create: 2019-04-19 22:37
 **/
@Data
@AllArgsConstructor
public class Invoke {
  //通过容器很多命令批处理
  //db的事物类似此结构
  private Command commond;

  //业务方法
  public void call(){
    commond.execute();
  }
}
