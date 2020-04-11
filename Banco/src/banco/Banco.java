
package banco;

public class Banco {

    public static void main(String[] args) {
        
        AbrirConta pessoa1 = new AbrirConta();
        pessoa1.abrirConta("cc");
        pessoa1.setNumConta(1111);
        pessoa1.setDono("Jubileu");
        pessoa1.depositar(300);
        
        AbrirConta pessoa2 = new AbrirConta();
        pessoa2.abrirConta("cp");
        pessoa2.setNumConta(2222);
        pessoa2.setDono("Creuza");
        pessoa2.depositar(500);
        pessoa2.sacar(100);
       
        
         pessoa1.estadoAtual();
         pessoa2.estadoAtual();
        
        
    }
    
}
