package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author logonlb
 */
public class Calculadora extends JFrame implements ActionListener{
    
    private JPanel p1, p2;
    private JButton botSoma, botSubtracao, botMultiplicacao, botDivisao;
    private JTextField txtValor1, txtValor2, txtResp;
    private JLabel sinal;
    public Calculadora() {
        super("Trabalhando com Eventos");
        this.getContentPane().setLayout(new BorderLayout());
    }

    
    
    //inicializar os componentes graficos
    public void init(){
        p1 = new JPanel(new FlowLayout());
        p2 = new JPanel(new FlowLayout());
        botSoma = new JButton("+");
        botSubtracao = new JButton("-");
        botMultiplicacao = new JButton("*");
        botDivisao = new JButton("/");
        txtValor1 = new JTextField(5);
        txtValor2 = new JTextField(5);
        txtResp = new JTextField(5);
        sinal = new JLabel(" = ");
        
        botSoma.addActionListener(this);
        botSubtracao.addActionListener(this);
        botMultiplicacao.addActionListener(this);
        botDivisao.addActionListener(this);
        p1.add(txtValor1);
        p1.add(txtValor2);
        p1.add(sinal);
        p1.add(txtResp);
        p2.add(botSoma);
        p2.add(botSubtracao);
        p2.add(botMultiplicacao);
        p2.add(botDivisao);
        this.getContentPane().add(p1, BorderLayout.NORTH);
        this.getContentPane().add(p2, BorderLayout.CENTER);
        setSize(500,300);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        Calculadora janela = new Calculadora();
        janela.init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==botSoma) {
        calcular('+');
        }
        if (e.getSource()==botSubtracao) {
        calcular('-');
        }
        if (e.getSource()==botMultiplicacao) {
        calcular('*');
        }
        if (e.getSource()==botDivisao) {
        calcular('/');
        }
    }
    
    
    private void calcular(char sinal) {
    //txtResp.setText("");
    float v1 = Float.parseFloat(txtValor1.getText());
    float v2 = Float.parseFloat(txtValor2.getText());
    float resp = 0;
    switch(sinal) {
    case '+':
    resp = v1 + v2;
    break;
    case '-':
    resp = v1 - v2;
    break;
    case '*':
    resp = v1 * v2;
    break;
    case '/':
    resp = v1 / v2;
    break;
    }
    txtResp.setText(resp + "");
}

}

