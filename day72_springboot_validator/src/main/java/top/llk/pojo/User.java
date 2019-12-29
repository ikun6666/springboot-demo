package top.llk.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Version 1.0
 * @Author: Lin Liangkun
 * @Date: 2019/12/28
 * @Content:
 */
@Data
public class User {
    @NotNull(message = "传入的姓名为null,请传值")
    @NotEmpty(message = "传入的姓名为空字符串,请传值")
    private String name;
    @NotNull(message = "传入的电话为null,请传值")
    @NotEmpty(message = "传入的电话为空字符串,请传值")
    @Length(min = 6,max = 6,message = "电话号码长度为6位")
    private String phone;
}
