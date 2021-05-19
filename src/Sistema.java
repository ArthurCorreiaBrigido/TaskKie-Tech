import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Sistema {
    private static Object Sistema;
    private Cliente cliente;
    private ArrayList<Cliente>listaCliente;

    public Sistema(String cpf, String nome, String email, String telefone, String pais,
                   String estado, String cidade, String rua, String cep){
        setListaCliente(new ArrayList<>());

    }

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton avançarButton;

    public static void main(String[] args){
        JFrame frame = new JFrame("Cliente");
        frame.setContentPane((Container) Sistema);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public Sistema() {
        listaCliente = new ArrayList<>();
        avançarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
}