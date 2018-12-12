package pl.bmstefanski.website;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsiteApplication {

  public final static Logger LOGGER = LoggerFactory.getLogger("Website");

  public static void main(String[] args) {
    SpringApplication.run(WebsiteApplication.class, args);
  }

}
