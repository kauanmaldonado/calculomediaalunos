package calculadorademedia.dominio;

public class Calculadora {
    public void calculadorDaMedia (NotasEstudanteAtributo nota){

        double media = ((nota.filosofia+ nota.fisica+ nota.historia+ nota.matematica+ nota.portugues+nota.quimica+ nota.sociologia)/7);

        if (media >= 7){
            System.out.println("Sua média foi de: "+media+". Parabens voce passou de ano!");
        }else{
            System.out.println("Sua média foi de: "+media+". Infelizmente foi não passou de ano.");
        }
    }
}
