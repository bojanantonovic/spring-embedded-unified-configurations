package bla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

// shows that an integration test can have an internal @ComponentScan annotated configuration
@SpringJUnitConfig(InternalComponentScanAnnotatedConfigurationTest.EmptyConfiguration.class)
class InternalComponentScanAnnotatedConfigurationTest {

	@Autowired
	private A a;

	@Test
	void testA() {
		Assertions.assertNotNull(a);

		System.out.println("a:" + a);
	}

	@Configuration
	@ComponentScan
	static class EmptyConfiguration {
	}
}
