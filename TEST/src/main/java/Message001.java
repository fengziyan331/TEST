import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class Message001 implements IMeaage{


    public void say() {
        System.out.println("Message001.say");
    }
}
