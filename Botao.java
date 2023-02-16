import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class Botao extends JButton{
    

    public Botao(String texto, Color cor){
        setText(texto);
        setOpaque(true);
        setBackground(cor);
        setFont(new Font("corier", Font.PLAIN, 25));
        setForeground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

    }
}
