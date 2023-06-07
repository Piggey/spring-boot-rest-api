package pl.piggey.cars.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class AuthController {
    @GetMapping("/auth/test")
    public String fetchHello() {
        return "Siema";
    }
}
