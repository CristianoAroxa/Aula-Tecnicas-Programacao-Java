
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Vendas {
    private String nome;
    private double salarioBase;
    private double valorVendido;
    private double novoSalario;
    
    public Vendas(){
        this("",0.0,0.0,0.0);
    }

    public Vendas(String nome, double salarioBase, double valorVendido, double novoSalario) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.valorVendido = valorVendido;
        this.novoSalario = novoSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
    public void entarNome(){
        setNome (JOptionPane.showInputDialog("Digite o nome do vendedor:"));       
           
    }
    public void entrarSalarioBase(){
        setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Digite osalário base do vendedor: R$"))); 
    }
    public double calculoComissao(double valorVendido){
        this.setNovoSalario(((valorVendido*10)/100)+ this.getSalarioBase());
        return this.salarioBase;
        
    }
}


