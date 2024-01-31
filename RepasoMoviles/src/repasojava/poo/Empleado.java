package repasojava.poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {

    Scanner sc = new Scanner(System.in);

    // Atributos
    private int id;
    private String nombre;
    private String apellido;
    private String cargo;
    private double salario;
    private String email;
    private String password;


    ArrayList<String> empleado = new ArrayList<String>();

    // Metodo constructor

    public Empleado(){

    }

    public Empleado(int id, String nombre, String apellido, String cargo, double salario, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.email = email;
        this.password = password;
    }

    //Getters and Setters

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //Métodos


    public void registrarUsuario(){

        System.out.println("Registrar nombre");
        nombre = sc.nextLine();
        empleado.add(nombre);
        System.out.println("Registrar Apellido");
        apellido = sc.next();
        empleado.add(apellido);
        System.out.println("Registrar Cargo");
        cargo= sc.next();
        empleado.add(cargo);
        System.out.println("Registrar salario");
        salario = sc.nextDouble();
        String salarioS = salario + "";
        empleado.add(salarioS);
        System.out.println("Registrar email");
        email = sc.next();
        empleado.add(email);
        System.out.println("Registrar Password");
        password = sc.next();
        empleado.add(password);

    }

    public void imprimirData(boolean isInit){

        if(isInit == true){
            for(String i : empleado ){
                System.out.println(i);
            }

        }


    }

    public boolean iniciarSesion(){

        System.out.println("INgrese su email:");
        String emailUser = sc.next();
        System.out.println("Ingrese su contraseña");
        String passUser = sc.next();

        if(emailUser.equals(empleado.get(4)) && passUser.equals(empleado.get(5))){

            return true;

        }else{
            return false;
        }


    }






}
