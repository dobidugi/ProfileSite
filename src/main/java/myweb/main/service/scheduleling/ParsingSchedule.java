package myweb.main.service.scheduleling;




import myweb.main.service.parseservice.ParseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ParsingSchedule {

    @Autowired
    private ParseService parseService;
    @Scheduled(fixedRate = 3600000 )
    public  void test() throws IOException {
        parseService.onStart();
    }

}
