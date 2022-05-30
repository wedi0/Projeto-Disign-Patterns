public class App {
    public static void main(String[] args) throws Exception {
        
        Singleton teste1 = Singleton.getSingleton("Ronaldinho");
        Singleton teste2 = Singleton.getSingleton("Camillyzinha");

        System.out.println(teste1.getValue());
        System.out.println(teste2.getValue());

        FastSingleton teste3 = FastSingleton.getInstFastSingleton();

        System.out.println(teste3);

    }
}
