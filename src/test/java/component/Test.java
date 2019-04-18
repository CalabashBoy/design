package component;

import composite.AbstractFile;
import composite.Foler;
import composite.ImageFile;
import composite.TextFile;
import composite.VFile;
import java.util.Arrays;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 00:14
 **/
public class Test {
  @org.junit.Test
  public void test() {
    AbstractFile f2,f3,f4;

    f2 = new VFile("视频");
    f3 = new TextFile("txt");
    f4 = new ImageFile("image");
    Foler f1 = new Foler("我的收藏", Arrays.asList(f2,f3,f4));
    Foler f5 = new Foler("我的收藏2", Arrays.asList(f2,f3,f4,f1));
    f5.killVirus();
  }
}
