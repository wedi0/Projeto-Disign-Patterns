public class App {
    public static void main(String[] args) throws Exception {
        
        Carro c1 = FabricaCarro.getCarro(1);
        Carro c2 = FabricaCarro.getCarro(2);
        Carro c3 = FabricaCarro.getCarro(3);
        Carro c4 = FabricaCarro.getCarro(5);


        System.out.println(c1.getModelo());
        System.out.println(c2.getModelo());
        System.out.println(c3.getModelo());

        //Teste para ver se o resultado do c4 será nulo.
        System.out.println(c1);
        System.out.println(c4);
        
    }
}
