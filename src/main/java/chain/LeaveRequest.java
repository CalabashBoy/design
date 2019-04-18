package chain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 存储请加信息
 * @program: design
 * @description:
 * @author: Calabash
 * @create: 2019-04-18 23:05
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeaveRequest {
  private String empName;
  private int leaveDays;
  private String reason;
}
