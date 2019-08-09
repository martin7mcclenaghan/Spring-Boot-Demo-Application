package learning.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class Main {

    // == constants //
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Person[] people = new Person[10];
        people = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", Person[].class);
        log.info(Arrays.toString(people));
    }
}
