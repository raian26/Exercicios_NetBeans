/*
 * This Java source file was generated by the Gradle 'init' task.


A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral;
 */
package exercicioCarangoVelho;
import java.util.Scanner;
public class App {
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int anoVeiculo;
        float valorVeiculo;
        int contAntigo = 0;
        int contTotal = 0;
        float desconto ;
        char resp = 'S';
        float valorTotal;
        
       
        while(resp == 'S' || resp == 's'){
            System.out.println("Para começarmos, me informe o valor do veículo e ano do veículo respectivamente: ");
        valorVeiculo = leitor.nextFloat();
        anoVeiculo = leitor.nextInt();
        if(anoVeiculo <= 2000){
       desconto = (float) (valorVeiculo * 0.12);
       valorTotal = valorVeiculo - desconto;
       contAntigo++;  
       System.out.println("O desconto para esse veículo é de: " +desconto+ " reais");
       System.out.println("O preço final para o carro é de:" +valorTotal+ " reais");
    } else{
          desconto = (float) (valorVeiculo * 0.07);
          valorTotal = valorVeiculo - desconto;
        System.out.println("O desconto para esse veículo é de: "
                +desconto+ " reais");
       System.out.println("O preço final para o carro é de:" 
               +valorTotal+ " reais");
        }
        contTotal++;
        System.out.println("Deseja continuar?(S/N)");
        resp = leitor.next().charAt(0);
    }
        System.out.println("O total de carros com o ano até 2000 é de: " 
                +contAntigo+ " e o total de carros consultados foram: " + contTotal);
    }
}
