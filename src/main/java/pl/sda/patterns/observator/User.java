package pl.sda.patterns.observator;

public class User implements Observer {

    private Blog blog;
    private String newestArticle;

    public User(Blog blog) {
        this.blog = blog;
    }

    @Override
    public void update() {
        newestArticle = blog.getNewestArticle();
    }

    public String getNewestArticle() {
        return newestArticle;
    }
}
