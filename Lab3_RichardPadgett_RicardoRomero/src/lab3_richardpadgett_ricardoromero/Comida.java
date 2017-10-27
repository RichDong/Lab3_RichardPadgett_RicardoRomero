/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_richardpadgett_ricardoromero;


/**
 *
 * @author ricky
 */
public class Comida extends Productos{
    private String fecha_caducidad;

    public Comida() {
        super();
    }

    public Comida(String fecha_caducidad, int precio, String descripcion, String marca, int descuento) {
        super(precio, descripcion, marca, descuento);
        this.fecha_caducidad = fecha_caducidad;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    @Override
    public String toString() {
        return "Comida{" + "fecha_caducidad=" + fecha_caducidad + '}';
    }
}
