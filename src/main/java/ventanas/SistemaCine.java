package ventanas;

import modelo.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SistemaCine extends JFrame {
    private Gestion gestion;

    private JTextField nombreClienteField, rutClienteField, emailClienteField;
    private JComboBox<String> tipoEntradaComboBox, salaComboBox;
    private JButton agregarClienteButton, venderEntradaButton, reversarVentaButton;

    public SistemaCine() {
        gestion = new Gestion();

        // Configurar la interfaz gráfica
        setTitle("Sistema de Gestión de Cine");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2));

        JLabel nombreClienteLabel = new JLabel("Nombre Cliente:");
        nombreClienteField = new JTextField();
        JLabel rutClienteLabel = new JLabel("RUT Cliente:");
        rutClienteField = new JTextField();
        JLabel emailClienteLabel = new JLabel("Email Cliente:");
        emailClienteField = new JTextField();
        JLabel tipoEntradaLabel = new JLabel("Tipo de Entrada:");
        tipoEntradaComboBox = new JComboBox<>(new String[]{"VIP", "NORMAL", "IMAX"});
        JLabel salaLabel = new JLabel("Sala:");
        salaComboBox = new JComboBox<>();
        agregarClienteButton = new JButton("Agregar Cliente");
        venderEntradaButton = new JButton("Vender Entrada");
        reversarVentaButton = new JButton("Reversar Venta");

        panel.add(nombreClienteLabel);
        panel.add(nombreClienteField);
        panel.add(rutClienteLabel);
        panel.add(rutClienteField);
        panel.add(emailClienteLabel);
        panel.add(emailClienteField);
        panel.add(tipoEntradaLabel);
        panel.add(tipoEntradaComboBox);
        panel.add(salaLabel);
        panel.add(salaComboBox);
        panel.add(agregarClienteButton);
        panel.add(venderEntradaButton);
        panel.add(reversarVentaButton);

        agregarClienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreClienteField.getText();
                String rut = rutClienteField.getText();
                String email = emailClienteField.getText();
                gestion.agregarCliente(nombre, rut, email);
                JOptionPane.showMessageDialog(null, "Cliente agregado correctamente.");
            }
        });

        venderEntradaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = gestion.getClientes().get(0); // Obtener el primer cliente
                Sala sala = gestion.getSalas().get(salaComboBox.getSelectedIndex());
                TipoEntrada tipoEntrada = TipoEntrada.valueOf((String) tipoEntradaComboBox.getSelectedItem());
                gestion.venderEntrada(cliente, sala, tipoEntrada, null); // No manejamos promociones por ahora
                JOptionPane.showMessageDialog(null, "Entrada vendida correctamente.");
            }
        });

        add(panel);
    }
}