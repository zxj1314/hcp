package com.hdvon.rcp;

import com.hdvon.rcp.common.decrypt.PropertyPasswordDecodingContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Toby on 2017/6/26.
 */
@EnableTransactionManagement
@SpringBootApplication
public class RcpJavaApplication {

	public static void main(String[] args) {
		SpringApplication application=new SpringApplication(RcpJavaApplication.class);
		application.addInitializers(new PropertyPasswordDecodingContextInitializer());
		application.run(args);
	}
}
