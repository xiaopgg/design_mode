package main;

/**
 * Created by apple on 2018/1/31.
 * 装饰器类 持有一个行为接口对象
 */
public class Decorator implements Component
{

    private Component component;

    public void setComponent(Component component){   //设置行为对象
        this.component = component;
    }

    /***
     * 调用传入行为的的行为实现方法。
     */
    @Override
    public void Operation() {

        if ( component != null)
        {
            component.Operation();
        }
    }
}
