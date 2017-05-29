package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * 数据处理 方式三，实现接口的方法
 */
public class DataAction2 extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
    private Map<String, Object> request;
    private Map<String, Object> session;
    private Map<String, Object> application;

    //struts运行的时候，会把代表request的map对象注入
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;

    }

    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }

    @Override
    public String execute() throws Exception {
        request.put("request_data","request_data_request_Aware ");
        session.put("session_data","session_data_request_Aware ");
        application.put("context_data","context_data_request_Aware ");
        return SUCCESS;
    }
}
