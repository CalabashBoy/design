package proxy;

import java.lang.reflect.Proxy;
import org.junit.Test;
import proxy.dynamicproxy.StarHandler;
import proxy.staticproxy.ProxyStar;
import proxy.staticproxy.RealStar;
import proxy.staticproxy.Star;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-17 23:16
 **/
public class ProxyTest {

  @Test
  public void test(){
    Star zhoujielun = new RealStar();

    ProxyStar proxyStar = new ProxyStar();
    proxyStar.setStar(zhoujielun);

    proxyStar.signContract();
    proxyStar.collectMoney();
    proxyStar.confer();

  }

  @Test
  public void test1(){
    Star zhoujielun = new RealStar();

    StarHandler handler = new StarHandler(zhoujielun);

    Star o = (Star) Proxy
        .newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);

    o.sing();
  }
}
