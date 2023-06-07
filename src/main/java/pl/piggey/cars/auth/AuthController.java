package pl.piggey.cars.auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.piggey.cars.user.UserSignInDto;

@RestController
public class AuthController {
    @PostMapping("/auth/signup")
    public String signUp(@RequestBody UserSignInDto dto) {
        System.out.println(dto);
        return "Siema";
    }
}
