/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.swing.view.jlist.impl;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import jdk.nashorn.internal.scripts.JS;

/**
 *
 * @author ALDV
 */
public class CM0802v01ListSeleccionSimple extends JFrame implements ActionListener{
    private Container oContenedor;
    private JLabel ojLblDato, ojLblMensaje;
    private JTextField ojTxtFDato;
    private JButton ojBtnAgregar, ojBtnEliminar, ojBtnBorrar;
    private JList ojLstListaNombres;
    private DefaultListModel oModeloLista;
    private JScrollPane ojCPnePanelScroll;

    public CM0802v01ListSeleccionSimple(){
        // 1.0 Iniciar propiedades de componentes
        cargarComponentes();
        // 2.0 Asigna un título
        this.setTitle("JList con selección simple");
        // 3.0 Tamano de la ventana y no se puede redimensionar
        this.setSize(480, 350);
        // 4.0 Poner la ventana en el centro
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent pEvento) {
        if (pEvento.getSource()==ojBtnAgregar){
            agregarLista();
            ojLblMensaje.setText("Se agregó un nuevo elemento");
        }
        
        if (pEvento.getSource()==ojBtnEliminar){
            eliminarLista(ojLstListaNombres.getSelectedIndex());
        }
        
        if (pEvento.getSource()==ojBtnBorrar){
            borrarLista();
            ojLblMensaje.setText("Se borro toda la lista");
        }        
    }

    private void cargarComponentes(){
        //1.0 Iniciamos contenedor
        oContenedor = getContentPane();
        
        //2.0 Definir el tamano y posicion de contenedor
        oContenedor.setLayout(null);
        
        //3.0 Definimos una etiqueta
        ojLblDato = new JLabel();
        ojLblDato.setFont(new java.awt.Font("Tahoma", 0, 30));
        ojLblDato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ojLblDato.setText("Registro datos ");
        ojLblDato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ojLblDato.setBounds(40, 20, 280, 45);
        
        ojLblMensaje = new JLabel();
        ojLblMensaje.setBounds(20, 250, 280, 25);
        
        //4.0 Definimos una caja de texto de entrada de datos
        ojTxtFDato = new JTextField();
        ojTxtFDato.setBounds(20, 80, 135, 25);

        //5.0 Definirmos los botones
        ojBtnAgregar = new JButton();
        ojBtnAgregar.setText("Agregar");
        ojBtnAgregar.setBounds(160, 80, 80, 25);
        ojBtnAgregar.addActionListener(this);
                
        ojBtnEliminar = new JButton();
        ojBtnEliminar.setText("Eliminar");
        ojBtnEliminar.setBounds(20, 210, 80, 25);
        ojBtnEliminar.addActionListener(this);
        
        ojBtnBorrar = new JButton();
        ojBtnBorrar.setText("Borrar");
        ojBtnBorrar.setBounds(120, 210, 120, 25);
        ojBtnBorrar.addActionListener(this);
        
        //6.0 Instanciamos la lista en selección simple
        ojLstListaNombres = new JList();
        ojLstListaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //7.0 Instanciamos el modelo
        oModeloLista = new DefaultListModel();
        
        //8.0 Instanciamos el Scroll
        ojCPnePanelScroll = new JScrollPane();
        ojCPnePanelScroll.setBounds(20, 120, 220, 80);
        ojCPnePanelScroll.setViewportView(this.ojLstListaNombres);
        
        //9.0 Agregamos los componentes al contenedor
        oContenedor.add(this.ojLblDato);
        oContenedor.add(this.ojTxtFDato);
        oContenedor.add(this.ojLblMensaje);
        oContenedor.add(this.ojBtnAgregar);
        oContenedor.add(this.ojBtnEliminar);
        oContenedor.add(this.ojBtnBorrar);
        oContenedor.add(this.ojCPnePanelScroll);
    }
    
    private void agregarLista(){
        String sNombre = ojTxtFDato.getText();
        
        oModeloLista.addElement(sNombre);
        ojLstListaNombres.setModel(oModeloLista);
        ojTxtFDato.setText("");
    }

    private void eliminarLista(int piPosicion){
        if (piPosicion >= 0){
            oModeloLista.removeElementAt(piPosicion);
            ojLblMensaje.setText("Se eliminó elemento en la posición = " + piPosicion);
        }else{
            JOptionPane.showMessageDialog(null, "Selecciónar una posición ", "Error", JOptionPane.ERROR_MESSAGE);
            ojLblMensaje.setText("No se selección ningún elemento ");
        }
    }

    private void borrarLista(){
        oModeloLista.clear();
    }
}
