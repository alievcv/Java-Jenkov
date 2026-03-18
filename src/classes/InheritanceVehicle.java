package classes;

public class InheritanceVehicle {
    private String engine;

    public InheritanceVehicle(String engine) {
        this.engine = engine;
    }

    public InheritanceVehicle() {
    }

    public void start(){
        System.out.println("Engine: " + engine);
    }

    public void stop(){
        System.out.println("Engine: " + engine);
    }

    public String getEngine(){
        return engine;
    }

    public void setEngine(String engine){
        this.engine = engine;
    }
}
