
package vista.vistaCitas;

import com.toedter.calendar.JDateChooser;
import vista.componentes.BotonIcono;
import vista.componentes.SubPanelDatos;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Date;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelDatos extends JPanel{
    
    private JLabel labID, labPaciente, labRUT, labFIngreso, labFCita, labMotivo;
    public JTextField txtID, txtPaciente, txtRUT, txtMotivo, txtFIngreso, txtFCita;
    public JDateChooser calendario;
    public static final String FORMATO = "%1$td-%1$tm-%1$tY";
    private Date fecha;
    private java.sql.Date fechaActual;
    private long fecha1;
    public SubPanelDatos subPanel;
    public BotonIcono btnBusqueda;
    
    public PanelDatos(String idPaciente, String paciente, String rut, String fIngreso, String fCita, String motivo){
        this.iniciarComponentes(idPaciente,paciente,rut,fIngreso,fCita,motivo);
    }
    
    private void iniciarComponentes(String idPaciente, String paciente, String rut, String fIngreso, String fCita, String motivo){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        calendario = new JDateChooser();
        fecha = new Date();
        fecha1 = fecha.getTime();
        fechaActual = new java.sql.Date(fecha1);
        
        JPanel pnlID = new JPanel();        
        this.txtID = new JTextField(idPaciente, 20);        
        caja.add(this.subPanel.generarSubPanelTF(pnlID, labID, txtID, "ID Paciente     ", 134,204,161));        
        
        JPanel pnlPaciente = new JPanel();
        this.txtPaciente = new JTextField(paciente, 20);
        caja.add(this.subPanel.generarSubPanelTF(pnlPaciente, labPaciente, txtPaciente, "Paciente          ", 134,204,161));                        
        
        JPanel pnlRUT = new JPanel(new FlowLayout());
        this.labRUT = new JLabel("RUT Cliente    ");
        pnlRUT.add(this.labRUT);
        this.txtRUT = new JTextField(rut,17);
        pnlRUT.add(this.txtRUT);
        this.txtRUT.setEditable(false);
        this.btnBusqueda = new BotonIcono("","data/icon/search.png","data/icon/search.png");
        pnlRUT.add(this.btnBusqueda);
        pnlRUT.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlRUT);
        
        JPanel pnlFIngreso = new JPanel();
        String fechaAct = String.format(FORMATO, fechaActual);
        if(" ".equals(fIngreso)){
            this.txtFIngreso = new JTextField(fechaAct, 20);
        }else{
            this.txtFIngreso = new JTextField(fIngreso, 20);
        }        
        this.txtFIngreso.setEditable(false);
        caja.add(this.subPanel.generarSubPanelTF(pnlFIngreso, labFIngreso, txtFIngreso, "Fecha Ingreso ", 134,204,161));          
        
        JPanel pnlFCita = new JPanel();
        this.labFCita = new JLabel("Fecha Cita        ");
        this.txtFCita = new JTextField(fCita, 20);
        pnlFCita.add(this.labFCita);
        JPanel subPanel = new JPanel();
        subPanel.setPreferredSize(new Dimension(226,25));
        subPanel.setLayout(new GridLayout(1,1));
        subPanel.add(this.calendario);
        pnlFCita.add(subPanel);
        pnlFCita.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlFCita);
        
        JPanel pnlMotivo = new JPanel();
        this.txtMotivo = new JTextField(motivo,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlMotivo, labMotivo, txtMotivo, "Motivo Cita        ", 134,204,161));     
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);
        
    }
    
}