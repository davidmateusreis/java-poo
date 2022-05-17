public class Aula11 {
    public static void main(String[] args) throws Exception {
       //Pessoa p1 = new Pessoa();
       Visitante v1 = new Visitante();
       v1.setNome("David");
       v1.setIdade(36);
       v1.setSexo("M");
       System.out.println(v1.toString());

       Aluno a1 = new Aluno();
       a1.setNome("Cláudio");
       a1.setMatricula(1111);
       a1.setCurso("Informática");
       a1.setIdade(16);
       a1.setSexo("M");
       a1.pagarMensalidade();

       Bolsista b1 = new Bolsista();
       b1.setMatricula(1112);
       b1.setNome("Ana");
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.pagarMensalidade();

       Professor p1 = new Professor();
       p1.setNome("Marcos");
       p1.receberAumento();

       Tecnico t1 = new Tecnico();
       t1.setNome("Carlos");
       t1.registroProfissional();
       t1.praticar();

    }
}
