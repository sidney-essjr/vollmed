package med.voll.api.paciente;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(

                @NotBlank(message = "Nome é obrigatório") String nome,

                @Email @NotBlank(message = "E-mail é obrigatório") String email,

                @NotBlank(message = "Telefone é obrigatório") String telefone,

                @NotBlank(message = "CPF é obrigatório") @CPF(message = "CPF deve conter 11 digitos e ser valido") String cpf,

                @NotNull(message = "Dados de endereço são obrigatórios") @Valid DadosEndereco endereco) {

}
