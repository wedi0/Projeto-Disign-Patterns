public class FabricaCarro {

   

    public static Carro getCarro(int tipo){

        switch(tipo){

            case 1: 
                return new Fusca();
            case 2: 
                return new Caminhonete();
            case 3: 
                return new Mercedes();
        }

        return null;
        
    }
    
}
