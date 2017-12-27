package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo;
import vista.ManantialInicio;
import vista.Compra;
import vista.Pedido;

public class Controlador implements ActionListener, MouseListener, KeyListener {

    /**
     * instancia a nuestra interfaz de usuario
     */
      ManantialInicio vista;
      Compra vistaCompra = new Compra();
      Pedido vistaPedido = new Pedido();
//    Eliminar vistaelim = new Eliminar();
//    Consultas vistaConsulta = new Consultas();
//    
//    Pelicula pelicula = new Pelicula();
    /**
     * instancia a nuestro modelo
     */
    Modelo modelo = new Modelo();

    /**
     * Se declaran en un ENUM las acciones que se realizan desde la interfaz de
     * usuario VISTA y posterior ejecución desde el controlador
     */
    public enum AccionMVC {
    
        boxservifacil,
        boxsoportebajo,
        boxsoporteceramico,
        btComprar,
        btbidon12,
        btbidon20,
        btbidon5,
        btvaso20,
        btvaso32,
        btInicio,
        txtsoportebajo
  
       
        

    }

    /**
     * Constrcutor de clase
     *
     * @param vista Instancia de clase interfaz
     */
    public Controlador(ManantialInicio vista) {
        this.vista = vista;
        
    }

    /**
     * Inicia el skin y las diferentes variables que se utilizan
     */
    public void iniciar() {
//         Skin tipo WINDOWS
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        }
        this.vista.btInicio.setActionCommand("btInicio");
        this.vista.btInicio.addActionListener(this);
//        declara una acción y añade un escucha al evento producido por el componente
        this.vistaPedido.boxservifacil.setActionCommand("boxservifacil");
        this.vistaPedido.boxservifacil.addActionListener(this);
//        //declara una acción y añade un escucha al evento producido por el componente
         this.vistaPedido.boxsoportebajo.setActionCommand("boxsoportebajo");
        this.vistaPedido.boxsoportebajo.addActionListener(this);
//        
   this.vistaPedido.boxsoporteceramico.setActionCommand("boxsoporteceramico");
        this.vistaPedido.boxsoporteceramico.addActionListener(this);
        
        
        this.vistaPedido.txtsoportebajo.setActionCommand("txtsoportebajo");
        this.vistaPedido.txtsoportebajo.addActionListener(this);
          this.vistaPedido.txtsoportebajo.addKeyListener(this);
//
//        //---------------------------Botoneslistar--------------
//        this.vistalist.BtnListarListar.setActionCommand("BtnListarListar");
//        this.vistalist.BtnListarListar.addActionListener(this);
////
//        this.vistalist.BtnVoleverListar.setActionCommand("BtnVoleverListar");
//        this.vistalist.BtnVoleverListar.addActionListener(this);
//
//        this.vistalist.BtnEliminarListar.setActionCommand("BtnEliminarListar");
//        this.vistalist.BtnEliminarListar.addActionListener(this);
//
////        añade e inicia el jtable con un DefaultTableModel vacio
//        this.vistalist.TablaListarPelicula.addMouseListener(this);
//        this.vistalist.TablaListarPelicula.setModel(new DefaultTableModel());
//
//        this.vistalist.BtnModificar.setActionCommand("BtnModificar");
//        this.vistalist.BtnModificar.addActionListener(this);
//        
//        this.vistalist.BtnBuscarListar.setActionCommand("BtnBuscarListar");
//        this.vistalist.BtnBuscarListar.addActionListener(this);
//
////        ---------------------------BotonesEleminar------------------
//        this.vistaelim.BtnEliminareliminar.setActionCommand("BtnEliminareliminar");
//        this.vistaelim.BtnEliminareliminar.addActionListener(this);
////        this.vistalist.TxtCodigo.setEnabled(false);
//
//this.vistaAgregar.CboxPelicula.setActionCommand("CboxPelicula");
//this.vistaAgregar.CboxPelicula.addActionListener(this);
//this.vistaAgregar.CboxPelicula.addItem("Seleccione categoría") ;
//
////this.vistaAgregar.CboxPelicula.addItem();
////this.vistalist.CboxCategoriaListar.removCategoriaeAllItems();
//////        ArrayList<String> listacategoria = new ArrayList<String>();
//////        listacategoria = modelo.llenar_combo();
//////        for(int i = 0; i<listacategora.size();i++){
//////this.vistaAgregar.CboxPelicula.addItem(listacategoria.toString());
//////this.vistaAgregar.CboxPelicula.setModel( new DefaultComboBoxModel());
////
////this.vistaAgregar.CboxPelicula.setModel(this.modelo.ComboBox());
//
//// Botones de la vista consulta  
//this.vistaConsulta.BtnConsulta1.setActionCommand("BtnConsulta1");
//this.vistaConsulta.BtnConsulta1.addActionListener(this);    

this.vistaPedido.txtcantservifacil.setEnabled(false);
this.vistaPedido.txtsoportebajo.setEnabled(false);
this.vistaPedido.txtsoporteceramico.setEnabled(false);
    }
    
  
    public void keyTyped(KeyEvent e) {
    }

 
    public void keyPressed(KeyEvent e) {
    }

    
      @Override
    public void keyReleased(KeyEvent e) {
        int i, j,k;
//         if(e.getSource().equals(KeyEvent.)){
//                System.out.println("sjkdhlkj");}
//        switch (AccionMVC.valueOf(e.getKeyChar())){
//            case txtsoportebajo:
//        }
//        i=Integer.parseInt(txtcantservifacil.)
        
    }

    
    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
        

//        if (e.getButton() == 1)//boton izquierdo
//        {
//            
//            //Muestro datos de producto a modificar
//            int fila = this.vistalist.TablaListarPelicula.rowAtPoint(e.getPoint());
//            if (fila > -1) {
//                this.vistalist.TxtCodigoListar.setText(String.valueOf(this.vistalist.TablaListarPelicula.getValueAt(fila, 0)));
//                this.vistalist.TxtPrecioListar.setText(String.valueOf(this.vistalist.TablaListarPelicula.getValueAt(fila, 1)));
//                this.vistalist.CboxCategoriaListar.setSelectedItem(String.valueOf(this.vistalist.TablaListarPelicula.getValueAt(fila, 2)));
//                this.vistalist.TxtFormato4kListar.setText(String.valueOf(this.vistalist.TablaListarPelicula.getValueAt(fila, 3)));
//                this.vistalist.TxtnombreListar.setText(String.valueOf(this.vistalist.TablaListarPelicula.getValueAt(fila, 4)));
//             
//            }
//        }
    }
    
    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) { }
 
    public void actionPerformed(ActionEvent e) {
//        String cod1;
        switch (AccionMVC.valueOf(e.getActionCommand())) {
//
            case boxservifacil:
                if (this.vistaPedido.boxservifacil.isSelected()) {
                    this.vistaPedido.txtcantservifacil.setEnabled(true);
                } else {
                    this.vistaPedido.txtcantservifacil.setEnabled(false);
                }

            case btInicio:
                this.vistaPedido.setVisible(true);
                this.vista.setVisible(false);
                break;
                
              case boxsoporteceramico:
                   if (this.vistaPedido.boxsoporteceramico.isSelected()) {
                    this.vistaPedido.txtsoporteceramico.setEnabled(true);
                } else {
                    this.vistaPedido.txtsoporteceramico.setEnabled(false);
                    this.vistaPedido.txtsoporteceramico.setText("");
                    break;
                }
                      
                case boxsoportebajo:
                if (this.vistaPedido.boxsoportebajo.isSelected()) {
                    this.vistaPedido.txtsoportebajo.setEnabled(true);
                } else {
                    this.vistaPedido.txtsoportebajo.setEnabled(false);
                    break;    

        }
                }
}
}


