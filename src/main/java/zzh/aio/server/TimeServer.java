package zzh.aio.server;

/**
 * @author
 * @Package
 * @Description: NIO timeServer
 * @date 2021/1/24 21:52
 */
public class TimeServer {

    public static void main(String[] args) {
        int port = 8080;
        if (args != null && args.length > 0) {
            try{
                port = Integer.valueOf(args[0]);
            }catch (NumberFormatException e){
                System.out.println("Integer value of args[0] Error");
            }
        }
        AsyncTimeServerHandler timeServer = new AsyncTimeServerHandler(port);
        new Thread(timeServer, "AIO-AsyncTimeServerHandler-001").start();
    }
}
