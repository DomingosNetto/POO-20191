import java.util.Scanner;
class Lista01_06{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double diaria = 60.00, total;
        System.out.println("Nome do cliente:");
        String nome = ler.nextLine();
        System.out.println("Quantidade de dias no hotel:");
        int dias = ler.nextInt();
        if (dias> 15){
            total = diaria+(5.5*dias);
            System.out.println(nome+"\nValor a ser pago: R$"+total);
        }else if(dias == 15){
            total = diaria+(6*dias);
            System.out.println(nome+"\nValor a ser pago: R$"+total);
        }else if(dias < 15){
            total = diaria+(8*dias);
            System.out.println(nome +"\nValor a ser pago: R$"+total);
        }

}



}
