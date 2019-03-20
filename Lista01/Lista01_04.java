import java.util.Scanner;
class Lista01_04{
    public static void main(String[] args){
        Scanner notas = new Scanner(System.in);
        float N1, N2, N3, N4, media=0;
        System.out.println("Nota 01:");
        N1 = notas.nextFloat();
        System.out.println("Nota 02:");
        N2 = notas.nextFloat();
        System.out.println("Nota 03:");
        N3 = notas.nextFloat();
        System.out.println("Nota 04:");
        N4 = notas.nextFloat();
        media = (N1+N2+N3+N4)/4;
        System.out.println("A media do Aluno é: "+media);
        if(media>=7.0){
            System.out.println("APROVADO!");}
        else if(media>=5.0 && media <7.0){
            System.out.println("FINAL!");}
        else if(media<5.0){
            System.out.println("REPROVADO!");}

}

}
