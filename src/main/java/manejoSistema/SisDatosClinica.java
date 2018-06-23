/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoSistema;

import java.util.ArrayList;
import vistaDatosClinica.VentanaDClinica;

/**
 *
 * @author Juan Carlos
 */
public class SisDatosClinica {
    
    public VentanaDClinica vDClinica;
    private final ArrayList<String> datosClinica = new ArrayList<>(8);
    
     public void iniciarDClinica(){
                     
            if(datosClinica.size() == 8 ){
                System.out.println("");
                System.out.println("Imprime con datos");
                this.vDClinica = new VentanaDClinica(datosClinica.get(0), datosClinica.get(1), datosClinica.get(2) , datosClinica.get(3), datosClinica.get(4), datosClinica.get(5), datosClinica.get(6), datosClinica.get(7));
                
            }else{
                System.out.println("");
                System.out.println("Imprime vacio");
                    this.vDClinica = new VentanaDClinica("", "", "", "", "", "", "", "");                                    
            }   
    }
    
    public void setDatosClinica(){
        if(this.datosClinica.size() == 0){
            for(int i = 0; i<8 ;i++){
            this.datosClinica.add("");            
            }
        }        
        this.datosClinica.set(0,this.vDClinica.pnlDatos.txtNombreS.getText());
        this.datosClinica.set(1,this.vDClinica.pnlDatos.txtNombreF.getText());
        this.datosClinica.set(2,this.vDClinica.pnlDatos.txtDireccion.getText());
        this.datosClinica.set(3,this.vDClinica.pnlDatos.txtCiudad.getText());            
        this.datosClinica.set(4,this.vDClinica.pnlDatos.txtRegion.getText());
        this.datosClinica.set(5,this.vDClinica.pnlDatos.txtTelefono.getText());
        this.datosClinica.set(6,this.vDClinica.pnlDatos.txtEmail.getText());
        this.datosClinica.set(7,this.vDClinica.pnlDatos.txtWeb.getText());
    }
    
}
