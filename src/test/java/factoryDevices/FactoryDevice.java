package factoryDevices;

public class FactoryDevice {
    public static IDevice make(String deviceType){
        IDevice device;
        switch (deviceType.toLowerCase()){
            case "android":
                device = new Android();
                break;
            default:
                device = new Ios();
                break;
        }
        return device;
    }
}
