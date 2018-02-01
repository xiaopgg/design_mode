/**
 * Created by apple on 2018/2/1.
 * 客户端类，访问代理就可以执行请求
 */
public class  Client {

    public static void main(String[] args)
    {
        Proxy proxy = new Proxy();  // 获取代理
        proxy.request(); //代理执行请求
    }

}
