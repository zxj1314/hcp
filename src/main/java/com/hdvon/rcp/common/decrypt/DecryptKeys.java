package com.hdvon.rcp.common.decrypt;

/**
 * Created by Toby on 2017/6/26.
 */
public enum DecryptKeys {
    DATASOURCE_USERNAME("spring.datasource.username"),
    DATASOURCE_PASSWORD("spring.datasource.password"),
    REDIS_PASSWORD("spring.redis.password");

    private String key;

    private DecryptKeys(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.key;
    }
}
