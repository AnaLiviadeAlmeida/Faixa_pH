import java.util.Scanner;

public class FaixapH{

    public String produto;
    public float pH;

    public FaixapH (String produto, float pH){
        this.produto = produto;
        this.pH = pH;


    }
}

public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o produto: (ex: suco de laranja)");
    String produto = scanner.nextLine();
    System.out.println("Digite o pH: (ex: 5.2)");
    float pH = scanner.nextFloat();

}