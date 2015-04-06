package clocks;

public class Controller {
    private  Clock clock;
    private String time;
    private String city;
    
    public Controller() {
        
    }
    
    public void InitializeProgram() {
        Input input = new Input();
    }
    
    public void calculateData(Data data) {    
        clock = new Clock(data.getCity(), data.getAdjustment());
        clock.run();
        
        time = clock.getTimestamp();
        city = data.getCity();
    }
    
    public String getTime() {
        return time;
    }
    
    public String getCity() {
        return city; 
    }
}
