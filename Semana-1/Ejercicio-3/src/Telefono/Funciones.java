package Telefono;

public class Funciones {

    Tecla t = new Tecla();
    String abc = "-abcdefghijklmnñopqrstuvwxyz";
    
    public void Calcular(String oracion){
        for(int i = 0; i >= oracion.length()-1; i++){
            for(int j = 0; j >= abc.length()-1; j++){
                if(oracion.charAt(i) == abc.charAt(j)){
                    System.out.println("si");
                }
            }
        }
    }
       
}
