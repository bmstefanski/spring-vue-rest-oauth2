package pl.bmstefanski.website.configuration;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import pl.bmstefanski.website.WebsiteApplication;

@Configuration
public class SpringBootInitializer extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(WebsiteApplication.class);
  }

}
