package br.com.didafe.desafiotodolist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.didafe.desafiotodolist.entity.Todo;

@SpringBootTest
class DesafioTodolistApplicationTests {

	@Test
	void testCreateTodoSuccess() {
		var todo = new Todo("todo 1","desc todo 1", false, 1);
	}


	@Test
	void testCreateTodoFailure() {
	}
}
