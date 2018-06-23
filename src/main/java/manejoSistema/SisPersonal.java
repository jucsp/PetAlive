/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoSistema;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Personal;
import vistaPersonal.VentanaPersonal;
import vistaVentanaInicio.PestagnasInicio;

/**
 *
 * @author Juan Carlos
 */
public class SisPersonal {
    
    public VentanaPersonal vPersonal;
    private final ArrayList<String> listaCargos = new ArrayList<>();
    private final ArrayList<Personal> listaPersonal = new ArrayList<>();
    private String nombre,apellido, rut,rutPart1, rutPart2, rutPart3, rutPart4,direccion,ciudad,region,telefono,movil,email, cargo;
    
    public void iniciarPersonal(int btnSeleccionado, PestagnasInicio p, ArrayList listaCiudades, ArrayList listaRegiones){
        int index = p.pFicheros.pPersonal.pnlTabla.tabla.getSelectedRow();                
        if(btnSeleccionado == 1){
            this.setDatosPersonal(index, listaCiudades, listaRegiones);
        }else if(btnSeleccionado == 2){
            this.vPersonal = new VentanaPersonal(3,"","","","","","","","","","");
            if(this.vPersonal.pnlDatos.cbCiudad.getItemAt(1) != ("    ")){
                this.vPersonal.pnlDatos.cbCiudad.removeAllItems();
                for(Object l:listaCiudades){
                    this.vPersonal.pnlDatos.cbCiudad.addItem(l);
                }
                this.vPersonal.pnlDatos.cbRegion.removeAllItems();
                for(Object l:listaRegiones){
                    this.vPersonal.pnlDatos.cbRegion.addItem(l);
                }                
            }
            if(this.vPersonal.pnlDatos.cbCargo.getItemAt(1) != ("    ")){
                this.vPersonal.pnlDatos.cbCargo.removeAllItems();
                for(String l:listaCargos){
                    this.vPersonal.pnlDatos.cbCargo.addItem(l);
                }
            }
        }  
    }
    
    public void setDatosPersonal(int index, ArrayList listaCiudades, ArrayList listaRegiones){
        this.nombre = this.listaPersonal.get(index).getNombre();
        this.apellido = this.listaPersonal.get(index).getApellido();
        this.rut = this.listaPersonal.get(index).getRut();
//        this.separarRut(this.rut);
        this.direccion = this.listaPersonal.get(index).getDireccion();
        this.ciudad = this.listaPersonal.get(index).getCiudad();
        this.region = this.listaPersonal.get(index).getRegion();
        this.telefono = Integer.toString(this.listaPersonal.get(index).getTelefono());
        this.movil = Integer.toString(this.listaPersonal.get(index).getMovil());
        this.email = this.listaPersonal.get(index).getEmail();
        this.cargo = this.listaPersonal.get(index).getCargo();
            
        this.vPersonal = new VentanaPersonal(2,nombre,apellido,rutPart1,rutPart2, rutPart3, rutPart4,direccion,telefono,movil,email);
        this.vPersonal.pnlDatos.cbCiudad.removeAllItems();
        for(Object l:listaCiudades){
        this.vPersonal.pnlDatos.cbCiudad.addItem(l);
        }
        this.vPersonal.pnlDatos.cbRegion.removeAllItems();
        for(Object l:listaRegiones){
        this.vPersonal.pnlDatos.cbRegion.addItem(l);
        }        
        this.vPersonal.pnlDatos.cbCargo.removeAllItems();
        for(String l:listaCargos){
        this.vPersonal.pnlDatos.cbCargo.addItem(l);
        }
            
        this.vPersonal.pnlDatos.cbCiudad.setSelectedItem(ciudad);
        this.vPersonal.pnlDatos.cbRegion.setSelectedItem(region);
        this.vPersonal.pnlDatos.cbCargo.setSelectedItem(cargo);
    }
    
    public void crearPersonal(PestagnasInicio pi){
        this.getAllDataPersonal();
        
        Personal p = new Personal(this.cargo,
                                this.nombre,
                                this.apellido,
                                this.rut,
                                this.direccion,
                                this.ciudad,
                                this.region,
                                Integer.parseInt(this.telefono),
                                Integer.parseInt(this.movil),
                                this.email);
        this.listaPersonal.add(p);
        
        Object[] fila = new Object[8];
        fila[0] = p.getNombre();
        fila[1] = p.getApellido();
        fila[2] = p.getRut();
        fila[3] = p.getCiudad();
        fila[4] = p.getTelefono();
        fila[5] = p.getMovil();
        fila[6] = p.getEmail();
        fila[7] = p.getCargo();
        pi.pFicheros.pPersonal.pnlTabla.modelo.addRow(fila); 
    }
    
    public void editarPersonal(int index, PestagnasInicio pi){
        this.getAllDataPersonal();
        
        this.listaPersonal.get(index).setNombre(this.nombre);
        this.listaPersonal.get(index).setApellido(this.apellido);
        this.listaPersonal.get(index).setRut(this.rut);
        this.listaPersonal.get(index).setDireccion(this.direccion);
        this.listaPersonal.get(index).setCiudad(this.ciudad);
        this.listaPersonal.get(index).setRegion(this.region);
        this.listaPersonal.get(index).setTelefono(Integer.parseInt(this.telefono));
        this.listaPersonal.get(index).setMovil(Integer.parseInt(this.movil));
        this.listaPersonal.get(index).setEmail(this.email);
        
        Personal p = this.listaPersonal.get(index);        
        pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getNombre(), index, 0);
        pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getApellido(), index, 1);
        pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getRut(), index, 2);
        pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getCiudad(), index, 3);
        pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getTelefono(), index, 4);
        pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getMovil(), index, 5);
        pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getEmail(), index, 6);
        pi.pFicheros.pPersonal.pnlTabla.modelo.setValueAt(p.getCargo(), index, 7);
    }
    
    public void getAllDataPersonal(){
        this.nombre = this.vPersonal.pnlDatos.txtNombres.getText();
        this.apellido = this.vPersonal.pnlDatos.txtApellidos.getText();
        this.rutPart1 = this.vPersonal.pnlDatos.rutParte1.getText();
        this.rutPart2 = this.vPersonal.pnlDatos.rutParte2.getText();
        this.rutPart3 = this.vPersonal.pnlDatos.rutParte3.getText();
        this.rutPart4 = this.vPersonal.pnlDatos.rutParte4.getText();
        this.rut =this.rutPart1 +"."+this.rutPart2+"."+this.rutPart3+"-"+this.rutPart4;
        this.direccion = this.vPersonal.pnlDatos.txtDireccion.getText();
        this.ciudad = (String)this.vPersonal.pnlDatos.cbCiudad.getSelectedItem();
        this.region = (String)this.vPersonal.pnlDatos.cbRegion.getSelectedItem();
        this.telefono = this.vPersonal.pnlDatos.txtTelefono.getText();
        this.movil = this.vPersonal.pnlDatos.txtMovil.getText();
        this.email = this.vPersonal.pnlDatos.txtEmail.getText();
        this.cargo = (String)this.vPersonal.pnlDatos.cbCargo.getSelectedItem();
    }
    
    
    public void setCargo(String cargo){
        if(cargo != null){
            this.listaCargos.add(cargo);
            Collections.sort(this.listaCargos);
            this.vPersonal.pnlDatos.cbCargo.removeAllItems();
            for(String l:this.listaCargos){
            this.vPersonal.pnlDatos.cbCargo.addItem(l);
            }
             System.out.println("Cargo: "+cargo+" agregado.");
        }else{
            System.out.println("null");
        } 
    }
    
}
