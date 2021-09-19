import java.util.Scanner;
import java.text.DecimalFormat;

public class juros {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00"); 
    
        Cliente cliente = new Cliente();
        Calculoo calculo = new Calculoo();

        System.out.println("Insira seu nome: ");
        String nomeC = entrada.nextLine();   
        cliente.setnomeDoCliente(nomeC);   

        System.out.println("Insira seu CPF: ");
        String cpf = entrada.nextLine();
        cliente.setcpfDoCliente(cpf);

        System.out.println("Insira o valor do emprestimo e a quantidade de parcelas: ");
         double emprest = entrada.nextDouble();
        calculo.setemprestimo(emprest);
        double parc =  entrada.nextDouble();
        calculo.setparcela(parc);

        System.out.println("Cliente: " + nomeC + " do CPF: " + cpf + ", o valor do seu" +
        " emprestimo é: " + emprest + ", cada parcela tera o valor:");

        double taxa = 0.015;
        double total = 0.0, parcelasMes= 0.0, montante=0.0;
        for(int i = 1; i <= parc; i++){
             parcelasMes = emprest / parc;
             
             montante = parcelasMes * Math.pow((1 + taxa), i);
             
             total= total + montante;
             System.out.println("Mes: " +  i  + " Valor: " + df.format(montante)  + " R$");

        }
        System.out.println("Total a pagar: " + df.format(total) + " R$" );

        entrada.close();
    }
}
