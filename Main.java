package controlador;
public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();    
        c.maisVolume();
        c.play();
        c.fecharMenu();      
 
    }
}
