package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizarPaciente(

                @NotNull(message = "Id é obrigatório") Long id,

                String nome,

                String email,

                String telefone,

                @Valid DadosEndereco endereco) {

}
