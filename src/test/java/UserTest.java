import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    private Server google;
    private User user;
    private IBrowser chrome;

    @Test
    public void canBrowseGoogle(){
        chrome = new Chrome();
        user = new User(chrome);
        google = new Server();
        IService webServer = new Express();
        google.listen(80, webServer);
        String webpage = user.browseWeb(google);
        assertEquals("<h1>Hello World</h1>", webpage);
    }

}
