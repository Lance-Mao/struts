package fileUpload;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.util.Map;

/**
 * 文件下载
 * 1.显示所有要下载文件的列表
 * 2.文件下载
 */
public class DownAction extends ActionSupport {

    /**
     * 显示所有要下载的文件的列表
     */

    public String list() throws Exception {
        //得到upload目录文件
        String path = ServletActionContext.getServletContext().getRealPath("/upload");
        //目录对象
        File file = new File(path);
        //得到所有要下载的文件的文件名
        String[] fileNames = file.list();
        //保存
        ActionContext ac = ActionContext.getContext();
        //得到代表request的map（第二种方式）
        Map<String,Object> request = (Map<String, Object>) ac.get("request");
        request.put("fileNames", fileNames);
        return "list";
    }
}
