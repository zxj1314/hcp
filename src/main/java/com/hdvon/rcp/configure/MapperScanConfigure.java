package com.hdvon.rcp.configure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Toby on 2017/6/26.
 */
@Configuration
@MapperScan("com.hdvon.rcp.mapper")
public class MapperScanConfigure {
}
