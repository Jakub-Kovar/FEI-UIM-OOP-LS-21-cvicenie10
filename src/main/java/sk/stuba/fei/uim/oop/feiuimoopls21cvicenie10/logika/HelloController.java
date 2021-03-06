package sk.stuba.fei.uim.oop.feiuimoopls21cvicenie10.logika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private IGreetingService service;

    private int counter = 0;

    @Autowired
    public HelloController(IGreetingService service) {
        this.service = service;
    }

    @GetMapping(value = "/hello")
    public HelloResponse hello() {
        return new HelloResponse(this.counter++, "hello world");
    }

    @GetMapping("/param")
    public String helloParam(@RequestParam(name = "name", defaultValue = "world") String name) {
        return "hello " + name;
    }

    @GetMapping("/path/{name}")
    public String helloPathVariable(@PathVariable("name") String name) {
        return "hello " + name;
    }

    @PostMapping("/body")
    public String body(@RequestBody HelloRequestBody body) {
        return service.createResponse(body);
    }
}
