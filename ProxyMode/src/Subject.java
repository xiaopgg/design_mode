/**
 * Created by apple on 2018/2/1.
 * Subject类，定义了RealSubject和Proxy的功用接口，这样就在任何使用RealSubjecty的地方都可以使用Proxy
 */
public interface Subject
{
    void request();
}
