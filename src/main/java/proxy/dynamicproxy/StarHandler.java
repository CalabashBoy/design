package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import lombok.Data;
import proxy.staticproxy.Star;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 23:33
 **/
@Data
public class StarHandler implements InvocationHandler {

  Star realStar;

  public StarHandler(Star realStar) {
    this.realStar = realStar;
  }


  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    method.invoke(realStar, args);

    return null;
  }
}
