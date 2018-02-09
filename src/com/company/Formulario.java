package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {
    private JLabel nombre;
    private JLabel apellido;
    private JLabel carnet;
    private JLabel emitido;
    private JLabel sexo;
    private JLabel vacio;

    private JTextField nombre1;
    private JTextField apellido1;
    private JTextField carnet1;
    private JComboBox emitido1;

    private JPanel intereses;
    private JLabel intereses1;
    private JCheckBox videoJuegos;
    private JCheckBox musica;
    private JCheckBox deporte;

   // private JColorChooser colorFavorito;

    private JButton guardar;
    private JDialog resultadoEncuesta;

    private JRadioButton hombre;
    private JRadioButton mujer;

    public Formulario() {
        super("Formulario");
        setSize(400, 800);
        setLayout(new GridLayout(10, 2));

        nombre = new JLabel("Nombre:");
        nombre1 = new JTextField(20);
        apellido = new JLabel("Apellido:");
        apellido1 = new JTextField(20);
        carnet = new JLabel("Carnet de Identidad:");
        carnet1 = new JTextField(10);
        emitido = new JLabel("emitido en: ");
        emitido1 = new JComboBox();
        emitido1.addItem("Ciudad : ");
        emitido1.addItem("Cochabamba ");
        emitido1.addItem("Sucre ");
        emitido1.addItem("Tarija ");
        emitido1.addItem("Beni ");
        emitido1.addItem("Pando");
        emitido1.addItem("Santa Cruz ");
        emitido1.addItem("La paz ");
        emitido1.addItem("Potosi ");
        emitido1.addItem("Oruro ");

        intereses = new JPanel();
        intereses1 = new JLabel("Que intereses tiene:");
        videoJuegos = new JCheckBox("Video juegos");
        musica = new JCheckBox("Musica");
        deporte = new JCheckBox("Deportes");

       // colorFavorito = new JColorChooser();
        guardar = new JButton("Guardar");
        vacio = new JLabel("");
        sexo = new JLabel("Seleccione su sexo:");
        hombre = new JRadioButton("Hombre");
        mujer = new JRadioButton("Mujer");

        add(nombre);
        add(nombre1);
        add(apellido);
        add(apellido1);
        add(sexo);
        add(vacio);
        add(vacio);
        add(hombre);
        add(mujer);

        add(carnet);
        add(carnet1);

        add(emitido);
        add(emitido1);
        add(intereses);
        //add(colorFavorito);

        add(guardar);

        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultado = "";
                JLabel jLabelResultado;
                resultadoEncuesta.setLayout(new BorderLayout());
                resultadoEncuesta.setTitle("Resultados Guardados");
                resultadoEncuesta.setSize(320, 240);
            }
        });
        ;
    }
}
