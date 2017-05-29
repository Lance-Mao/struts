package interceptorAction;

import com.opensymphony.xwork2.ActionSupport;

public class Demo1Action extends ActionSupport {

    public String save() throws Exception {
        System.out.println("DemoAction中的动作执行了！");
        return SUCCESS;
    }
}
