public class Aluno extends Pessoa {
    // Atributos
    private int mat;
    private String curso;
    // Métodos
    public void cancelarMatr() {
        System.out.println("A matrícula será cancelada.");
    }
    // Métodos Especiais
    public int getMatr() {
        return mat;
    }
    public void setMatr(int mat) {
        this.mat = mat;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
