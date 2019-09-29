package digitalinnovation.example.restfull.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

public class SoldadoListResponse extends ResourceSupport {
    private Long id;
    private String nome;

    @JsonProperty("id")
    public Long getIdResource() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
