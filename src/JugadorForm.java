import javax.swing.*;

public class JugadorForm extends JFrame{
    private JPanel jugadorPanel;
    private JTextField nombreTextField;
    private JTextField apellidoTextField;
    private JTextField edadTextField;
    private JTextField estaturaTextField;
    private JTextField equipoTextField;
    private JTable table1;
    private JButton agregarButton;
    private JButton mostrarButton;
    private JButton limpiarButton;

    public JugadorForm(){
        setTitle("Jugadores");
        setContentPane(jugadorPanel);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
