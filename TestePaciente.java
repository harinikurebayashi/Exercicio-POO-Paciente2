import javax.swing.JOptionPane;

public class TestePaciente {
    public static void main(String[] args){
        //Variáveis para localizar objetos
        Paciente p;
        Paciente p2;

        //Criando variáveis
        int idade;

        //Instanciando objetos
        p = new Paciente();
        p2 = new Paciente("Alfredo");

        //Métodos - Objeto p
        p.cadastraDados();
        p.imprimeDados();
        idade = p.calculaIdade(2026);
        JOptionPane.showMessageDialog(null, "A idade do paciente é: " + idade);

        //Métodos - Objeto p2
        p2.imprimeDados();
    }
}
