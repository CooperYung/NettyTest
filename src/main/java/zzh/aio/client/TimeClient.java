package zzh.aio.client;

/**
 * @author
 * @Package
 * @Description:
 * @date 2021/1/25 0:17
 */
public class TimeClient {
    public static void main(String[] args) {
        Integer port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Integer value of error");
            }
        }
        new Thread(new AsyncTimeClientHandler("127.0.0.1", port), "AsyncTimeClient-001").start();

    }
}
