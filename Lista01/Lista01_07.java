import java.util.Scanner;
class Lista01_07{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int nota;
        System.out.println("Informe a nota do aluno");
        nota = ler.nextInt();
        if (nota>=0 && nota <50) System.out.println("INSUFICIENTE");
        else if(nota>=50 && nota<65) System.out.println("REGULAR");
        else if(nota>=65 && nota<85) System.out.println("BOM");
        else if(nota>=85&& nota<=100) System.out.println("ÓTIMO");

}}
