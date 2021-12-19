package bla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

// just the corresponding integration test
@SpringJUnitConfig(UnifiedMain.class)
class UnifiedMainTest {

	@Autowired
	private A a;

	@Test
	void testA() {
		Assertions.assertNotNull(a);

		System.out.println("a:" + a);
	}
}
