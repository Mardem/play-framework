package views;

import org.junit.Test;
import play.twirl.api.Content;

import static org.junit.Assert.assertEquals;

public class HelloViewTest {
    @Test
    public void renderTemplate() {
        Content html = views.html.hello.render("Welcome to Play!", "Marden Cavalcante");
        assertEquals("text/html", html.contentType());
        assert(html.body().toString().contains("Hello World"));
    }
}
