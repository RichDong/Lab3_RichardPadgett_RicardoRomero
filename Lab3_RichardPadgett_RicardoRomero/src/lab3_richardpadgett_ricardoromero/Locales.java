
package lab3_richardpadgett_ricardoromero;

import java.util.ArrayList;

public class Locales {
   String nombre;
   int piso;
   ArrayList<Personas> p = new ArrayList();

    public Locales() {
    }

    public Locales(String nombre, int piso) {
        this.nombre = nombre;
        this.piso = piso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public ArrayList<Personas> getP() {
        return p;
    }

    public void setP(ArrayList<Personas> p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", piso=" + piso + ", p=" + p + '}';
    }
   
}
