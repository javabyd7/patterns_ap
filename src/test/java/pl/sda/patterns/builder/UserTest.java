package pl.sda.patterns.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("email invalid@email should not be valid")
    @Test
    void invalidEmailTest() {
        User user = User.builder().email("invalid@email").build();
        assertThat(user.isEmailValid()).isFalse();
    }

    @DisplayName("email valid@email.com should be valid")
    @Test
    void validEmailTest() {
        User user = User.builder().email("valid@email.com").build();
        assertThat(user.isEmailValid()).isTrue();
    }

}