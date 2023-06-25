package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(

                @NotNull(message = "Id é obrigatório") Long id,

                String nome,

                String telefone,

                @Valid DadosEndereco endereco) {

}
