import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Tela extends JFrame implements ActionListener {
    private JTextField txtTexto;
    private JLabel lblTexto;
    private JButton btnMostrar, btnLimpar, btnSair;

    public Tela() {
        super("Exibição de texto");

        //mostrar painel de entrada
        JPanel painelDadosEntrada = new JPanel(new GridLayout(0, 1));
        JPanel painelEntrada = new JPanel(new FlowLayout());
        txtTexto = new JTextField(20);
        lblTexto = new JLabel("Texto");
        painelDadosEntrada.add(lblTexto);
        painelDadosEntrada.add(txtTexto);
        painelEntrada.add(painelDadosEntrada);

        //painel dos botões
        JPanel painelBotoes = new JPanel(new FlowLayout());
        btnMostrar = new JButton("Mostrar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");
        painelBotoes.add(btnMostrar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnSair);

        //montando a tela
        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout());
        caixa.add(painelEntrada, BorderLayout.NORTH);
        caixa.add(painelBotoes, BorderLayout.SOUTH);

        //Atribuindo Listener aos botões
        btnMostrar.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnLimpar.addActionListener(this);

        setSize(380, 155);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMostrar) {
            String exibeTexto = txtTexto.getText();
            JOptionPane.showMessageDialog(this, exibeTexto, "Texto digitado",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else if (e.getSource() == btnLimpar) {
            txtTexto.setText("");
        }
        else {
            System.exit(0);
        }
    }
}