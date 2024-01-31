package repasojava.poo;

public class Analista extends Empleado{

    private String departamento;

    public Analista(){
        super();
    }

    public Analista(int id, String nombre, String apellido, String cargo, double salario, String departamento, String email, String password) {
        super(id, nombre, apellido, cargo, salario, email, password);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
