package com.zq.acitivi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class AcitiviApplication {

	public static void main(String[] args) throws UnknownHostException {
		ConfigurableApplicationContext application =SpringApplication.run(AcitiviApplication.class, args);
		Environment env = application.getEnvironment();
		String ip = InetAddress.getLocalHost().getHostAddress();
		String port = env.getProperty("server.port");
		String[] prof = env.getActiveProfiles();
		String contextPath = env.getProperty("server.servlet.context-path");
		if (contextPath == null) {
			contextPath = "";
		}
		log.info("环境是：{}",prof[0]);
		log.info("\n----------------------------------------------------------\n\t" +
				"应用启动成功! Access URLs:\n\t" +
				"Local: \t\thttp://localhost:" + port + contextPath + "\n\t" +
				"External: \thttp://" + ip + ':' + port + contextPath + '\n' +
				"----------------------------------------------------------");
	}
}
