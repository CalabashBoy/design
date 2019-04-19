package strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 算法分离 选择实现
 * @program: design
 * @description: 管理算法
 * @author: Calabash
 * @create: 2019-04-19 22:53
 **/
@AllArgsConstructor
@Data
public class Context {

  //当前的算法
  private Strategy strategy;

  public void printPrice(double s){
    System.out.println(strategy.getPrice(s));
  }
}
