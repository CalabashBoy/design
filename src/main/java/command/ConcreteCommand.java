package command;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-19 22:35
 **/
public class ConcreteCommand implements Command {

  //命令的真正执行者
  private Receiver receiver;

  public void execute() {
    receiver.action();
  }

  public ConcreteCommand(Receiver receiver) {
    super();
    this.receiver = receiver;
  }
}
