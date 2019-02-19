import org.junit.Test;

public class ChromeTest {

    @Test
    public void canGetPage(){
        Server computer = new Server();
        IService express = new Express();
        Chrome chrome = new Chrome();
        computer.listen(80, express);
        chrome.makeGetRequest(computer);
    }

}
