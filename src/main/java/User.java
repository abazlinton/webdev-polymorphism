public class User {

    private IBrowser faveBrowser;

    public User(IBrowser faveBrowser) {
        this.faveBrowser = faveBrowser;
    }

    public String browseWeb(Server server){
        return this.faveBrowser.makeGetRequest(server);
    }
}
