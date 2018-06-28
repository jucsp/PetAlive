/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaInicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.UIManager;
import manejoSistema.Sistema;
import vistaConfiguracion.VentanaAcerca;


/**
 *
 * @author Juan Carlos
 */
public class VentanaInicio extends JFrame implements ActionListener{    
       
    public VentanaAcerca vAcerca;
    private Sistema system;
    
    
    public VentanaInicio(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        system = new Sistema();
       
        try {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
		e.printStackTrace();
	}        
                     
        this.add(this.system.pPestagnas);                                          
        
        //Botones configuracion
        this.system.pPestagnas.pConfig.pOpciones.bJaulas.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bDatosClinica.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bHorario.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bAcerca.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bDirectorio.addActionListener(this);
        this.system.sConfigJaulas.vCJaulas.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sConfigJaulas.vCJaulas.pnlBotones.btnCancelar.addActionListener(this);
        this.system.sDatosClinica.vDClinica.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sDatosClinica.vDClinica.pnlBotones.btnCancelar.addActionListener(this);
        this.system.sConfigHorario.vCHorario.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sConfigHorario.vCHorario.pnlBotones.btnCancelar.addActionListener(this);
        
        //Botones clientes
        this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnCancelar.addActionListener(this);
        this.system.sCliente.vCliente.pnlDatos.btnAgregarC.addActionListener(this);
        this.system.sCliente.vCliente.pnlDatos.btnAgregarR.addActionListener(this);
        this.system.sCliente.vCliente.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sCliente.vCliente.pnlBotones.btnAceptar.addActionListener(this);    
        this.system.sCliente.vCliente.pnlBotones.btnCancelar.addActionListener(this);
        
        //Botones pacientes
        this.system.pPestagnas.pFicheros.pPacientes.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pPacientes.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pPacientes.pnlBotones.btnEliminar.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnCancelar.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.btnBusqueda.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.btnAgregar.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.rbSi.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.rbNo.addActionListener(this);
        this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.addActionListener(this);
        
        //Botones personal
        this.system.pPestagnas.pFicheros.pPersonal.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pPersonal.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pPersonal.pnlBotones.btnEliminar.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlBotones.btnCancelar.addActionListener(this);  
        this.system.sPersonal.vPersonal.pnlDatos.btnAgregarC.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlDatos.btnAgregarCG.addActionListener(this);
        this.system.sPersonal.vPersonal.pnlDatos.btnAgregarR.addActionListener(this);
        
        //Botones cita
        this.system.pPestagnas.pCitas.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pCitas.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pCitas.pnlBotones.btnEliminar.addActionListener(this);
        this.system.sCitas.vCitas.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sCitas.vCitas.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sCitas.vCitas.pnlBotones.btnCancelar.addActionListener(this);
        this.system.sCitas.vCitas.pnlDatos.btnBusqueda.addActionListener(this);
        
        //Botones productos
        this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnEliminar.addActionListener(this);
        this.system.sProductos.vProducto.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sProductos.vProducto.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sProductos.vProducto.pnlBotones.btnCancelar.addActionListener(this);
        this.system.sProductos.vProducto.pnlDatos.btnAgregar.addActionListener(this);
        
        //Botones servicios
        this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnEliminar.addActionListener(this);
        this.system.sServicio.vServicio.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sServicio.vServicio.pnlBotones.btnGuardar.addActionListener(this);
        this.system.sServicio.vServicio.pnlBotones.btnCancelar.addActionListener(this);
        
        //Botones directorio
        this.system.sDirectorio.vDirectorio.pnlDatos.btnBuscar.addActionListener(this);
        this.system.sDirectorio.vDirectorio.pnlBotones.btnAceptar.addActionListener(this);
        this.system.sDirectorio.vDirectorio.pnlBotones.btnCancelar.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Veterinaria");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(1100, 720);
        
    }        

    @Override
    public void actionPerformed(ActionEvent e) {//Iniciar ventana 
        if(this.system.pPestagnas.pConfig.pOpciones.bJaulas == e.getSource()){                      //>>>>>CONFIGURACION JAULA<<<<<
            this.system.sConfigJaulas.iniciarCJaulas();
            this.system.sConfigJaulas.vCJaulas.pnlBotones.btnGuardar.addActionListener(this);
            this.system.sConfigJaulas.vCJaulas.pnlBotones.btnCancelar.addActionListener(this);
            this.system.sConfigJaulas.vCJaulas.setVisible(true);            
        }else if(this.system.sConfigJaulas.vCJaulas.pnlBotones.btnGuardar == e.getSource()){                          //boton GUARDAR
           try{
            this.system.sConfigJaulas.setDatosJaula();            
            this.system.sConfigJaulas.actualizarJaulas(this.system.pPestagnas);
            this.system.sConfigJaulas.vCJaulas.hide();
            }catch(Exception m){
                String out = "Valores faltantes o mal ingresados\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sConfigJaulas.vCJaulas.pnlBotones.btnCancelar == e.getSource()){                         //boton CANCELAR
            this.system.sConfigJaulas.vCJaulas.hide();
        }else if(this.system.pPestagnas.pConfig.pOpciones.bDatosClinica == e.getSource()){          //>>>>>CONFIGURACION CLINICA<<<<<
            this.system.sDatosClinica.iniciarDClinica();
            this.system.sDatosClinica.vDClinica.pnlBotones.btnGuardar.addActionListener(this);
            this.system.sDatosClinica.vDClinica.pnlBotones.btnCancelar.addActionListener(this);
            this.system.sDatosClinica.vDClinica.setVisible(true);                                
        }else if(this.system.sDatosClinica.vDClinica.pnlBotones.btnGuardar == e.getSource()){                         //boton GUARDAR
            try{
            this.system.sDatosClinica.setDatosClinica();          
            this.system.sDatosClinica.vDClinica.hide();
            }catch(Exception m){
                String out = "Valores faltantes o mal ingresados\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sDatosClinica.vDClinica.pnlBotones.btnCancelar == e.getSource()){                        //boton CANCELAR
            this.system.sDatosClinica.vDClinica.hide();
        }else if(this.system.pPestagnas.pConfig.pOpciones.bHorario == e.getSource()){               //>>>>>CONFIGURACION HORARIO<<<<<
            this.system.sConfigHorario.iniciarCHorario();
            this.system.sConfigHorario.vCHorario.pnlBotones.btnAceptar.addActionListener(this);
            this.system.sConfigHorario.vCHorario.pnlBotones.btnCancelar.addActionListener(this);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtLV1, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtLV2, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtLV3, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtLV4, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtSD1, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtSD2, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtSD3, 2);
            this.system.gDatos.limitarCaracteres(this.system.sConfigHorario.vCHorario.pnlHorario.txtSD4, 2);
            this.system.sConfigHorario.vCHorario.setVisible(true);
        }else if(this.system.sConfigHorario.vCHorario.pnlBotones.btnAceptar == e.getSource()){                         //boton ACEPTAR
            try{
            this.system.sConfigHorario.setDatosHorario();
            this.system.sConfigHorario.vCHorario.hide();
            }catch(Exception m){
                String out = "Valores faltantes o mal ingresados\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sConfigHorario.vCHorario.pnlBotones.btnCancelar == e.getSource()){                        //boton CANCELAR
            this.system.sConfigHorario.vCHorario.hide();
        }else if(this.system.pPestagnas.pConfig.pOpciones.bAcerca == e.getSource()){                //>>>>>CONFIGURACION ACERCA<<<<<
            this.vAcerca = new VentanaAcerca();            
        }else if(this.system.pPestagnas.pConfig.pOpciones.bDirectorio == e.getSource()){            //>>>>>CONFIGURACION DIRECTORIO<<<<<            
            this.system.sDirectorio.iniciarDirectorio();
            this.system.sDirectorio.vDirectorio.setVisible(true);
            this.system.sDirectorio.vDirectorio.pnlDatos.btnBuscar.addActionListener(this);
            this.system.sDirectorio.vDirectorio.pnlBotones.btnAceptar.addActionListener(this);
            this.system.sDirectorio.vDirectorio.pnlBotones.btnCancelar.addActionListener(this);
        }else if(this.system.sDirectorio.vDirectorio.pnlDatos.btnBuscar == e.getSource()){
            String ruta;
            JFileChooser jf = new JFileChooser();           
            jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            jf.showOpenDialog(this);            
            File dir = jf.getSelectedFile();            
            if(dir != null){
                ruta = dir.getPath();
                this.system.sDirectorio.vDirectorio.pnlDatos.txtDirectorio.setText(ruta);
            }
        }else if(this.system.sDirectorio.vDirectorio.pnlBotones.btnAceptar == e.getSource()){
            this.system.sDirectorio.setDirectorio(this.system.sDirectorio.vDirectorio.pnlDatos.txtDirectorio.getText());
            this.system.sDirectorio.vDirectorio.hide();
        }else if(this.system.sDirectorio.vDirectorio.pnlBotones.btnCancelar == e.getSource()){
            this.system.sDirectorio.vDirectorio.hide();
        }else if(this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnAbrir == e.getSource()){    //>>>>>CLIENTES<<<<<
            try{                             
            this.system.sCliente.iniciarCliente(1, this.system.pPestagnas, this.system.listaCiudades, this.system.listaRegiones);
            this.system.sCliente.vCliente.pnlBotones.btnAceptar.addActionListener(this);
            this.system.sCliente.vCliente.pnlDatos.btnAgregarC.addActionListener(this);
            this.system.sCliente.vCliente.pnlDatos.btnAgregarR.addActionListener(this);
            this.system.sCliente.vCliente.pnlBotones.btnCancelar.addActionListener(this);    
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte1, 2);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte2, 3);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte3, 3);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte4, 1);
            this.system.sCliente.vCliente.setVisible(true);
            }catch(Exception m){
                String out = "No hay una ficha seleccionada\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sCliente.vCliente.pnlDatos.btnAgregarC == e.getSource()){                           //boton AGREGAR
            try{
            String ciudad = JOptionPane.showInputDialog(null, "Introduce la ciudad");            
            this.system.setCiudades(ciudad);
            }catch(Exception m){
                String out = "Valores faltantes o mal ingresados\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sCliente.vCliente.pnlDatos.btnAgregarR == e.getSource()){                           //boton AGREGAR
            try{
            String region = JOptionPane.showInputDialog(null, "Introduce la región");            
            this.system.setRegiones(region);
            }catch(Exception m){
                String out = "Valores faltantes o mal ingresados\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pFicheros.pClientes.pnlBotones.btnAnnadir == e.getSource()){           
            this.system.sCliente.iniciarCliente(2, this.system.pPestagnas, this.system.listaCiudades, this.system.listaRegiones);
            this.system.sCliente.vCliente.pnlBotones.btnGuardar.addActionListener(this);
            this.system.sCliente.vCliente.pnlDatos.btnAgregarC.addActionListener(this);
            this.system.sCliente.vCliente.pnlDatos.btnAgregarR.addActionListener(this);
            this.system.sCliente.vCliente.pnlBotones.btnCancelar.addActionListener(this);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte1, 2);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte2, 3);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte3, 3);
            this.system.gDatos.limitarCaracteres(this.system.sCliente.vCliente.pnlDatos.rutParte4, 1);
            this.system.sCliente.vCliente.setVisible(true);
        }else if(this.system.sCliente.vCliente.pnlBotones.btnGuardar == e.getSource()){                          //boton GUARDAR
            try{
            this.system.sCliente.crearCliente(this.system.pPestagnas);
            this.system.sCliente.vCliente.hide();       
            }catch(Exception m){
                String out = "Datos faltantes o incorrectos.\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sCliente.vCliente.pnlBotones.btnCancelar == e.getSource()){                         //boton CANCELAR
            this.system.sCliente.vCliente.hide();  
        }else if(this.system.sCliente.vCliente.pnlBotones.btnAceptar == e.getSource()){                          //boton ACEPTAR
            try{
            int index = this.system.pPestagnas.pFicheros.pClientes.pnlTabla.tabla.getSelectedRow();  
            this.system.sCliente.editarCliente(index, this.system.pPestagnas);
            this.system.sFichaPaciente.vFPaciente.hide();
            }catch(Exception m){
                String out = "Datos faltantes o incorrectos.\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pFicheros.pPacientes.pnlBotones.btnAbrir == e.getSource()){   //>>>>>PACIENTES<<<<<   
            try{
                this.system.sFichaPaciente.iniciarFPaciente(1, this.system.pPestagnas);
                this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnAceptar.addActionListener(this);
                this.system.sFichaPaciente.vFPaciente.pnlDatos.btnBusqueda.addActionListener(this);
                this.system.sFichaPaciente.vFPaciente.pnlDatos.btnAgregar.addActionListener(this);
                this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnCancelar.addActionListener(this);
                this.system.sFichaPaciente.vFPaciente.pnlDatos.rbSi.addActionListener(this);
                this.system.sFichaPaciente.vFPaciente.pnlDatos.rbNo.addActionListener(this);
                this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.addActionListener(this);                
                this.system.sFichaPaciente.vFPaciente.setVisible(true);
            }catch(Exception m){
                String out = "No hay una ficha seleccionada\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
            
        }else if(this.system.pPestagnas.pFicheros.pPacientes.pnlBotones.btnAnnadir == e.getSource()){
            this.system.sFichaPaciente.iniciarFPaciente(2, this.system.pPestagnas);
            this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnGuardar.addActionListener(this);
            this.system.sFichaPaciente.vFPaciente.pnlDatos.btnBusqueda.addActionListener(this);
            this.system.sFichaPaciente.vFPaciente.pnlDatos.btnAgregar.addActionListener(this);
            this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnCancelar.addActionListener(this);
            this.system.sFichaPaciente.vFPaciente.pnlDatos.rbSi.addActionListener(this);
            this.system.sFichaPaciente.vFPaciente.pnlDatos.rbNo.addActionListener(this);
            this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.addActionListener(this);
            this.system.sFichaPaciente.vFPaciente.setVisible(true);
        }else if(this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnGuardar == e.getSource()){             //boton GUARDAR             
           try{
            this.system.sFichaPaciente.crearFPaciente(this.system.pPestagnas);
            if(!this.system.sFichaPaciente.nombreP.equals("")&&!this.system.sFichaPaciente.especie.equals("")&&!this.system.sFichaPaciente.raza.equals("")&&!this.system.sFichaPaciente.rut.equals("")){
                if(this.system.booleano == true){
                this.system.sConfigJaulas.setJaulaOcupada(this.system.booleano,
                    (String)this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.getSelectedItem(), 
                    (int)this.system.sFichaPaciente.vFPaciente.pnlDatos.cbNJaula.getSelectedItem(), 
                    this.system.pPestagnas);
            }            
            this.system.sFichaPaciente.vFPaciente.hide();   
            }else{
                String out = "Datos faltantes o incorrectos\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }  
            }catch(Exception m){
                String out = "Datos faltantes o incorrectos.\n";
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.btnAgregar == e.getSource()){                          //boton AGREGAR
            String especie = JOptionPane.showInputDialog(null, "Introduce una nueva especie");
            this.system.sFichaPaciente.setEspecie(especie);
        }else if(this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnAceptar == e.getSource()){             //boton ACEPTAR
            int index = this.system.pPestagnas.pFicheros.pPacientes.pnlTabla.tabla.getSelectedRow();
            this.system.sFichaPaciente.editarFPaciente(index, this.system.pPestagnas);                       
            this.system.sConfigJaulas.setJaulaOcupada(this.system.booleano,
                    (String)this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.getSelectedItem(), 
                    (int)this.system.sFichaPaciente.vFPaciente.pnlDatos.cbNJaula.getSelectedItem(), 
                    this.system.pPestagnas);           
            this.system.sFichaPaciente.vFPaciente.hide();
            }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.btnBusqueda == e.getSource()){                     //boton BUSCAR
            String rut = JOptionPane.showInputDialog(null, "Introduce el rut con puntos y guion \n"+"Ej: 19.512.341-4");   
            if(this.system.gDatos.compararRut(rut,this.system.sCliente)==true){
                this.system.sFichaPaciente.vFPaciente.pnlDatos.txtCliente.setText(rut);
            }
        }else if(this.system.sFichaPaciente.vFPaciente.pnlBotones.pnlBotones.btnCancelar == e.getSource()){            //boton CANCELAR
            this.system.sFichaPaciente.vFPaciente.hide();
        }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.rbSi == e.getSource()){                                 //boton SI           
            this.system.sFichaPaciente.vFPaciente.pnlDatos.cbNJaula.setEnabled(true);
            this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.setEnabled(true);
            this.system.booleano = true;
        }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.rbNo == e.getSource()){                                 //rboton NO                                 
            this.system.sFichaPaciente.vFPaciente.pnlDatos.cbNJaula.setEnabled(false);            
            this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.setEnabled(false);            
            this.system.booleano = false;
        }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula == e.getSource()){                             //combobox TJAULA
            if(this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.getSelectedItem().equals("L")){
                this.system.sFichaPaciente.setJaulas(Integer.parseInt(this.system.sConfigJaulas.cantidadJaulas.get(0)));
            }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.getSelectedItem().equals("M")){
                this.system.sFichaPaciente.setJaulas(Integer.parseInt(this.system.sConfigJaulas.cantidadJaulas.get(1)));
            }else if(this.system.sFichaPaciente.vFPaciente.pnlDatos.cbTJaula.getSelectedItem().equals("S")){
                this.system.sFichaPaciente.setJaulas(Integer.parseInt(this.system.sConfigJaulas.cantidadJaulas.get(2)));
            }
        }else if(this.system.pPestagnas.pFicheros.pPersonal.pnlBotones.btnAbrir == e.getSource()){  //Iniciar ventana PERSONAL 
            try{
            this.system.sPersonal.iniciarPersonal(1, this.system.pPestagnas, this.system.listaCiudades, this.system.listaRegiones);            
            this.system.sPersonal.vPersonal.pnlBotones.btnAceptar.addActionListener(this);
            this.system.sPersonal.vPersonal.pnlBotones.btnCancelar.addActionListener(this);  
            this.system.sPersonal.vPersonal.pnlDatos.btnAgregarC.addActionListener(this);
            this.system.sPersonal.vPersonal.pnlDatos.btnAgregarCG.addActionListener(this);
            this.system.sPersonal.vPersonal.pnlDatos.btnAgregarR.addActionListener(this);
            this.system.sPersonal.vPersonal.setVisible(true);
            }catch(Exception m){
                String out = "No hay una ficha seleccionada\n";              
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pFicheros.pPersonal.pnlBotones.btnAnnadir == e.getSource()){
            this.system.sPersonal.iniciarPersonal(2, this.system.pPestagnas, this.system.listaCiudades, this.system.listaRegiones);
            this.system.sPersonal.vPersonal.pnlBotones.btnGuardar.addActionListener(this);            
            this.system.sPersonal.vPersonal.pnlBotones.btnCancelar.addActionListener(this);  
            this.system.sPersonal.vPersonal.pnlDatos.btnAgregarC.addActionListener(this);
            this.system.sPersonal.vPersonal.pnlDatos.btnAgregarCG.addActionListener(this);
            this.system.sPersonal.vPersonal.pnlDatos.btnAgregarR.addActionListener(this);
            this.system.sPersonal.vPersonal.setVisible(true);
        }else if(this.system.sPersonal.vPersonal.pnlBotones.btnGuardar == e.getSource()){
            this.system.sPersonal.crearPersonal(this.system.pPestagnas);
            this.system.sPersonal.vPersonal.hide();
        }else if(this.system.sPersonal.vPersonal.pnlBotones.btnAceptar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pPersonal.pnlTabla.tabla.getSelectedRow();
            this.system.sPersonal.editarPersonal(index, this.system.pPestagnas);
            this.system.sPersonal.vPersonal.hide();
        }else if(this.system.sPersonal.vPersonal.pnlBotones.btnCancelar == e.getSource()){
            this.system.sPersonal.vPersonal.hide();
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnAgregarC == e.getSource()){
            String ciudad = JOptionPane.showInputDialog(null, "Introduce la ciudad");            
            this.system.setCiudades(ciudad); 
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnAgregarR == e.getSource()){
            String region = JOptionPane.showInputDialog(null, "Introduce la región");            
            this.system.setRegiones(region); 
        }else if(this.system.sPersonal.vPersonal.pnlDatos.btnAgregarCG == e.getSource()){
            String cargo = JOptionPane.showInputDialog(null, "Introduce el cargo/rol");            
            this.system.sPersonal.setCargo(cargo); 
        }else if(this.system.pPestagnas.pCitas.pnlBotones.btnAbrir == e.getSource()){       //Iniciar ventana CITAS
            try{            
            this.system.sCitas.iniciarCitas(1, this.system.pPestagnas);
            this.system.sCitas.vCitas.pnlBotones.btnAceptar.addActionListener(this);
            this.system.sCitas.vCitas.pnlBotones.btnCancelar.addActionListener(this);
            this.system.sCitas.vCitas.pnlDatos.btnBusqueda.addActionListener(this);
            this.system.sCitas.vCitas.setVisible(true);
            }catch(Exception m){
                String out = "No hay una cita seleccionada\n";              
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pCitas.pnlBotones.btnAnnadir == e.getSource()){
            this.system.sCitas.iniciarCitas(2, this.system.pPestagnas);
            this.system.sCitas.vCitas.pnlBotones.btnGuardar.addActionListener(this);
            this.system.sCitas.vCitas.pnlBotones.btnCancelar.addActionListener(this);
            this.system.sCitas.vCitas.pnlDatos.btnBusqueda.addActionListener(this);
            this.system.sCitas.vCitas.setVisible(true);
        }else if(this.system.pPestagnas.pCitas.pnlBotones.btnEliminar == e.getSource()){
            
        }else if(this.system.sCitas.vCitas.pnlDatos.btnBusqueda == e.getSource()){
            String rut = JOptionPane.showInputDialog(null, "Introduce el rut con puntos y guion \n"+"Ej: 19.512.341-4");   
            if(this.system.gDatos.compararRut(rut,this.system.sCliente)==true){
                this.system.sCitas.vCitas.pnlDatos.txtRUT.setText(rut);
            }
        }else if(this.system.sCitas.vCitas.pnlBotones.btnGuardar == e.getSource()){
            this.system.sCitas.crearCita(this.system.pPestagnas);
            this.system.sCitas.vCitas.hide();
        }else if(this.system.sCitas.vCitas.pnlBotones.btnAceptar == e.getSource()){
            int index = this.system.pPestagnas.pCitas.pnlTabla.tabla.getSelectedRow();            
            this.system.sCitas.editarCita(index, this.system.pPestagnas);
            this.system.sCitas.vCitas.hide();
        }else if(this.system.sCitas.vCitas.pnlBotones.btnCancelar == e.getSource()){
            this.system.sCitas.vCitas.hide();
        }else if(this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnAbrir == e.getSource()){ //Iniciar ventana PRODUCTOS
            try{
            this.system.sProductos.iniciarProductos(1, this.system.pPestagnas);
            this.system.sProductos.vProducto.pnlBotones.btnAceptar.addActionListener(this);
            this.system.sProductos.vProducto.pnlBotones.btnCancelar.addActionListener(this);
            this.system.sProductos.vProducto.pnlDatos.btnAgregar.addActionListener(this);
            this.system.sProductos.vProducto.setVisible(true);
            }catch(Exception m){
                String out = "No hay un producto seleccionado\n";              
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnAnnadir == e.getSource()){
            this.system.sProductos.iniciarProductos(2, this.system.pPestagnas);
            this.system.sProductos.vProducto.pnlBotones.btnGuardar.addActionListener(this);
            this.system.sProductos.vProducto.pnlBotones.btnCancelar.addActionListener(this);
            this.system.sProductos.vProducto.pnlDatos.btnAgregar.addActionListener(this);
            this.system.sProductos.vProducto.setVisible(true);
        }else if(this.system.pPestagnas.pFicheros.pProductos.pnlBotones.btnEliminar == e.getSource()){
            
        }else if(this.system.sProductos.vProducto.pnlBotones.btnGuardar == e.getSource()){
            this.system.sProductos.crearProducto(this.system.pPestagnas);
            this.system.sProductos.vProducto.hide();
        }else if(this.system.sProductos.vProducto.pnlBotones.btnAceptar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pProductos.pnlTabla.tabla.getSelectedRow(); 
            this.system.sProductos.editarProducto(index, this.system.pPestagnas);
            this.system.sProductos.vProducto.hide();
        }else if(this.system.sProductos.vProducto.pnlBotones.btnCancelar == e.getSource()){
            this.system.sProductos.vProducto.hide();
        }else if(this.system.sProductos.vProducto.pnlDatos.btnAgregar == e.getSource()){
            String tipo = JOptionPane.showInputDialog(null, "Introduce el tipo de producto que deseas añadir");
            this.system.sProductos.setTipo(tipo);
        }else if(this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnAbrir == e.getSource()){ //Iniciar ventana SERVICIOS
            try{
                this.system.sServicio.iniciarServicios(1, this.system.pPestagnas);
                this.system.sServicio.vServicio.pnlBotones.btnAceptar.addActionListener(this);
                this.system.sServicio.vServicio.pnlBotones.btnCancelar.addActionListener(this);
                this.system.sServicio.vServicio.setVisible(true);
            }catch(Exception m){
                String out = "No hay un producto seleccionado\n";              
                JOptionPane.showMessageDialog(null, out, "Advertencia", INFORMATION_MESSAGE);
            }
        }else if(this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnAnnadir == e.getSource()){
            this.system.sServicio.iniciarServicios(2, this.system.pPestagnas);
            this.system.sServicio.vServicio.pnlBotones.btnGuardar.addActionListener(this);
            this.system.sServicio.vServicio.pnlBotones.btnCancelar.addActionListener(this);
            this.system.sServicio.vServicio.setVisible(true);
        }else if(this.system.pPestagnas.pFicheros.pServicios.pnlBotones.btnEliminar == e.getSource()){
            
        }else if(this.system.sServicio.vServicio.pnlBotones.btnAceptar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pServicios.pnlTabla.tabla.getSelectedRow();
            this.system.sServicio.editarServicio(index, this.system.pPestagnas);
            this.system.sServicio.vServicio.hide();
        }else if(this.system.sServicio.vServicio.pnlBotones.btnGuardar == e.getSource()){
            this.system.sServicio.crearServicio(this.system.pPestagnas);
            this.system.sServicio.vServicio.hide();
        }else if(this.system.sServicio.vServicio.pnlBotones.btnCancelar == e.getSource()){
            this.system.sServicio.vServicio.hide();
        }
    }
           
}
