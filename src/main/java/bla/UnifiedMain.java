package bla;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// the class is the configuration
@Configuration
@ComponentScan
public class UnifiedMain {

	public static void main(String... args) {
		try (final var context = new AnnotationConfigApplicationContext(UnifiedMain.class)) {
			System.out.println("in the main method");

			System.out.println(context.getBean(A.class));
		}
	}

	@PostConstruct
	public void init() {
		System.out.println("initializing from a @PostConstruct method");
	}

	@PreDestroy
	public void eol() {
		System.out.println("end of life ...");
	}
}
