package chain;

/**
 * @program: design
 * @description: 主任
 * @author: Calabash
 * @create: 2019-04-18 23:09
 **/
public class GeneralManager extends Leader {

  public GeneralManager(String name) {
    super(name);
  }

  @Override
  public void handleRequest(LeaveRequest leaveRequest) {
    if (leaveRequest.getLeaveDays() < 30 && leaveRequest.getLeaveDays() >= 10) {
      System.out.println("经理审核通过");
    } else {
      System.out.println("请加太多了 ，想辞职");
    }
  }
}
