package bla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

// demo for using a @ComponentScan annotated empty configuration from outside
@SpringJUnitConfig(EmptyConfigurationWithComponentScan.class)
class ExternalComponentScanAnnotatedConfigurationTest {
	@Autowired
	private A a;

	@Test
	void testA() {
		Assertions.assertNotNull(a);

		System.out.println("a:" + a);
	}
}
