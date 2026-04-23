package cl.ufrontera.ruleta.vista;

import cl.ufrontera.ruleta.modelo.Usuario;
import cl.ufrontera.ruleta.modelo.Resultado;
import javax.swing.*;
import java.awt.*;

public class VistaHistorial extends JFrame {
    public VistaHistorial(Usuario usuario) {
        setTitle("Historial de Jugadas - " + usuario.getNombre());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());


        DefaultListModel<String> modeloLista = new DefaultListModel<>();


        if (usuario.getHistorial().isEmpty()) {
            modeloLista.addElement("No hay jugadas registradas aún.");
        } else {
            for (Resultado r : usuario.getHistorial()) {
                modeloLista.addElement(r.toString());
            }
        }

        JList<String> listaUI = new JList<>(modeloLista);
        listaUI.setFont(new Font("Arial", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(listaUI);
        add(scrollPane, BorderLayout.CENTER);


        setLocationRelativeTo(null);
        setVisible(true);
    }
}