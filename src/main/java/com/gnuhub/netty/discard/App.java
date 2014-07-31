package com.gnuhub.netty.discard;

/**
 * Hello world!
 *
 */
public class App 
{
    private int port;

    public App(int port){
        this.port = port;
    }
    public static void main( String[] args )
    {
        // 实现可以从命令行接收参数指定服务器要绑定的端口
        int port;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        } else {
            port = 8077;
        }
        System.out.println(port);
        // 使用构造函数向对象传递参数
        System.out.println(new App(port).port);
    }
}
