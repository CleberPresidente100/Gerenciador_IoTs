
package IoTs;

// import java.time.*;
// import java.time.temporal.ChronoUnit;

import Enumerations.EnumClassificacaoTemperatura;


// =======================================================================================
// COMO NÃO EXISTE UM SENSOR REAL, ESTA CLASSE FOI CRIADA PARA SIMULAR TEMPERATURAS.
// =======================================================================================

public class TermometroGeradorTemperatura {
    
    // private LocalDateTime dataHora;

    // private static final int IntervaloDeLeituraEmSegundos = 1;



    public TermometroGeradorTemperatura(){
        // dataHora = LocalDateTime.now().minusSeconds(IntervaloDeLeituraEmSegundos);
    }



    public String lerTemperatura(int temperaturaMinima, int temperaturaMaxima){

        // long secondsDiff = ChronoUnit.SECONDS.between(dataHora, LocalDateTime.now());

        // Só gera uma nova temperatura caso já tenha se passado o tempo mínimo
        // if(secondsDiff >= IntervaloDeLeituraEmSegundos){

            // dataHora = LocalDateTime.now();

            // Math.random() * (max - min + 1) + min
            double temperatura = Math.random() * (temperaturaMaxima - temperaturaMinima + 1) + temperaturaMinima;

            // Arredonda com duas casas decimais
            temperatura = Math.round(temperatura * 100) / 100;

            return Double.toString(temperatura);
        // }

        // return null;
    }



    public EnumClassificacaoTemperatura getCorTemperatura(String temperatura){
        
        if(temperatura != null && temperatura != "")
        {
            float temperaturaLida = Float.parseFloat(temperatura);

            if(temperaturaLida >= 15 && temperaturaLida <= 25){
                return EnumClassificacaoTemperatura.VERDE;
            }

            if((temperaturaLida >= 10 && temperaturaLida < 15) || (temperaturaLida > 25 && temperaturaLida <= 30)){
                return EnumClassificacaoTemperatura.AMARELO;
            }
        }

        return EnumClassificacaoTemperatura.VERMELHO;
    }   
}
