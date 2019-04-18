package chain;

/**
 * @program: design
 * @description: 主任
 * @author: Calabash
 * @create: 2019-04-18 23:09
 **/
public class Manager extends Leader {

  public Manager(String name) {
    super(name);
  }

  @Override
  public void handleRequest(LeaveRequest leaveRequest) {
    if (leaveRequest.getLeaveDays() < 10 && leaveRequest.getLeaveDays() >= 3) {
      System.out.println("经理审核通过");
    } else {
      if (this.nextLeader != null) {
        this.nextLeader.handleRequest(leaveRequest);
      }
    }
  }
}
