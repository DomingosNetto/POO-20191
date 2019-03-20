import java.util.Scanner;   
class Lista01_08{
    public static void main(String[] args){
        int i, aux;
        int maior=0, menor=0, soma=0;
        float media=0;
        Scanner ler = new Scanner(System.in);
        int numeros[] = new int[10];
        System.out.println("Informe 10 valores inteiros");
        for (i=0;i<10;i++){
            numeros[i]= ler.nextInt();
            aux=numeros[i];
            if(i==0){
                maior=numeros[i];
                menor=numeros[i];            
            }
            
            else{
                if(aux<menor){
                    menor=aux;}
                else if(aux>maior){
                     maior=aux;}
           }
        }    
        for (i=0;i<10;i++){
            soma+=numeros[i];
            media= soma/10f;
        }   
        System.out.println("Media: "+media);
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);

}

}
