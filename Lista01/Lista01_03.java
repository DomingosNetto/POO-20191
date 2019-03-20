import java.util.Scanner;
class Lista01_03{
    public static void main(String[] args){
        float N1, N2, N3;
        Scanner LerNota = new Scanner(System.in);
        System.out.println("Nota 01:");
        N1 = LerNota.nextFloat();
        System.out.println("Nota 02:");
        N2 = LerNota.nextFloat();
        System.out.println("Nota 02:");
        N3 = LerNota.nextFloat();
        float media =((N1*2)+(N2*3)+(N3*5))/10;
        System.out.println(media);

}
}
