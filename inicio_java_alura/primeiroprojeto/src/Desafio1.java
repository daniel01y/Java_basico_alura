public class Desafio1 {
    public static void main(String[] args){

        /*Desafio proposto no curso, para aprender melhor sobre a questão do Casting,
        * onde convertemos manualmente um tipo de valor para o que desejamos*/

        double grausCelsius = 28;
        double grausFarenheits = (grausCelsius * 1.8) + 32;
        System.out.println(grausFarenheits);
        System.out.println((int) grausFarenheits + " valor inteiro");
    }

}
