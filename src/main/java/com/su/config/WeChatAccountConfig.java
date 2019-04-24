package com.su.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 公众账号与账号相关的信息：如appId，secret等，从配置文件中获取
 */
@Component
@Data
@ConfigurationProperties(prefix = "wechat")
public class WeChatAccountConfig {
    /**
     * 公众账号appId：从配置文件中获取
     */
    private String mpAppId;

    /**
     * 公众账号secret：从配置文件中获取
     */
    private String mpAppSecret;
}