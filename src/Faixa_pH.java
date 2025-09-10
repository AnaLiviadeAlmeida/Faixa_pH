import java.util.Scanner;

public class Faixa_pH { //declarando a classe Faixa_pH
      public String produto; // declarando a variavel tipo texto Produto que vai armazenar o valor Produto
      public double pH; // declarando  a variavel tipo double pH que vai armazenar o valor do pH

      public Faixa_pH(String produto, double pH) { // construtor vai iniciar os atributos
            this.produto = produto;
            this.pH = pH;

          }

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); //declarando scanner
            System.out.println("Qual é o produto?"); //aqui o usuário vai digitar o produto que ele quer saber o pH
            String produto = scanner.nextLine(); //vai ler o valor do produto que o usuario digitou (tipo String)
            System.out.println("Qual é o pH do produto? ex:7,10"); // usuário vai digitar o pH do produto, vai depender muito do país o caractere, no Brasil usar virgula nos EUA ou outro país usar ponto
            double pH = scanner.nextDouble(); //vai ler o valor do pH que o usuario digitou (tipo double)

       scanner.close(); //scanner fechado
 Faixa_pH ProdutopH = new Faixa_pH (produto, pH);
          //condicional que vai determinar se o pH é ácido, neutro ou alcalino
          if (ProdutopH.pH < 7.0) {  //se pH for menor que 7
              System.out.println("o produto " + produto + " é ácido."); // o valor será acido
          } else if (ProdutopH.pH == 7.0) { // senão se o pH for igual que 7
              System.out.println ("o produto " +produto + " é neutro"); //o valor será neutro
          } else { // então se for maior o valor será alcalino
              System.out.println ("o produto " +produto + " é alcalino");
          }

      }
}




