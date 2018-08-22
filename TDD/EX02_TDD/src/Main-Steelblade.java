import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);
        String sexo;
        System.out.print("Digite seu nome: ");
        pessoa.setNome(sc.nextLine());
        System.out.print("Digite seu cpf: ");
        pessoa.setCpf(sc.nextLine());
        System.out.print("Digite sua idade: ");
        pessoa.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.print("Digite seu sexo(M/F): ");
        sexo = sc.nextLine();
        System.out.println(sexo.toUpperCase());
        if (sexo.toUpperCase() == "M"){
            pessoa.setSexo(1);
            System.out.println("Homem");
        }else{
            if (sexo.toUpperCase() == "F"){
                pessoa.setSexo(0);
                System.out.println("Mulher");
            }
        }
        if (pessoa.eMaiorDeIdade()){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você não é maior de idade");
        }
    }
}
