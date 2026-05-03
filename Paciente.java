import javax.swing.JOptionPane;

public class Paciente {
    //Atributos
    String nome;
    String rg;
    String endereco;
    String telefone;
    int anoNascimento;
    String profissao;

    //Variável
    int idade;

    //Construtores
    Paciente(){} //Sem parâmetros
    Paciente(String n){ //Com parâmetros
        this.nome = n; //Atribui o valor da variável ao atributo
    }

    //Métodos
    void cadastraDados(){
        this.nome = JOptionPane.showInputDialog("Digite o nome do paciente: ");
        this.rg = JOptionPane.showInputDialog("Digite o RG do paciente: ");
        this.endereco = JOptionPane.showInputDialog("Digite o endereço do paciente: ");
        this.telefone = JOptionPane.showInputDialog("Digite o telefone do paciente: ");
        this.anoNascimento = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o ano de nascimento do paciente: "));
        this.profissao = JOptionPane.showInputDialog("Digite a profissão do paciente: ");
    }

    void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Paciente \nNome: " + nome +
        "\nRG: " + rg +
        "\nEndereço: " + endereco +
        "\nTelefone: " + telefone +
        "\nAno de nascimento: " + anoNascimento +
        "\nProfissão: " + profissao);
    }

    int calculaIdade(int anoatual){
        idade = anoatual - anoNascimento;
        return idade;
    }
}