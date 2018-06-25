/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCitas;

import componentes.PanelBotones;
import componentes.PanelTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaCitas extends JPanel{
        
    public PanelTabla pnlTabla;
    public PanelBotones pnlBotones;
    
    public PestagnaCitas(){
     this.iniciarComponentes();
    }            
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Citas");
        
        this.pnlTabla = new PanelTabla("Pacientes");
        this.pnlTabla.addColumn("ID Paciente");
        this.pnlTabla.addColumn("Paciente");
        this.pnlTabla.addColumn("RUT Cliente");
        this.pnlTabla.addColumn("Fecha ingreso");           
        this.pnlTabla.addColumn("Fecha cita");
        this.pnlTabla.addColumn("Motivo");
        this.add(this.pnlTabla, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(1);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
    }
    
    
}
