import com.opensymphony.xwork2.ActionSupport;

/**
 * create by dong on 2019/10/18
 */
public class LoginAction extends ActionSupport {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
