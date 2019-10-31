/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap29.swing.controls.jlist.vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CV0803v01ControlJListWithJScrollPane  extends JPanel{
    private final JList ojLstListaElementos;
    private DefaultListModel oModelo;
    private int iContador = 15;
    
    public CV0803v01ControlJListWithJScrollPane(){
        setLayout(new BorderLayout());
        oModelo = new DefaultListModel();
        ojLstListaElementos = new JList(oModelo);
        
        JScrollPane ojCPnePanelScroll = new JScrollPane(ojLstListaElementos);
        JButton ojBtnAdicionaBotones = new JButton("Adiciona Elementos");
        JButton ojBtnEliminaBotones = new JButton("Elimina Elementos");
        
        for (int i=0;i<15;i++){
            oModelo.addElement("Elemento " + i);
        }
        
        ojBtnAdicionaBotones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oModelo.addElement("Elemento " + iContador);
                iContador++;
            }
        });
        
        ojBtnEliminaBotones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oModelo.getSize() > 0){
                    oModelo.removeElementAt(0);
                }
            }
        });
        
        add(ojCPnePanelScroll, BorderLayout.NORTH);
        add(ojBtnAdicionaBotones, BorderLayout.WEST);
        add(ojBtnEliminaBotones, BorderLayout.EAST);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ojFraPantalla = new JFrame("jList con model");
        ojFraPantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ojFraPantalla.setContentPane(new CV0803v01ControlJListWithJScrollPane() );
                
        ojFraPantalla.setSize(360, 200);
        ojFraPantalla.setResizable(false);
        ojFraPantalla.setVisible(true);
        
    }
    
}
