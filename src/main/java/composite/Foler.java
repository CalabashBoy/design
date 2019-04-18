package composite;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Foler implements AbstractFile {

  private String name;
  private List<AbstractFile> list = new ArrayList<AbstractFile>();

  public void killVirus() {
    for (AbstractFile file : list) {
      file.killVirus();
    }
  }

  public void add(AbstractFile file) {
    list.add(file);
  }

  public void remove(AbstractFile file) {
    list.remove(file);
  }


}
