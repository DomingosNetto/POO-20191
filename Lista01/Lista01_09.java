import java.util.Scanner;
class Lista01_09{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int A, B, soma=0, contPar=0, ContImpar=0;
        System.out.println("Informe dois valores inteiros");
        A = ler.nextInt();
        B = ler.nextInt();
        if(A%2==0) contPar++;
        if(B%2==0)contPar++;
        if(A%2==1)ContImpar++;
        if(B%2==1)ContImpar++;
        soma=A+B;
        System.out.println("Soma entre A e B: "+soma);
        System.out.println("Quantidade de par: "+contPar);
        System.out.println("Quantidade de impar: "+ContImpar);
}



}
