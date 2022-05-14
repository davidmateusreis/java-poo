public class Aula02ex {
    public static void main(String[] args) throws Exception {
        Televisao t1 = new Televisao();
        t1.modelo = "LED";
        t1.tamanho = 32.0f;
        t1.cor = "Preta";
        t1.ligar();
        t1.status();
        t1.exibir();

        Televisao t2 = new Televisao();
        t2.modelo = "OLED";
        t2.tamanho = 40.0f;
        t2.cor = "Prata";
        t2.desligar();
        t2.status();
        t2.exibir();


    
        

    }
}
