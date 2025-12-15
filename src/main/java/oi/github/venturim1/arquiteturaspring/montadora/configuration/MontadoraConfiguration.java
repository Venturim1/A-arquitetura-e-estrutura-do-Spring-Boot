package oi.github.venturim1.arquiteturaspring.montadora.configuration;

import oi.github.venturim1.arquiteturaspring.montadora.Motor;
import oi.github.venturim1.arquiteturaspring.montadora.TiposDeMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Fala que tem alguns beans que precisam ser configurados e registrados
public class MontadoraConfiguration {

    @Bean //Bean = método que retorna um objeto
    public Motor motor() {
        var motor = new Motor();
        motor.setCavlos(120.0);
        motor.setCilindro(4);
        motor.setLitragem(2.0);
        motor.setModelo("4 em linha");
        motor.setTipo(TiposDeMotor.ASPIRADO);

        return motor;
    }
}

