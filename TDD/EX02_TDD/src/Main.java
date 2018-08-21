import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        pessoa.setNome(sc.nextLine());
        System.out.print("Digite seu cpf: ");
        pessoa.setCpf(sc.nextLine());
        System.out.print("Digite sua idade: ");
        pessoa.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.print("Digite seu sexo(M[1]/F[2]): ");
        pessoa.setSexo(sc.nextInt());
        if (pessoa.eMaiorDeIdade()){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você não é maior de idade");
        }
    }
}
