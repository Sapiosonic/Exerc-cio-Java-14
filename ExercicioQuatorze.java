import javax.swing.*;

public class ExercicioQuatorze{

    public static void main (String[] args){
        int num = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro positivo: ", "Informe o número", 1 ));

        if(num > 10 && num > 0){
            JOptionPane.showMessageDialog(null, "O NÚMERO É MAIOR QUE 10!", "Número maior que 10", 1);
        }
        else if (num <= 10 && num >=0){
            JOptionPane.showMessageDialog(null, "NÚMERO MENOR QUE 10!", "Número menor que 10", 1 );
        }
        else {
            JOptionPane.showMessageDialog(null, "NÚMERO INVALIDO, FAVOR TENTAR NOVAMENTE!", "Número inválido", 1);
        }
    }
}