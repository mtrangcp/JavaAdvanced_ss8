package btth.singleton;

public class HardwareConnection {
    private static HardwareConnection instance;

    public HardwareConnection() {
    }

    public static HardwareConnection getInstance(){
        if(instance == null){
            instance = new HardwareConnection();
        }
        return instance;
    }

    public void connect(){
        System.out.println("da ket noi");
    }
    public void disconnect(){
        System.out.println("dong ket noi");
    }
}
