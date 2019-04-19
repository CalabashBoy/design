package state;

import javax.swing.undo.StateEdit;
import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @program: design
 * @description: 环境类 维护state
 * @author: Calabash
 * @create: 2019-04-19 23:39
 **/

public class Home {
  private State state;

  public void setState(State state){
    System.out.println("切换状态");
    this.state = state;
    state.handler();
  }

  public void getState(){

  }
}
