package com.marcus.crudspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CrudspringApplicationTests {

	@Autowired
	TestRestTemplate restTemplate;


	//CashCard
	@Test
	void getShouldReturnACashCardWhenDataIsSaveFailure(){
		ResponseEntity<String> response = restTemplate.getForEntity("", String.class);

			assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}


	
}
