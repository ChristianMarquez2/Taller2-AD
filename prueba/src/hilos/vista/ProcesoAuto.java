package hilos.vista;

import hilos.clase.Auto;

import javax.swing.*;
import java.awt.*;

public class ProcesoAuto implements Runnable {
    @Override
    public void run() {
        JFrame frame = new JFrame("Ingreso de Vehículo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        JLabel lblMarca = new JLabel("Marca:");
        JTextField txtMarca = new JTextField();

        JLabel lblModelo = new JLabel("Modelo:");
        JTextField txtModelo = new JTextField();

        JLabel lblPrecio = new JLabel("Precio:");
        JTextField txtPrecio = new JTextField();

        JButton btnProcesar = new JButton("Procesar");

        frame.add(lblMarca);
        frame.add(txtMarca);
        frame.add(lblModelo);
        frame.add(txtModelo);
        frame.add(lblPrecio);
        frame.add(txtPrecio);
        frame.add(new JLabel()); // espacio
        frame.add(btnProcesar);

        frame.setVisible(true);

        btnProcesar.addActionListener(e -> {
            Auto auto = new Auto();
            auto.setMarca(txtMarca.getText());
            auto.setModelo(txtModelo.getText());
            try {
                auto.setPrecio(Double.parseDouble(txtPrecio.getText()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Precio inválido");
                return;
            }

            mostrarDatos(auto);
        });
    }

    private void mostrarDatos(Auto auto) {
        JFrame datosFrame = new JFrame("Datos del Vehículo");
        datosFrame.setSize(300, 150);
        datosFrame.setLayout(new GridLayout(4, 1));

        datosFrame.add(new JLabel("Datos del vehículo"));
        datosFrame.add(new JLabel("Marca: " + auto.getMarca()));
        datosFrame.add(new JLabel("Modelo: " + auto.getModelo()));
        datosFrame.add(new JLabel("Precio: $" + auto.getPrecio()));

        datosFrame.setVisible(true);
    }
}

