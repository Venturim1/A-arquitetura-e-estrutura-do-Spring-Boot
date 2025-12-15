package oi.github.venturim1.arquiteturaspring.montadora.configuration.api;

import oi.github.venturim1.arquiteturaspring.montadora.Carro;
import oi.github.venturim1.arquiteturaspring.montadora.Chave;
import oi.github.venturim1.arquiteturaspring.montadora.HondaHRV;
import oi.github.venturim1.arquiteturaspring.montadora.Motor;
import oi.github.venturim1.arquiteturaspring.montadora.configuration.CarStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Qualifier("motorHibrido")
    private Motor motor;

    @PostMapping
    public CarStatus ligarCarro(@RequestBody  Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);

    }
}
