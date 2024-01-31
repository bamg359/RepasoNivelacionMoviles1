package repasojava.poo;

public class Jefe extends Empleado{

    private String area;

    public Jefe(){
        super();
    }

    public Jefe(int id, String nombre, String apellido, String cargo, double salario,String email, String password, String area) {
        super(id, nombre, apellido, cargo, salario, email, password);
        this.area = area;
    }

    //Getter and Setters


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    @Override
    public void registrarUsuario() {
        super.registrarUsuario();

    }
}
