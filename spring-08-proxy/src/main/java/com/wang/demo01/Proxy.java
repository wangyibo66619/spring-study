package com.wang.demo01;

// 中介
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }


    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    // 看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    // 签合同
    public void hetong(){
        System.out.println("签租赁合同");
    }

    // 收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
