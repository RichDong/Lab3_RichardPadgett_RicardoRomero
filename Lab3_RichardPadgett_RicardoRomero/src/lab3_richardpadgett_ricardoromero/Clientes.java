
package lab3_richardpadgett_ricardoromero;

public class Clientes extends Personas{
    int productocomp;
    int dinero;

    public Clientes() {
    }

    public Clientes(int productocomp, int dinero) {
        this.productocomp = productocomp;
        this.dinero = dinero;
    }

    public Clientes(int productocomp, int dinero, String user, String passw, String email, String nombrec, String id, String fechan) {
        super(user, passw, email, nombrec, id, fechan);
        this.productocomp = productocomp;
        this.dinero = dinero;
    }

    public int getProductocomp() {
        return productocomp;
    }

    public void setProductocomp(int productocomp) {
        this.productocomp = productocomp;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechan() {
        return fechan;
    }

    public void setFechan(String fechan) {
        this.fechan = fechan;
    }

    @Override
    public String toString() {
        return "Clientes{" + "productocomp=" + productocomp + ", dinero=" + dinero + '}';
    }
    
    
}
