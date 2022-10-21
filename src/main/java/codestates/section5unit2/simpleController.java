package codestates.section5unit2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simpleController {

    @GetMapping("/")
    public String simplePrint(){
        return "To-do Application !";
    }

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello world !";
    }
}
