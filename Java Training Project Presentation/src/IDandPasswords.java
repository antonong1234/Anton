import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("antonong", "paket95133674");
        logininfo.put("capslock12344", "paket95133674");
        logininfo.put("antonong1234","PakeT.95133674");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
