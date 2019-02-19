import java.util.ArrayList;
import java.util.HashMap;

public class Server {


    private HashMap<Integer, IService> services;
    private ArrayList<String> log;

    public Server() {
        this.log = new ArrayList<>();
        this.services = new HashMap<>();
    }

    public String getLogAtLine(int line){
        return this.log.get(line);
    }

    public void listen(int port, IService service){
        this.log.add(service.getStartStatus());
        this.services.put(port, service);
    }

    public IService connect(int port){
        return this.services.get(port);
    }


}