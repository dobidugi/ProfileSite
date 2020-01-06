package myweb.main.service.scheduleling;




import myweb.main.service.parseservice.ParseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ParsingSchedule {

    @Autowired
    private ParseController parseController;
    @Scheduled(fixedRate = 1000)
    public  void test() throws IOException {
        parseController.onStart();
    }
}
