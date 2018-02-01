/**
 * Created by apple on 2018/2/1.
 * RealSubject 类 ，定义Proxy 所代表的真正实体
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
