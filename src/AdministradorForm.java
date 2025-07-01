import javax.swing.*;

public class AdministradorForm extends JFrame{
    private JPanel administradorPanel;

    public AdministradorForm(){
        setTitle("Administrador");
        setContentPane(administradorPanel);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
