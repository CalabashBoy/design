package chain;

/**
 * @program: design
 * @description: 主任
 * @author: Calabash
 * @create: 2019-04-18 23:09
 **/
public class Director extends Leader {

  public Director(String name) {
    super(name);
  }

  @Override
  public void handleRequest(LeaveRequest leaveRequest) {
    if (leaveRequest.getLeaveDays() < 3) {
      System.out.println("主任审核通过");
    } else {
      if (this.nextLeader != null) {
        this.nextLeader.handleRequest(leaveRequest);
      }
    }
  }
}
