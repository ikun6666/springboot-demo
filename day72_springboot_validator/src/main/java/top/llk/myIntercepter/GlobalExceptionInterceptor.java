package top.llk.myIntercepter;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Version 1.0
 * @Author: Lin Liangkun
 * @Date: 2019/12/29
 * @Content: 自定义异常拦截器, 拦截表单校验产生的异常
 */
@ControllerAdvice // @ControllerAdvice 该注解定义全局异常处理类
@ResponseBody
public class GlobalExceptionInterceptor {
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(HttpServletRequest request, Exception e) {
        String defaultMessage =null;
        // 经调试发现返回的是这个异常类org.springframework.validation.BindException
        if (e instanceof BindException) {
            //取出异常信息
             defaultMessage = ((BindException) e).getBindingResult().getFieldError().getDefaultMessage();
        }
        return defaultMessage;
    }
    // todo 使用ssm的异常处理未能实现
}
