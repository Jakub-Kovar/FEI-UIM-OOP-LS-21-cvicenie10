package sk.stuba.fei.uim.oop.feiuimoopls21cvicenie10.logika;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class AhojService implements IGreetingService {

    @Override
    public String createResponse(HelloRequestBody request) {
        return "ahoj " + request.getName();
    }
}
