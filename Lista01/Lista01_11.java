import java.util.Scanner;
class Lista01_11{
    public static void main(String[]args){
        int i;
        double total =0;
        Scanner ler = new Scanner(System.in); 
        System.out.println("Quantos produtos foram pedidos?");  
        int QTDE = ler.nextInt();
        System.out.println("TABELA DE CÓDIGOS");
        System.out.println("10: PASTEL DE CARNE \n11: COXINHA DE FRANGO \n12: EMPADA DE FRANGO \n20: HAMBURGUER \n30: PIZZA \n50: SUCO");
        for(i=1; i<=QTDE;i++){
            System.out.println("CÓDIGO "+i);
            int cod = ler.nextInt(); 
            switch(cod){
                case 10:
                    total+=1.5;
                    break;
                case 11:
                    total+=1.8;
                    break;
                case 12:
                    total+=1.9;
                    break;
                case 20:
                    total+=10;
                    break;
                case 30:
                    total+=8;
                    break;
                case 50:
                    total+=2.5;
                    break;
}
}
        System.out.println("Valor a ser pago: R$"+total);
}
}
