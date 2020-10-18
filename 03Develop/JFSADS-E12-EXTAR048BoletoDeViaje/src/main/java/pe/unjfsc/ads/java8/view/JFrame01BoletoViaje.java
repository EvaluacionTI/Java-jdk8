package pe.unjfsc.ads.java8.view;

public class JFrame01BoletoViaje extends javax.swing.JFrame {

    public JFrame01BoletoViaje() {
        initComponents();
        buttonGroupCiudadOrigen.add(jRadioButtonOrigenLima);
        buttonGroupCiudadOrigen.add(jRadioButtonOrigenChilca);
        buttonGroupCiudadOrigen.add(jRadioButtonOrigenBujama);
        buttonGroupCiudadOrigen.add(jRadioButtonOrigenAsia);
        buttonGroupCiudadOrigen.add(jRadioButtonOrigenCanete);
        buttonGroupCiudadOrigen.add(jRadioButtonOrigenImperial);
        
        buttonGroupCiudaDestino.add(jRadioButtonDestinoImperial);
        buttonGroupCiudaDestino.add(jRadioButtonDestinoChilca);
        buttonGroupCiudaDestino.add(jRadioButtonDestinoBujama);
        buttonGroupCiudaDestino.add(jRadioButtonDestinoAsia);
        buttonGroupCiudaDestino.add(jRadioButtonDestinoCanete);
        buttonGroupCiudaDestino.add(jRadioButtonDestinoImperial);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCiudadOrigen = new javax.swing.ButtonGroup();
        buttonGroupCiudaDestino = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonGrabar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSerie = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelCiudadOrigen = new javax.swing.JPanel();
        jRadioButtonOrigenLima = new javax.swing.JRadioButton();
        jRadioButtonOrigenChilca = new javax.swing.JRadioButton();
        jRadioButtonOrigenBujama = new javax.swing.JRadioButton();
        jRadioButtonOrigenAsia = new javax.swing.JRadioButton();
        jRadioButtonOrigenCanete = new javax.swing.JRadioButton();
        jRadioButtonOrigenImperial = new javax.swing.JRadioButton();
        jPanelCiudaDestino = new javax.swing.JPanel();
        jRadioButtonDestinoImperial = new javax.swing.JRadioButton();
        jRadioButtonDestinoCanete = new javax.swing.JRadioButton();
        jRadioButtonDestinoAsia = new javax.swing.JRadioButton();
        jRadioButtonDestinoBujama = new javax.swing.JRadioButton();
        jRadioButtonDestinoChilca = new javax.swing.JRadioButton();
        jRadioButtonDestinoLima = new javax.swing.JRadioButton();
        jPanelBoletoViaje = new javax.swing.JPanel();
        jTextFieldNroDNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jComboBoxDiaViaje = new javax.swing.JComboBox<>();
        jComboBoxMesViaje = new javax.swing.JComboBox<>();
        jTextFieldAnoViaje = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldNroCelular = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldHoraViaje = new javax.swing.JTextField();
        jTextFieldNroAsiento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldValorBoleto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setText("Registro boleto de viaje");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));

        jButtonGrabar.setText("Grabar");
        jButtonGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrabarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jButtonGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setText("Boleto de viaje No : ");

        jLabel3.setText("Serie");

        jLabel4.setText("Número");

        jPanelCiudadOrigen.setBackground(new java.awt.Color(153, 204, 255));
        jPanelCiudadOrigen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jRadioButtonOrigenLima.setText("Lima");
        jRadioButtonOrigenLima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOrigenLimaActionPerformed(evt);
            }
        });

        jRadioButtonOrigenChilca.setText("Chilca");

        jRadioButtonOrigenBujama.setText("Bujama");

        jRadioButtonOrigenAsia.setText("Asia");

        jRadioButtonOrigenCanete.setText("Cañete");

        jRadioButtonOrigenImperial.setText("Imperial");

        javax.swing.GroupLayout jPanelCiudadOrigenLayout = new javax.swing.GroupLayout(jPanelCiudadOrigen);
        jPanelCiudadOrigen.setLayout(jPanelCiudadOrigenLayout);
        jPanelCiudadOrigenLayout.setHorizontalGroup(
            jPanelCiudadOrigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCiudadOrigenLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelCiudadOrigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonOrigenLima)
                    .addComponent(jRadioButtonOrigenChilca)
                    .addComponent(jRadioButtonOrigenBujama)
                    .addComponent(jRadioButtonOrigenAsia)
                    .addComponent(jRadioButtonOrigenCanete)
                    .addComponent(jRadioButtonOrigenImperial))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelCiudadOrigenLayout.setVerticalGroup(
            jPanelCiudadOrigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCiudadOrigenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonOrigenLima)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonOrigenChilca)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonOrigenBujama)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonOrigenAsia)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonOrigenCanete)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonOrigenImperial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCiudaDestino.setBackground(new java.awt.Color(204, 153, 255));
        jPanelCiudaDestino.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelCiudaDestino.setPreferredSize(new java.awt.Dimension(120, 0));

        jRadioButtonDestinoImperial.setText("Imperial");

        jRadioButtonDestinoCanete.setText("Cañete");

        jRadioButtonDestinoAsia.setText("Asia");

        jRadioButtonDestinoBujama.setText("Bujama");

        jRadioButtonDestinoChilca.setText("Chilca");

        jRadioButtonDestinoLima.setText("Lima");

        javax.swing.GroupLayout jPanelCiudaDestinoLayout = new javax.swing.GroupLayout(jPanelCiudaDestino);
        jPanelCiudaDestino.setLayout(jPanelCiudaDestinoLayout);
        jPanelCiudaDestinoLayout.setHorizontalGroup(
            jPanelCiudaDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCiudaDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCiudaDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonDestinoImperial)
                    .addComponent(jRadioButtonDestinoCanete)
                    .addComponent(jRadioButtonDestinoAsia)
                    .addComponent(jRadioButtonDestinoBujama)
                    .addComponent(jRadioButtonDestinoChilca)
                    .addComponent(jRadioButtonDestinoLima))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelCiudaDestinoLayout.setVerticalGroup(
            jPanelCiudaDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCiudaDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonDestinoImperial)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonDestinoCanete)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonDestinoAsia)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonDestinoBujama)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonDestinoChilca)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonDestinoLima)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBoletoViaje.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setText("No DNI : ");

        jLabel6.setText("Pasajero : ");

        jLabel7.setText("Fecha viaje : ");

        jLabel8.setText("Hora viaje : ");

        jLabel9.setText("No de asiento : ");

        jComboBoxDiaViaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBoxMesViaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SETIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));

        jLabel10.setText("Apellidos");

        jLabel11.setText("Nombres");

        jLabel12.setText("No de celular : ");

        jLabel13.setText("Correo : ");

        jLabel14.setText("Día");

        jLabel15.setText("Mes");

        jLabel16.setText("Año");

        jLabel17.setText("Valor del boleto : ");

        javax.swing.GroupLayout jPanelBoletoViajeLayout = new javax.swing.GroupLayout(jPanelBoletoViaje);
        jPanelBoletoViaje.setLayout(jPanelBoletoViajeLayout);
        jPanelBoletoViajeLayout.setHorizontalGroup(
            jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoletoViajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBoletoViajeLayout.createSequentialGroup()
                        .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldApellidos)
                            .addGroup(jPanelBoletoViajeLayout.createSequentialGroup()
                                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextFieldNroDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanelBoletoViajeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelBoletoViajeLayout.createSequentialGroup()
                        .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelBoletoViajeLayout.createSequentialGroup()
                                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldHoraViaje, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNroAsiento))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldValorBoleto))
                            .addGroup(jPanelBoletoViajeLayout.createSequentialGroup()
                                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxDiaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxMesViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jTextFieldAnoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBoletoViajeLayout.setVerticalGroup(
            jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoletoViajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNroDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(10, 10, 10)
                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxDiaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMesViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(4, 4, 4)
                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldHoraViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldValorBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBoletoViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldNroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jPanelCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanelCiudaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBoletoViaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelCiudadOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelCiudaDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                    .addComponent(jPanelBoletoViaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrabarActionPerformed
        
    }//GEN-LAST:event_jButtonGrabarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jRadioButtonOrigenLimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOrigenLimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonOrigenLimaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame01BoletoViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame01BoletoViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame01BoletoViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame01BoletoViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame01BoletoViaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCiudaDestino;
    private javax.swing.ButtonGroup buttonGroupCiudadOrigen;
    private javax.swing.JButton jButtonGrabar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxDiaViaje;
    private javax.swing.JComboBox<String> jComboBoxMesViaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBoletoViaje;
    private javax.swing.JPanel jPanelCiudaDestino;
    private javax.swing.JPanel jPanelCiudadOrigen;
    private javax.swing.JRadioButton jRadioButtonDestinoAsia;
    private javax.swing.JRadioButton jRadioButtonDestinoBujama;
    private javax.swing.JRadioButton jRadioButtonDestinoCanete;
    private javax.swing.JRadioButton jRadioButtonDestinoChilca;
    private javax.swing.JRadioButton jRadioButtonDestinoImperial;
    private javax.swing.JRadioButton jRadioButtonDestinoLima;
    private javax.swing.JRadioButton jRadioButtonOrigenAsia;
    private javax.swing.JRadioButton jRadioButtonOrigenBujama;
    private javax.swing.JRadioButton jRadioButtonOrigenCanete;
    private javax.swing.JRadioButton jRadioButtonOrigenChilca;
    private javax.swing.JRadioButton jRadioButtonOrigenImperial;
    private javax.swing.JRadioButton jRadioButtonOrigenLima;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldAnoViaje;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldHoraViaje;
    private javax.swing.JTextField jTextFieldNombres;
    private javax.swing.JTextField jTextFieldNroAsiento;
    private javax.swing.JTextField jTextFieldNroCelular;
    private javax.swing.JTextField jTextFieldNroDNI;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldSerie;
    private javax.swing.JTextField jTextFieldValorBoleto;
    // End of variables declaration//GEN-END:variables
}
