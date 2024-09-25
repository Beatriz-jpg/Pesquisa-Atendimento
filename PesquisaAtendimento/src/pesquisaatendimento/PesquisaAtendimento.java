/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pesquisaatendimento;

import javax.swing.JOptionPane;

/**
 *
 * @author beatr
 */
public class PesquisaAtendimento {

    public static void main(String[] args) {
        // declaração de variáveis
        String nome;  //nome da pessoa entrevistada na pesquisa
        int idade, opiniao, contadorExcelente = 0, contadorRuim = 0; //idade da pessoa entrevistada,opinião de atendimento e contadores de excelente e ruim
        
        //entrada de dados de 50 entrevistados, usando a estrutura de repetição for
        for (int i=1; i<=50; i++) {
            nome = JOptionPane.showInputDialog("Digite o seu nome: " + "(Entrevistado " + i + ")");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: " + "(Entrevistado " + i + ")"));
            opiniao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da opção desejada.  " +
                "\n O atendimento foi: " +
                "\n1- EXCELENTE" +
                "\n2- BOM" +
                "\n3- RUIM"));
           
           //contando as respostas EXCELENTE
            if (opiniao == 1) {
               contadorExcelente++;
     
            } else { //contando as respostas RUIM
                if (opiniao == 3) {
                    contadorRuim++;
                }
            } //fim else
    } //fim do for
        
      //exibindo os resultados das quantidades de "EXCELENTE" e "RUIM"
        JOptionPane.showMessageDialog(null, "A quantidade de respostas 'EXCELENTE' foi: " + contadorExcelente + 
        "\nA quantidade de respostas 'RUIM' foi: " + contadorRuim);
        
    } //fim do main
        
  } //fim classe
