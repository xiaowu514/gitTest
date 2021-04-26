package com.xw.test.testmybatisplus.zhifu.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "pay.alibaba")
public class AliPayProperties {

    private String appid;

    private String privateKey;
    private String publvicKey;
    private String serverUrl;
    private String returnUrl;
    private String notyfyUrl;


}
