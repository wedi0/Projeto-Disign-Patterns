// Lazy Initialization:
public class Singleton {


    public static Singleton instance;
    private String value;

    private Singleton (String value){
        this.value = value;
    }

    public static Singleton getSingleton(String value){

        if (instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }

    public String getValue(){
        return value;
    }
    
}
