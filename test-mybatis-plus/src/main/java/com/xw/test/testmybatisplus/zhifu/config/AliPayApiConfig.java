package com.xw.test.testmybatisplus.zhifu.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.xw.test.testmybatisplus.zhifu.properties.AliPayProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AliPayApiConfig {

    @Autowired
    private AliPayProperties aliPayProperties;
    private static final String JSON = "json";
    private static final String RSA2 = "RSA2";
    private static final String CHARSET = "UTF-8";
    public AlipayClient getAliPayClient() {
        DefaultAlipayClient alipayClient = new DefaultAlipayClient(
                aliPayProperties.getServerUrl(),
                aliPayProperties.getAppid(),
                aliPayProperties.getPrivateKey(),
                JSON,
                CHARSET,
                aliPayProperties.getPublvicKey()
        );
        return alipayClient;
    }
}
