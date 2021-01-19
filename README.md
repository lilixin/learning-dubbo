# learning-dubbo

## 步骤
先启动本地 zookeeper  端口2181
然后启动 service-provider
再启动 service-consumer
访问 http://localhost:8082/consumer/hello?name=lilixin
service-provider控制能够看到相应日志输出

### 注意本地需要配置hosts
127.0.0.1 dubbo-provider.lilixin.top
127.0.0.1 dubbo-consumer.lilixin.top
