/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cancion;
import modelo.CancionModel;
import vista.AgregarCancionForm;
import vista.EliminarCancionForm;
import vista.ListarCancionForm;
import vista.ModificarCancionForm1;
import vista.ModificarCancionForm2;

/**
 *
 * @author Lucho
 */
public class CancionController {

    private AgregarCancionForm agregarCancionForm;
    private ListarCancionForm listarCancionForm;
    private EliminarCancionForm eliminarCancionForm;
    private ModificarCancionForm1 modificarCancionForm1;
    private ModificarCancionForm2 modificarCancionForm2;

    public CancionController(AgregarCancionForm agregarCancionForm) {
        this.agregarCancionForm = agregarCancionForm;
    }

    public CancionController(ListarCancionForm listarCancionForm) {
        this.listarCancionForm = listarCancionForm;
    }

    public CancionController(EliminarCancionForm eliminarCancionForm) {
        this.eliminarCancionForm = eliminarCancionForm;
    }

    public CancionController(ModificarCancionForm1 modificarCancionForm1) {
        this.modificarCancionForm1 = modificarCancionForm1;
    }

    public CancionController(ModificarCancionForm2 modificarCancionForm2) {
        this.modificarCancionForm2 = modificarCancionForm2;
    }

    public CancionController(AgregarCancionForm agregarCancionForm, ListarCancionForm listarCancionForm, EliminarCancionForm eliminarCancionForm, ModificarCancionForm1 modificarCancionForm1, ModificarCancionForm2 modificarCancionForm2) {
        this.agregarCancionForm = agregarCancionForm;
        this.listarCancionForm = listarCancionForm;
        this.eliminarCancionForm = eliminarCancionForm;
        this.modificarCancionForm1 = modificarCancionForm1;
        this.modificarCancionForm2 = modificarCancionForm2;
    }

    public void guardarCancion() {
        // Lógica para guardar el automóvil en la base de datos
        Cancion cancion = new Cancion();
	cancion.setId(agregarCancionForm.getCancionId());
        cancion.setTitulo(agregarCancionForm.getTitulo());
        cancion.setArtista(agregarCancionForm.getArtista());
        cancion.setAnio(agregarCancionForm.getAnio());
        cancion.setGenero(agregarCancionForm.getGenero());
        cancion.setDuracion(agregarCancionForm.getDuracion());

        if (CancionModel.agregarCancion(cancion) == 1) {
            mostrarMensaje("Cancion guardada", "Éxitoso");
          
            agregarCancionForm.limpiarCampos();
        } else {
            mostrarMensaje("Error al guardar el la cancion", "Error fatal");
        }

    }
    
        public void modificarCancion() {
        // Lógica para modificar el automóvil en la base de datos
        Cancion cancion = new Cancion();
	cancion.setId(modificarCancionForm2.getCancionId());
        cancion.setTitulo(modificarCancionForm2.getTitulo());
        cancion.setArtista(modificarCancionForm2.getArtista());
        cancion.setAnio(modificarCancionForm2.getAnio());
        cancion.setGenero(modificarCancionForm2.getGenero());
        cancion.setDuracion(modificarCancionForm2.getDuracion());
        
        System.out.println("modificar Cancion" + modificarCancionForm2.getCancionId());
        if (cancion.modificarCancion(cancion) == 1) {
            mostrarMensaje("Cancion modificada exitosamente", "Éxito");
        } else {
            mostrarMensaje("Error al modificar la cancion", "Error");
        }

    }

    public void cargarCancionEnTabla() {
        ArrayList<Cancion> cancion = CancionModel.listarCancion();
        listarCancionForm.cargarTabla(cancion);
    }

    public void eliminarCancion(int idCancion) {
        int confirmacion = JOptionPane.showConfirmDialog(eliminarCancionForm, "¿Estás seguro de eliminar ?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {

            CancionModel.eliminarCancion(idCancion);
            JOptionPane.showMessageDialog(eliminarCancionForm, "cancion Eliminada.");

        }
    }

    public void consultarCancion(int idCancion) {
        ArrayList<Cancion> cancion = CancionModel.consultarCancion(idCancion);
	    ArrayList<Cancion> Cancion = null;
        modificarCancionForm1.cargarInfo(Cancion);
        

    }

    // #####################################################################################################################################
    private void mostrarMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(agregarCancionForm, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

}
