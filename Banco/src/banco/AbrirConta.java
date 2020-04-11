
package banco;

public class AbrirConta {
    
    // Atributos:
    public  int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // Construtor:

    public AbrirConta() {
    }
    
    // Método estado atual:
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }    
    
    
    // Método abrir conta:
    public void abrirConta(String t){
       setTipo(t);
       setStatus(true);
       
       if(t == "cc"){
           saldo = 50;
       }
       else if(t == "cp"){
           saldo = 150;
       }
       else {
           System.out.println("ERRO - Tente novamente.");
       }
    }
    
    // Método fechar conta:
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("ERRO - Conta com dinheiro -> não poderá encerrar.");
        }
        else if (saldo < 0){
            System.out.println("ERRO - Conta em débito -> não poderá encerrar.");
        }
        else {
            setStatus(false);
        }
    }
    
    // Método depositar:
    public void depositar(double v){
        if(status == true){
            saldo = saldo + v;
        }else{
            System.out.println("ERRO - Impossível depositar.");
        }
    }
    
    // Método sacar:
    public void sacar(double v){
        if (status == true){
            if(saldo > 0){
                saldo = saldo - v;
            }else{
                System.out.println("ERRO - Saldo insuficiênte.");
            }
        }else {
            System.out.println("ERRO - Impossível sacar.");
        }
    }
    
    // Método manutenção:
    public void pagarMensal(double m){
        if (tipo == "cc"){
            m = 12;            
        }else if(tipo == "cp"){
            m = 20;
        }
     
        if(status == true){
            if(saldo > 0){
                saldo = saldo - m;
            }else {
                System.out.println("ERRO - Saldo insuficiente.");
            }
        }else {
            System.out.println("ERRO - Impossível pagar.");
        }
    }
    
    //--------------------------------------------------------------------------
    
    // Gets:
    
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean getStatus() {
        return status;
    }

    // Sets:

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
