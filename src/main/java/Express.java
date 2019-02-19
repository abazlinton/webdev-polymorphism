public class Express implements IService, IWebServer {

    @Override
    public String get(String resource){
        if (resource.equals("/")){
            return "<h1>Hello World</h1>";
        }
        return "";
    }

    @Override
    public String getStartStatus(){
        return "Express is listening on port 80!";
    }

}
