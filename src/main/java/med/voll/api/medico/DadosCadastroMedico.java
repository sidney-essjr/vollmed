package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank(message = "Nome é obrigatório") String nome,

        @Email @NotBlank(message = "E-mail é obrigatório") String email,

        @NotBlank(message = "Telefone é obrigatório") String telefone,

        @NotBlank(message = "CRM deve conter de 4 a 6 digitos e é obrigatório") @Pattern(regexp = "\\d{4,6}") String crm,

        @NotNull(message = "Especialidade é obrigatório") Especialidade especialidade,

        @NotNull(message = "Dados de endereço são obrigatórios") @Valid DadosEndereco endereco) {

}
