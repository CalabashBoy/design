package composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 00:09
 **/
@Data
@AllArgsConstructor
public class TextFile implements AbstractFile {

  private String name;

  public void killVirus() {
    System.out.println("kill text : " + name);
  }
}
