package Pratica5;

public class Funcionario {
    private String nome, departamento, dataEntrada, rg;
    private double salario;
    private boolean statusFun = true;


    public Funcionario(String nome, String departamento, String dataEntrada, String rg, double salario, boolean statusFun) {
        this.nome = nome;
        this.departamento = departamento;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.salario = salario;
        this.statusFun = statusFun;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isStatusFun() {
        return statusFun;
    }

    public void setStatusFun(boolean statusFun) {
        this.statusFun = statusFun;
    }

    public void bonificar(double valBonificacao) {
        salario += valBonificacao;
    }

    public void demitir() {
        statusFun = false;
    }

    public String mostrarDados() {
            String statusFun;
        if (isStatusFun() == true) {
            statusFun = "Adimitido";
        } else {
            statusFun = "Demitido";
            }
        return "\n Nome: "+getNome()+"\n Departamento: "+getDepartamento()+"\n Data de entrada: "+getDataEntrada()+ "\n RG: " +getRg()+ "\n Salário: "+getSalario()+"\n Situação do funcionãrio: " +statusFun;
    }
}