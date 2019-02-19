public class Chrome implements IBrowser {

    public String makeGetRequest(Server server){
        IWebServer webServer = (IWebServer) server.connect(80);
        return webServer.get("/");
    }

}
