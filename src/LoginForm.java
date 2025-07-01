import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel loginPanel;
    private JButton accesoButton;
    private JTextField usuarioTextField;
    private JPasswordField contrasenaField;
    private JComboBox rolCombo;

    public LoginForm() {
        setTitle("Login");
        setContentPane(loginPanel);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // loginPanel.setLayout(null);
        /* Se pueden crear objetos desde el código pero es una mala práctica, no usarla
        JLabel lblnombre = new JLabel("JUGADORES");
        lblnombre.setBounds(30,10,200,25);
        loginPanel.add(lblnombre);

        JTextField txtNombre = new JTextField("GALEAS");
        txtNombre.setBounds(30,50,100,25);
        loginPanel.add(txtNombre);

        JButton accion = new JButton("CLIC");
        accion.setBounds(30,80,100,35);
        loginPanel.add(accion);

        JLabel comida = new JLabel("pizza");
        comida.setBounds(30,120,100,25);
        loginPanel.add(comida);
         */

        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = usuarioTextField.getText(); // lee el texto ingresado en el campo de usuario
                String password = String.valueOf(contrasenaField.getPassword()); // se obtiene la contraseña ingresada, pero com un arreglo de caracteres
                String rol = (String) rolCombo.getSelectedItem();

                String passwordCliente = "clave456";

                if (user.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Por favor, llenar los campos.");
                    return;
                }

                if (rol.equals("Administrador") && user.equals("admin") && password.equals("123")) {
                    new AdministradorForm();
                    dispose();
                }

                if (rol.equals("Jugador") && user.equals("jugador") && password.equals("123")) {
                    new JugadorForm();
                    dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
