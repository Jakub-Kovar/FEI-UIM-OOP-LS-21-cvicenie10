package sk.stuba.fei.uim.oop.feiuimoopls21cvicenie10.logika;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IGreetingService {

    @Override
    public String createResponse(HelloRequestBody request) {
        return "hello " + request.getName();
    }
}
