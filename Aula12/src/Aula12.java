public class Aula12 {
    public static void main(String[] args) throws Exception {
        //Animal n = new Animal(); ANIMAL É ABSTRADO E NÃO PODE SER INSTANCIADO
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();

        c.locomover();
        k.locomover();
        k.emitirSom();
        j.locomover();
        t.locomover();
        g.locomover();
        e.locomover();
        

    }
}
