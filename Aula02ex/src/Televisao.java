public class Televisao {
   String modelo;
   String cor;
   float tamanho;
   boolean ligada;
   void status() {
       System.out.println("O modelo da TV é " + this.modelo);
       System.out.println("A cor da TV é " + this.cor);
       System.out.println("O tamanho da TV é " + this.tamanho);
       System.out.println("A TV está ligada? " + this.ligada);
   }
   void exibir() {
       if(this.ligada == true) {
           System.out.println("Tem Netflix!");
       } else {
           System.out.println("Não tem Netflix!");
       }
   }
   void ligar() {
       this.ligada = true;
   }
   void desligar() {
       this.ligada = false;
   }
}
