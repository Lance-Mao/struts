package type;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Struts核心业务，请求数据自动封装以及类型自动转换
 *
 */
public class UserAction extends ActionSupport{

    //封装请求数据
   /* private String username;
    private String passwoed;
    private int age;
    private Date birth;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswoed(String passwoed) {
        this.passwoed = passwoed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }*/

    private User user = new User();

    //对象类型，一定要给get方法

    //处理注册请求
    public String register(){
        System.out.println(user);
        System.out.println(user.getUsername());
        System.out.println(user.getPasswoed());
        System.out.println(user.getAge());
        System.out.println(user.getBirth());
        return "success";
    }

    public void setUser(User user) {
        this.user = user;
    }
    public User getUser() {
        return user;
    }
}
