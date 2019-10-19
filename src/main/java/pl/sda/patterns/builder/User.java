package pl.sda.patterns.builder;

import lombok.Builder;
import org.apache.commons.validator.routines.EmailValidator;

@Builder
public class User {

    private String firstName;
    private String lastName;
    private Sex sex;
    private String email;

    public Boolean isEmailValid() {
        return EmailValidator.getInstance().isValid(email);
    }

}