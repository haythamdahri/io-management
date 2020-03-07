package io.library.management;

import io.library.management.entities.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ManagementApplicationTests extends AbstractManagementApplicationTests {

    @LocalServerPort
    private int randomServerPort;

    @Test
    void contextLoads() {
    }

    @Test
    void getProductsList_And_ExpectNotEmpty() throws Exception {
        String uri = "http://localhost:" + this.randomServerPort + "/rest/products/";
        // Retrieve products, send authentication header
//        ResponseEntity<String> response = this.restTemplate.exchange(uri, HttpMethod.GET, new HttpEntity<>(this.createHeaders("user", "password")), String.class);
        ResponseEntity<Collection<Product>> response = this.restTemplate.exchange(uri, HttpMethod.GET,
                new HttpEntity<>(this.createHeaders("user", "password")),
                new ParameterizedTypeReference<Collection<Product>>(){});
        // Assert 200 response
        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
        // Check if products are returned using the mapper
//        Collection<Product> products = mapObjectToList(response.getBody());
        Collection<Product> products = response.getBody();
        System.out.println(products);
        Assertions.assertTrue(products.size() > 0);
    }

}
