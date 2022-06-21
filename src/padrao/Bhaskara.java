package padrao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.lang.Math;

/**
 *
 * @author Mariane
 */
public class Bhaskara extends JFrame 
{
    JLabel titulo, equacao, label1, label2, label3, exibir, exibir2;
    JTextField a, b, c;
    JButton calcular, limpar;
    public DecimalFormat df = new DecimalFormat ("0.00");
    
    public Bhaskara()
    {
        super("Fórmula de Bhaskara");
        Container tela = getContentPane();
        setLayout(null);
        titulo = new JLabel ("Fórmula de Bhaskara");
        equacao = new JLabel ("ax² + bx + c = 0");
        label1 = new JLabel ("Valor de 'a':");
        label2 = new JLabel ("Valor de 'b':");
        label3 = new JLabel ("Valor de 'c':");
        exibir = new JLabel ("");
        exibir2 = new JLabel ("");
        a = new JTextField(5);
        b = new JTextField(5);
        c = new JTextField(5);
        calcular = new JButton ("Calcular");
        limpar = new JButton ("Limpar");
        
        titulo.setBounds (90, 20, 300, 20);
        equacao.setBounds (125, 45, 300, 40);
        
        label1.setBounds (85, 90, 100, 20);
        a.setBounds (185, 90, 100, 20);
        
        label2.setBounds (85, 130, 100, 20);
        b.setBounds (185, 130, 100, 20);
        
        label3.setBounds (85, 170, 100, 20);
        c.setBounds (185, 170, 100, 20);
        
        calcular.setBounds (50, 230, 120, 25);
        limpar.setBounds (210, 230, 120, 25);
        
        exibir.setBounds (50, 270, 300, 20);
        exibir2.setBounds (50, 300, 200, 20);
        
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        equacao.setFont(new Font("Arial", Font.BOLD, 18));
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        label2.setFont(new Font("Arial", Font.BOLD, 16));
        label3.setFont(new Font("Arial", Font.BOLD, 16));
        calcular.setFont(new Font("Arial", Font.BOLD, 18));
        limpar.setFont(new Font("Arial", Font.BOLD, 18));
        exibir.setFont(new Font("Arial", Font.BOLD, 18));
        exibir2.setFont(new Font("Arial", Font.BOLD, 18));
        
        calcular.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double x1, x2, ax, bx, cx, delta;
                    x1 = 0.00;
                    x2 = 0.00;
                    delta = 0.00;
                    ax = Double.parseDouble(a.getText());
                    bx = Double.parseDouble(b.getText());
                    cx = Double.parseDouble(c.getText());
                    delta = ((Math.pow(bx, 2))-4*ax*cx);
                    if (delta > 0){
                        x1 = ((- (bx) + Math.sqrt(delta)) / ( 2 * ax));
                        x2 = ((- (bx) - Math.sqrt(delta)) / ( 2 * ax));
                        exibir.setVisible(true);
                        exibir2.setVisible(true);
                        exibir.setText("x': " +df.format(x1));
                        exibir2.setText("x'': " +df.format(x2));
                    }
                    else
                    {
                        exibir.setVisible(true);
                        exibir.setText("A equação não apresenta raiz real.");
                    }
                    
                } 
            }
        );
        
        limpar.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    a.setText(null);
                    b.setText(null);
                    c.setText(null);
                    exibir.setText(null);
                    exibir2.setText(null);
                    a.requestFocus();  
                } 
            }
        );
        
        exibir.setVisible(false);
        
        tela.add(titulo);
        tela.add(equacao);
        
        tela.add(label1);
        tela.add(a);
        
        tela.add(label2);
        tela.add(b);
        
        tela.add(label3);
        tela.add(c);
 
        tela.add(calcular);
        tela.add(limpar);
        
        tela.add(exibir);
        tela.add(exibir2);
        
        tela.setBackground(Color.pink);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(400, 370);
        setVisible(true);
    }  
}
