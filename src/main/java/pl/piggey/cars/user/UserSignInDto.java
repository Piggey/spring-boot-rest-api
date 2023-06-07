package pl.piggey.cars.user;

public record UserSignInDto(
    String username,
    String password
) { }
