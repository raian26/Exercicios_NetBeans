/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exerciseHeranca;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class App {
    

    public static void main(String[] args) {
        
      Vendedor vendedor1 = new Vendedor();
      vendedor1.setNome("Raian");
      vendedor1.setCpf("111111111");
      vendedor1.setDatanascimento(new Date()); // new Date seta a data atual!
      vendedor1.setComissaoporvenda(12.0f);
      vendedor1.setTotalitensvendidos(23);
      vendedor1.setSalario(2000.0f);
      
      System.out.println("O salario do funcionário "+ vendedor1.getNome()+ " é "
      + vendedor1.calcularSalario()+ " reais");
      
    }
}
