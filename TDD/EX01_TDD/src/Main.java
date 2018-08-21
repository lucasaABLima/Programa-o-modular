import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int dia, mes, ano;
        Data d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia");
        dia = sc.nextInt();
        System.out.println("Digite o mês(Digite apenas o número)");
        mes = sc.nextInt();
        System.out.println("Digite o ano");
        ano = sc.nextInt();
        d = new Data(dia, mes, ano);
        System.out.println("Hoje é " + d.diaDaSemana() + " nesse mês tem " + d.diasNoMes() + " dias");
        System.out.println("Digite quantos dias você deseja avançar(Digite apenas o número)");
        d.adicionaDias(sc.nextInt());
        System.out.println("Será " + d.diaDaSemana() + " dia: " + d.getDia());
    }
}
