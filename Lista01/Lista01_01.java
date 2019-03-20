import java.util.Scanner;
class Lista01_01{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float velocidade;
        float opr=3.6f;
        System.out.println("Qual a velocidade em m/s?");//
        velocidade = ler.nextFloat();
        float converssao = velocidade*opr;
        System.out.println("Velocidade em Km/h é: "+converssao);
}
}
