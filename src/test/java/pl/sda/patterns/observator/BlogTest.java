package pl.sda.patterns.observator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BlogTest {


    @Test
    void userShouldHaveNewestArticle() {
        Blog blog = new Blog();
        User user = new User(blog);
        blog.attach(user);
        String newestArticle = "new article";

        blog.setNewestArticle(newestArticle);

        assertThat(user.getNewestArticle()).isEqualTo(newestArticle);
    }
}