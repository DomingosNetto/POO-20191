import java.util.Scanner;
class Lista01_10{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double num, aux;
        int cont=0;
        System.out.println("Digite um numero:");
        num = ler.nextInt();
        //aux = num;
        while(num>=1){
            num=num/2;
            cont ++;
        
}       System.out.println("Quantidade de divisões: "+cont);
        System.out.println("Resultado da ultima divisão: "+num);
}
}
