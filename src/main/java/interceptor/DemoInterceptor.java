package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


/**
 * 自定义拦截器
 * 第一步：创建一个普通的类，继承AbstractInterceptor，实现抽象方法intercept
 */public class DemoInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("DemoInterceptor拦截器拦截了！");
        return null;
    }
}
