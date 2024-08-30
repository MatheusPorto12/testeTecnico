public class App {
    public static void main(String[] args) throws Exception {
        int n=10;
        System.out.println("Fibonacci de " + n + " e: " + fibonacci(n));

        String palavra = "Abracadabra";
        verificA(palavra);

       
        String resultadoSomaIndice = SomaIndice();
        System.out.println(resultadoSomaIndice);
    }
    


public static int fibonacci(int num){
     if(num<=1){
        return num;
     }


        return fibonacci(num-1)+fibonacci(num-2);

}
public static void verificA(String palavra){
    int contador=0;
    boolean encontrada=false;

    for(int i=0;i<palavra.length();i++){
       char c=palavra.charAt(i);
       if(c=='a' || c=='A'){
        contador++;
        encontrada=true;
       }
    }if(encontrada){
        System.out.println("A letra a foi encontrada "+contador+" vezes na string.");
    }else{
        System.out.println("A letra a não foi encontrada na string");
    }

}
public static String SomaIndice(){
    int indice=12;
    int soma=0;
    int k=1;

    while(k<indice){
        k=k+1;
        soma=soma+k;
    }
    String resposta="O valor de SOMA e: "+soma;
    return resposta;
}

}

