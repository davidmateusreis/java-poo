public class Professor extends Aluno {
    // Atributos
    private String especialidade;
    private float salario;
    // Métodos
    public void receberAumento() {
        System.out.println(this.nome + " merece um aumento!");
    }
    // Métodos Especiais
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

}
