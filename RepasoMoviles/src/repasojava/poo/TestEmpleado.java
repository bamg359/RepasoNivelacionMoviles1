package repasojava.poo;

public class TestEmpleado {


    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();

        /*
        empleado1.apellido = "Perez";
        empleado1.nombre = "Pepito";
        empleado1.salario = 1312000;

        System.out.println("Nombre empleado: " + empleado1.nombre);
        System.out.println("Salario empleado: " + empleado1.salario);

        String apellido = "Perez";
        empleado1.setNombre("Pepito");
        empleado1.setApellido(apellido);
        String verApellido = empleado1.getApellido();
        System.out.println("Nombre:" + empleado1.getNombre() + "\n" +
                "apellido: " + verApellido);*/


        empleado1.registrarUsuario();
        boolean isInited = empleado1.iniciarSesion();
        empleado1.imprimirData(isInited);


    }
}
