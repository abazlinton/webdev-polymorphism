import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServerTest {

    private Server server;
    private IService express;

    @Test
    public void canConnectWebServer(){
        server = new Server();
        express = new Express();
        server.listen(80, express);
        String startStatus = server.connect(80).getStartStatus();
        assertEquals("Express is listening on port 80!", startStatus);
    }

    @Test
    public void logsOnListen(){
        server = new Server();
        express = new Express();
        server.listen(80, express);
        assertEquals("Express is listening on port 80!", server.getLogAtLine(0));
    }



}
