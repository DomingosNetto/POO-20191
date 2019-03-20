import java.util.Scanner;
class Lista01_02{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int anoNasc, anoAtual;
        System.out.println("Qual seu ano de nascimento?");
        anoNasc = ler.nextInt();
        System.out.println("Em que ano estamos?");
        anoAtual = ler.nextInt();
        int idade = anoAtual-anoNasc;
        System.out.println("Você têm "+ idade + " anos de idade");
}
}

