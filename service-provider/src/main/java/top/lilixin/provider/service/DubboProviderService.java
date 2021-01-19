package top.lilixin.provider.service;

import top.lilixin.dubbo.DubboInterface;

/**
 * @Description TODO
 * @Author lilixin
 * @Date 2021/1/19 11:21 上午
 **/
//@Service("dubboService")
public class DubboProviderService implements DubboInterface {
    public DubboProviderService() {
        System.out.println("init DubboProviderService================");
    }

    public void sayHello(String name) {
        System.out.println("hello "+name+" welcome to my world!");
    }
}
