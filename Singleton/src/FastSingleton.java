public class FastSingleton {
    
    private static FastSingleton instace = new FastSingleton();

    private FastSingleton(){
    }

    public static FastSingleton getInstFastSingleton(){
        return instace;
    }
}
