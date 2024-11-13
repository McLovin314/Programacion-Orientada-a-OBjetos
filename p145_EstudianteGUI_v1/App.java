package p145_EstudianteGUI_v1;

import java.util.ArrayList;
import javax.swing.*; //JFrame permite crear las ventanas al hacer interfaces gráficas.
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.*; //Esta libreria permite las acciones de escuchar y responder a las acciones que se le asignen a una funcion.
 
public class App extends JFrame implements ActionListener{
    ArrayList<Estudiante> datos;
    JMenuBar menuBar; //Crea la barra de menus en las ventanas desplegables
    JMenu menuArchivo, menuAyuda; //Crea los menus que se le van a agregar a la barra principal de menus.
    JMenuItem smnAbrir, smnGuardar, smnSalir, smnAcercade; //Crea las acciones que tendran cada uno de los menus emergentes dentro de la barra de menus.
    JDialog jdlAcercade;
    JLabel lblDatos,lblNombre,lblEdad,lblPeso,lblCorreo;
    JTextField txtNombre,txtEdad,txtPeso,txtCorreo;

    JTable table; //Crea una tabla dentro de la ventana.
    JScrollPane spane; //Para que la tabla tenga desplazamiento.
    DefaultTableModel modelo; //Carga en la tabala los datos creados en la clase de utileria
    JPanel pnlTabla, pnlDatos;

    public App() { //En este constructor se van a crear todos los elementos de la interfaz gráfica.
        super("Procesa datos de estudiantes ");
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuArchivo = new JMenu("Archivo");
        menuBar.add(menuArchivo);
        menuAyuda = new JMenu("Ayuda");
        menuBar.add(menuAyuda);
        smnAbrir = new JMenuItem("Abrir");
        menuArchivo.add(smnAbrir);
        smnAbrir.addActionListener(this);
        smnGuardar = new JMenuItem("Guardar");
        menuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        menuArchivo.add(new JSeparator());
        smnSalir = new JMenuItem("Salir");
        menuArchivo.add(smnSalir);
        smnSalir.addActionListener(this);
        smnAcercade = new JMenuItem("Acerca de...");
        menuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);

        jdlAcercade = new JDialog(this, "Acerca de...");
        jdlAcercade.setSize(400, 250);
        jdlAcercade.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Programacion Orientada a Objetos I<br>Carlos Castaneda Ramirez<br>cast@uaz.edu.mx</html>", JLabel.CENTER);
        lblDatos.setFont(new Font("Arial", Font.BOLD, 18));
        jdlAcercade.add(lblDatos);

        setLayout(new GridLayout(2,1, 0, 0));
        pnlTabla = new JPanel();
        getContentPane().add(pnlTabla);
        spane = new JScrollPane();
        pnlTabla.add(spane);
        table = new JTable();
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(Color.black);
        spane.setViewportView(table);
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] {"Nombre","Edad","Peso","Correo"});
        table.setModel(modelo);

        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(4, 2, 0, 0));
        lblNombre = new JLabel("Nombre");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("Edad");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        lblPeso = new JLabel("Peso");
        lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPeso = new JTextField();
        pnlDatos.add(lblPeso);
        pnlDatos.add(txtPeso);
        lblCorreo = new JLabel("Correo:");
        lblCorreo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCorreo = new JTextField();
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
    }
    public void cargarDatos() {
        Object[] obj = new Object[4];
        for(int i=0; i<datos.size() ; i++) {
        obj[0] = datos.get(i).getNombre();
        obj[1] = datos.get(i).getEdad();
        obj[2] = datos.get(i).getPeso();
        obj[3] = datos.get(i).getCorreo();
        modelo.addRow(obj);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == smnSalir) dispose();
        else if (e.getSource() == smnAcercade) jdlAcercade.setVisible(true); 
         
    }

    public static void main(String[] args) { //Esta es la clase principal donde vamos a mandar a llamar todo lo creado para la aplicacion.
        App app = new App();
        //Estas son las dimenciones y las caracteristicas que va a tener la ventana donde se veran los menus que hagamos.
        app.setBounds(0, 0, 550, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos = Utileria.inicializarDatos();
        app.cargarDatos();
    }

    
}
