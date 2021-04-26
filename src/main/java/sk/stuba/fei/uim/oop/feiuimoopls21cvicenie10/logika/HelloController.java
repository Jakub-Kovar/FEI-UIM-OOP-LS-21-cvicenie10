package sk.stuba.fei.uim.oop.feiuimoopls21cvicenie10.logika;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private int counter = 0;

    @GetMapping("/hello")
    public String hello() {
        return "hello world " + (this.counter++);
    }

    @GetMapping("/param")
    public String helloParam(@RequestParam(name = "name", defaultValue = "world") String name) {
        return "hello " + name;
    }

    @GetMapping("/path/{name}")
    public String helloPathVariable(@PathVariable("name") String name) {
        return "hello " + name;
    }
}
