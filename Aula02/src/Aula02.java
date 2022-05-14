public class Aula02 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.modelo = "Esferográfica";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Tinteiro";
        c2.cor = "Preta";
        c2.ponta = 1.0f;
        c2.destampar();
        c2.status();
        c2.rabiscar();

        Caneta c3 = new Caneta();
        c3.modelo = "Gel";
        c3.cor = "Vermelha";
        c3.ponta = 2.0f;
        c3.tampar();
        c3.status();
        c3.rabiscar();
    }
}
