package top.lilixin.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lilixin.dubbo.DubboInterface;

import javax.annotation.PostConstruct;

/**
 * @Description TODO
 * @Author lilixin
 * @Date 2021/1/19 11:32 上午
 **/
@RestController
public class ConsumerController {
    @PostConstruct
    void init(){
        System.out.println("init success =====================");
    }
    @Autowired
    private DubboInterface dubboService;

    @RequestMapping("/consumer/hello")
    public void testConsumer(String name){

        dubboService.sayHello(name);
    }
}
