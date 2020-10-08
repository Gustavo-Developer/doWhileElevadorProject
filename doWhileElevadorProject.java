Import java.util.Scanner;
public class dowhile {

    public static void main(String[]args) {

    String A, B, C;
    String elevador;
    char M ='matutino';
    char V ='vespertino';
    char N= 'noturno';
    String periodo;
    double mediae = 0;
    double mediap = 0;
    int contador= 0;
    Int contadorr= 0;

    System.out.println(“Olá, Nos ajude a otimar o serviço dos elevadores respondendo essa pequena enquete”);

    do {
    System.out.println(mediae + “Por favor informe o elevador que mais ultiliza com frequência, ( A, B, ou C”);
    elevador = new Scanner(System.in).nextLine();

    if  (!elevador.equals("A") && !elevador.equals("B") && !elevador.equals("C")) {
        System.out.println(elevador incorreto, por favor informe o elevador novamente”);
        elevador= new Scanner(System.in).nextLine();
        break;
        Media = mediae + elevalor;
        contador++;
 }

    System.out.println(“Agora informe o Período que mais ultiliza esse elevador ”);
    periodo = new Scanner(System.in).nextFloat();
        if (!periodo.equals("matutino") && !periodo.equals("vespertino") && !periodo.equals("noturo")) {
            System.out.println("Período incorreto, por favor informe o períofo novamente");
            periodo= new Scanner(System.in).nextLine();
            break;
        Mediaa = mediap + periodo;
        contadorr;


    while (elevador <= 50) {
        System.out.println("Obrigado por colaborar");
        elevador++ 
        Media = mediae/50;
        Mediaa = mediap/3

    }

    System.out.println("O elevador mais Frequentador é:"+ mediae +"No periodo da (o):" + mediap);
    System.out.println("O período mais ultilizado é o:" + mediap +"e pertence ao elevador: " + mediae);

}

