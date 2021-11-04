package com.wang.demo01;

public class Client {
    public static void main(String[] args) {
        // 房东要租房子
        Host host = new Host();
        // 代理,中介帮房东租房子
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
