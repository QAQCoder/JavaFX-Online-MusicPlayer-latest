package base;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseController {
    public static Map<String, BaseController> BC_CONTEXT = new HashMap<>();

    public BaseController() {
        BC_CONTEXT.put(this.getClass().getName(), this);
    }

    //更新ui界面
    public void updateUi(Object data, int flag){}

    //初始化数据
    public void initData(Object data) { }
}
