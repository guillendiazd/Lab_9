package david_diaz_lab8;
public class Contacto {
    private String nombre;
    private int edad;
    private int num_tel;
    private String correo;
    private String direccion;
    private String gen;
    public Contacto() {
    }

    public Contacto(String nombre, int edad, int num_tel, String correo, String direccion, String gen) {
        this.nombre = nombre;
        this.edad = edad;
        this.num_tel = num_tel;
        this.correo = correo;
        this.direccion = direccion;
        this.gen = gen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
