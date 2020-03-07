package io.library.management;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.library.management.entities.Product;
import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Collection;

@RunWith(SpringRunner.class)
class AbstractManagementApplicationTests {

    @Autowired
    protected RestTemplate restTemplate;

    protected Collection<Product> mapObjectToList(String rawProducts) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Product> products = objectMapper.readValue(rawProducts, Collection.class);
        return products;
    }

    protected HttpHeaders createHeaders(String username, String password){
        return new HttpHeaders() {{
            String auth = username + ":" + password;
            byte[] encodedAuth = Base64.encodeBase64(
                    auth.getBytes(Charset.forName("US-ASCII")) );
            String authHeader = "Basic " + new String( encodedAuth );
            set( "Authorization", authHeader );
        }};
    }

}
