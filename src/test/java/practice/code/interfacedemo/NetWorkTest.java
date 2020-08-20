package practice.code.interfacedemo;

import sun.nio.ch.Net;

/**
 * Description:代理模式
 * date: 2020 2020/8/11 12:26
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class NetWorkTest {
    public static void main(String[] args) {
        Server server =new Server();
       ProxyServer proxyServer = new ProxyServer(server);
       proxyServer.browse();
    }
}

interface NetWork{
    public void browse();
}

//被代理类
class Server implements NetWork{

    public void browse() {
        System.out.println("真实的服务器访问网络"
        );
    }
}

//代理类
class ProxyServer implements NetWork{

    private  NetWork netWork;

    public ProxyServer(NetWork netWork){
       this.netWork = netWork;
    }

    public void check(){
        System.out.println("联网前检查");
    }

    public void browse() {
            check();
            netWork.browse();
    }
}

