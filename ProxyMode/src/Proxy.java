/**
 * Created by apple on 2018/2/1.
 * Proxy ，保存一个引用似的代理可以访问实体，并提供一个与Subject的接口相同的接口，这样代理就可以用来替代实体
 */
public class Proxy implements Subject {
    private RealSubject realSubject;
    @Override
    public void request() {
        if ( null==realSubject )
        {
            realSubject = new RealSubject();
        }

        realSubject.request();
    }
}
