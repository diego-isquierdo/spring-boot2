package academy.devdojo.springboot2.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Anime {
    private Long id;
    //mapeia o 'json' recebido com a chave 'name' para o atributo
    //@JsonProperty("name")
    private String name;

}
