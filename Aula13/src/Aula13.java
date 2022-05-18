public class Aula13 {
    public static void main(String[] args) throws Exception {
        // Programa principal
        // Animal x = new Animal(); ANIMAL É UMA CLASSE ABSTRATA E NÃO PODE SER INSTANCIADA
        /*Mamifero m = new Mamifero();
        //Lobo l = new Lobo();*/
        Cachorro c = new Cachorro();

        /*m.emitirSom();
        l.emitirSom();
        k.emitirSom();*/

        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);

    }
}
