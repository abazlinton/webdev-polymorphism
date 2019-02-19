public class Express implements IService, IWebServer {

    @Override
    public String get(String resource){
        return "<h1>Hello World</h1>";
    }

    @Override
    public String getStartStatus(){
        return "Express is listening on port 80!";
    }

}
