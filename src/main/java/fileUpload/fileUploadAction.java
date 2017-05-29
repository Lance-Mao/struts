package fileUpload;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;

public class fileUploadAction extends ActionSupport {

    //对应表单<input type="file" name="file1">
    private File file1;
    //文件名
    private String file1FileName;
    //文件类型
    private String file1ContentType;

    public void setFile1(File file1) {
        this.file1 = file1;
    }

    public void setFile1FileName(String file1FileName) {
        this.file1FileName = file1FileName;
    }

    public void setFile1ContentType(String file1ContentType) {
        this.file1ContentType = file1ContentType;
    }

    @Override
    public String execute() throws Exception {
        //拿到上传的文件，进行处理

        //把文件上传到upload目录

        //获取上传的文件目录
        String path = ServletActionContext.getServletContext().getRealPath("/upload");
        /**
         * 在Struts2开发中,除了将请求参数自动设置到Action的字段中,我们往往也需要在Action里直接获
         * 取请求(Request)或会话(Session)的一些信息,甚至需要直接对JavaServlet Http的请求(HttpServletRequest),
         * 响应(HttpServletResponse)操作.
         *
         * ServletActionContext(com.opensymphony.webwork. ServletActionContext),这个类直接继承了我们上面介
         * 绍的ActionContext,它提供了直接与Servlet相关对象访问的功能,它可以取得的对象有:
         (1)javax.servlet.http.HttpServletRequest : HTTPservlet请求对象
         (2)javax.servlet.http.HttpServletResponse : HTTPservlet相应对象
         (3)javax.servlet.ServletContext : Servlet上下文信息
         (4)javax.servlet.ServletConfig : Servlet配置对象
         (5)javax.servlet.jsp.PageContext : Http页面上下文
         */
        //创建目标文件对象
        File destFile = new File(path, file1FileName);
        //把上传的文件，拷贝到目标文件中
        FileUtils.copyFile(file1, destFile);
        return "success";
    }
}
