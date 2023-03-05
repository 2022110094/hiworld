package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 10919
 * @version 1.0
 * Create by 2023/3/5 16:58
 */

public class TestSocket {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        String ip =host.getHostAddress();
        System.out.println("本机ip地址：" + ip);
    }
}
