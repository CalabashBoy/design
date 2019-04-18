package chain;

public abstract class Leader {

  protected String name;
  protected Leader nextLeader;

  public Leader(String name) {
    this.name = name;
  }

  public void setNextLeader(Leader nextLeader) {
    this.nextLeader = nextLeader;
  }

  /**
   * 处理请求核心业务方法
   * @param leaveRequest
   */
  public abstract void handleRequest(LeaveRequest leaveRequest);
}
