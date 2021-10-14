package calculadorademedia.aplicacao;

import calculadorademedia.dominio.Calculadora;
import calculadorademedia.dominio.NotasEstudanteAtributo;
import calculadorademedia.dominio.ScannerValoresNotas;

public class CalculoMediaAplicacaoMain {
    public static void main(String[] args) {
        NotasEstudanteAtributo aluno01 = new NotasEstudanteAtributo();
        ScannerValoresNotas scanner = new ScannerValoresNotas();
        Calculadora calculadora = new Calculadora();

        scanner.scannerNotas(aluno01);
        calculadora.calculadorDaMedia(aluno01);

    }
}
