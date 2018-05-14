import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
    @Bean
    public Hello Hello() {
        return new Hello();
    }

    @Bean
    public Message002 message002(    ) {
        return new Message002();
    }

    ;
}
