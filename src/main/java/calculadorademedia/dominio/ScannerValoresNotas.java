package calculadorademedia.dominio;

import java.util.Scanner;

public class ScannerValoresNotas {

    public void scannerNotas(NotasEstudanteAtributo notas){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira sua nota de Português: ");
        notas.portugues = entrada.nextInt();
        System.out.println("Insira sua nota de Matemática: ");
        notas.matematica = entrada.nextInt();
        System.out.println("Insira sua nota de História: ");
        notas.historia = entrada.nextInt();
        System.out.println("Insira sua nota de Filosofia: ");
        notas.filosofia = entrada.nextInt();
        System.out.println("Insira sua nota de Física");
        notas.fisica = entrada.nextInt();
        System.out.println("Insira sua nota de Sociologia: ");
        notas.sociologia = entrada.nextInt();
    }
}
