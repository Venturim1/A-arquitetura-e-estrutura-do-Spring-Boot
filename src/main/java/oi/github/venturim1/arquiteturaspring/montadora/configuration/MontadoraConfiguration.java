package oi.github.venturim1.arquiteturaspring.montadora.configuration;

import oi.github.venturim1.arquiteturaspring.montadora.Motor;
import oi.github.venturim1.arquiteturaspring.montadora.TiposDeMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Fala que tem alguns beans que precisam ser configurados e registrados
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavlos(120.0);
        motor.setCilindro(4);
        motor.setLitragem(2.0);
        motor.setModelo("Honda K20");
        motor.setTipo(TiposDeMotor.ASPIRADO);

        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavlos(135.0);
        motor.setCilindro(4);
        motor.setLitragem(1.0);
        motor.setModelo("Honda VTE");
        motor.setTipo(TiposDeMotor.TURBO);

        return motor;
    }

    @Bean(name = "motorHibrido")
    public Motor motorHibrido() {
        var motor = new Motor();
        motor.setCavlos(160.0);
        motor.setCilindro(4);
        motor.setLitragem(2.0);
        motor.setModelo("Honda e:HEV");
        motor.setTipo(TiposDeMotor.HIBRIDO);

        return motor;
    }

}

