/*
 * This Java source file was generated by the Gradle 'init' task.

4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;

 */
package exercicio4Poo;
import java.util.Scanner;
public class App {
   

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Vendedor vendedor1 = new Vendedor();
        
        System.out.println("Olá, me informe o nome do vendedor: ");
        vendedor1.setNome(leitor.nextLine());
        
        System.out.println("Ok "+vendedor1.getNome()+" agora me informe o seu "
                +"salário em reais, pressione enter e em seguida me informe"
                +" o total de vendas:");
        vendedor1.setSalarioVendedor(leitor.nextFloat());
        vendedor1.setTotalVendas(leitor.nextFloat());
        
        System.out.println(vendedor1.getNome() +" o seu salário fixo é de: "
        + vendedor1.getSalarioVendedor()+" R$, e o seu salário total é de: "
        + vendedor1.calcularSalario()+" R$");
        
        
    }
}
