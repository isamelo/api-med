package med.voll.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApiApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
	}

	@Test
	void applicationContextShouldLoadSuccessfully() {
		assertThat(applicationContext).isNotNull();
		assertThat(applicationContext.getApplicationName()).isNotEmpty();
	}

}
