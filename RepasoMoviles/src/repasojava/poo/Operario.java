package repasojava.poo;

public class Operario extends Empleado {

    private String jornada;

    //Constructores

    public Operario(){
        super();
    }

    public Operario(int id, String nombre, String apellido, String cargo, double salario,String email, String password, String jornada) {
        super(id, nombre, apellido, cargo, salario, email, password);
        this.jornada = jornada;
    }


    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

     // Metodos


    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("Ingrese la jornada");
        jornada = sc.nextLine();
        empleado.add(jornada);

    }


    @Override
    public boolean iniciarSesion() {
        return super.iniciarSesion();
    }


    @Override
    public void imprimirData(boolean isInit) {
        super.imprimirData(isInit);

    }
}
