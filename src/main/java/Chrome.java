public class Chrome implements IBrowser {

    @Override
    public String makeGetRequest(Server server){
        IWebServer webServer = (IWebServer) server.connect(80);
        return webServer.get("/");
    }

}
