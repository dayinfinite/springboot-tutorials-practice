package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author dayinfinite
 * @date 2019/01.17
 */

@RestController
public class HemoController {
    @GetMapping("/")
    public String index(){
        return "Welcome to the home page";
    }
}
