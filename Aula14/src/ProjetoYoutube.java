public class ProjetoYoutube {
    public static void main(String[] args) throws Exception {
        // Programa principal
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        // Pessoa p = new Pessoa("David", 36, "M"); CLASSE ABSTRATA NÃO PODE SER IMPLEMENTADA

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("David", 36, "M", "davidm");
        g[1] = new Gafanhoto("Ana", 16, "F", "aninhag");

        Visualizacao vi[] = new Visualizacao[5];
        vi[0] = new Visualizacao(g[0], v[2]); // David assistiu HTML5
        vi[0].avaliar();
        System.out.println(vi[0].toString());
        vi[1] = new Visualizacao(g[0], v[1]); // David assistiu PHP
        vi[0].avaliar(88.0f);
        System.out.println(vi[1].toString());


      /*System.out.println("VÍDEOS\n----------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n----------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
}
