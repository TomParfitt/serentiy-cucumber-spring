package starter.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({
    "starter"
})
@PropertySource("application.yaml")
public class FrameworkContextConfiguration {
}