package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class DataAction extends ActionSupport {

    @Override
    public String execute() throws Exception {

        //1.请求数据封装，2.调用service处理业务逻辑，拿到结果数据
        //3.数据保存到域中

       /* //Struts中对数据操作，方式一，直接拿到servletApi，执行操作
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        ServletContext servletContext = ServletActionContext.getServletContext();

        //保存
        request.setAttribute("request_data","request_data");
        session.setAttribute("session_data","session_data");
        servletContext.setAttribute("context_data","context_data");*/

        //Struts中对数据操作，方式二，通过Action类
        //推荐：解藕的方式实现对数据的操作
        ActionContext ac = ActionContext.getContext();
        //拿到struts对HttpServletRequest进行了封装，封装为一个map
        //拿到表示request对象map
        Map<String, Object> request = ac.getContextMap();
        //拿到表示Session对象map
        Map<String, Object> session = ac.getSession();
        //拿到表示servletContext对象map
        Map<String, Object> application = ac.getApplication();

        //数据
        request.put("request_data","request_data_request_data ");
        session.put("session_data","session_data_request_data ");
        application.put("context_data","context_data_request_data ");
        return SUCCESS;
    }
}
