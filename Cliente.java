public class Cliente {
    private String nomeDoCliente;
    private String cpfDoCliente;
    
    public void setnomeDoCliente(String nomeC){
        this.nomeDoCliente = nomeC;
    }
    public String getnomeDoCliente(){
        return this.nomeDoCliente;
    }

    public void setcpfDoCliente(String cpf){
        this.cpfDoCliente = cpf;
    }
    public String getcpfDoCliente(){
        return this.cpfDoCliente;
    }
}
