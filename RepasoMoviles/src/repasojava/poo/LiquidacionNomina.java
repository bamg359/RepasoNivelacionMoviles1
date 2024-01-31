package repasojava.poo;

public class LiquidacionNomina {

    private int idLiquidacion;
    Operario nombreEmpleado;
    Operario cargoEmpleado;
    Operario salarioEmpleado;

    // Constructores

    public LiquidacionNomina(){

    }

    public LiquidacionNomina(int idLiquidacion) {
        this.idLiquidacion = idLiquidacion;
    }

    // Getters and Setters


    public int getIdLiquidacion() {
        return idLiquidacion;
    }

    public void setIdLiquidacion(int idLiquidacion) {
        this.idLiquidacion = idLiquidacion;
    }

    // Metodos

    public double liquidarEps(double salario){
        double eps = salario* 0.04;
        return eps;
    }

    public double liquidarPension(double salario){
        double pension = salario * 0.04;
        return pension;
    }

    public double salarioNeto(double salario){

        double salarioNeto = salario - liquidarEps(salario) - liquidarPension(salario);

        return salarioNeto;
    }

    public double salarioNeto(double salario, double auxTransporte){

        double salarioNeto = salario - liquidarEps(salario) - liquidarPension(salario) + auxTransporte;

        return salarioNeto;
    }


}
