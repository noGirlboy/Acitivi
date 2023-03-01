package com.zq.acitivi;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@SpringBootTest
@ContextConfiguration(locations = {"classpath:activity.cfg.xml"})
class AcitiviApplicationTests {

	@Test
	void contextLoads() {
		//ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource(
				"activity.cfg.xml").buildProcessEngine();
		System.out.println(processEngine);
	}

}
