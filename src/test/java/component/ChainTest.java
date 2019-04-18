package component;

import chain.Director;
import chain.GeneralManager;
import chain.Leader;
import chain.LeaveRequest;
import chain.Manager;
import org.junit.Test;

/**
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 23:13
 **/
public class ChainTest {

  @Test
  public void test() {
    Leader a = new Director("主任");
    Leader b = new Manager("经理");
    Leader c = new GeneralManager("总经理");

    a.setNextLeader(b);
    b.setNextLeader(c);

    LeaveRequest leaveRequest = new LeaveRequest("tom", 10, "回家");

    a.handleRequest(leaveRequest);
  }
}
