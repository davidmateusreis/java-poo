public class Gafanhoto extends Pessoa {
    // Atributos
    private String login;
    private int totAssistido;
    // Métodos
    // Métodos Especiais
    public Gafanhoto(String nome, int idade, String sexo, String login) { // Construtor
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) { // Getters e Setters
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
}
