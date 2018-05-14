
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

public class Hello {
    @Autowired
    @Qualifier("message002")
    private IMeaage message;


    public void sayMessage() {
        message.say();
    }

    ;
}
