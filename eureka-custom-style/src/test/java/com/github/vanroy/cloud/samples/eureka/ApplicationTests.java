package com.github.vanroy.cloud.samples.eureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.github.vanroy.cloud.samples.eurekacustomstyle.EurekaCustomStyleApplication;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EurekaCustomStyleApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port=0")
public class ApplicationTests {

	@Value("${local.server.port}")
	private int port = 0;

	@Test
	public void dashboardLoads() {
		ResponseEntity<String> entity = new TestRestTemplate().getForEntity("http://localhost:" + port + "/", String.class);
		assertEquals(HttpStatus.OK, entity.getStatusCode());
	}
}