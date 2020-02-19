/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author Suporte
 */
public class JurosSimples {
    private double capital;
    private double taxa;
    private double juros;
    private double periodo;
    private double montate;

    public JurosSimples(double capital, double taxa, double juros, double periodo, double montate) {
        this.capital = capital;
        this.taxa = taxa;
        this.juros = juros;
        this.periodo = periodo;
        this.montate = montate;
    }

    public JurosSimples() {
    }
    

    public double getMontate() {
        return montate;
    }

    public double getCapital() {
        return capital;
    }

    public double getTaxa() {
        return taxa;
    }

    public double getJuros() {
        return juros;
    }

    public double getPeriodo() {
        return periodo;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void setPeriodo(double periodo) {
        this.periodo = periodo;
    }

    public void setMontate(double montate) {
        this.montate = montate;
    }
    
    public double obterCapital(int tipoTaxa, int tipoPeriodo){
        if(tipoTaxa == tipoPeriodo){
            return this.juros / ((this.taxa/100)*this.periodo);
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return this.juros / ((this.taxa/100)*this.periodo);
            }else{
                this.periodo = this.periodo / 12;
                return this.juros / ((this.taxa/100)*this.periodo);
            }
        }
    }
    public double obterTaxa(int tipoTaxa, int tipoPeriodo){
         if(tipoTaxa == tipoPeriodo){
             return this.juros / (this.capital*this.periodo);
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return this.juros / (this.capital*this.periodo);
            }else{
                this.periodo = this.periodo / 12;
                return this.juros / (this.capital*this.periodo);
            }
        }
    }
    public double obterPeriodo(int tipoTaxa, int tipoPeriodo){
         if(tipoTaxa == tipoPeriodo){
             return this.juros / (this.capital * (this.taxa/100));
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return this.juros / (this.capital * (this.taxa/100));
            }else{
                this.periodo = this.periodo / 12;
                return this.juros / (this.capital * (this.taxa/100));
            }
        }
    }
    public double obterJuros(int tipoTaxa, int tipoPeriodo){
         if(tipoTaxa == tipoPeriodo){
             return this.capital * (this.taxa/100) * this.periodo;
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return  this.capital * (this.taxa/100) * this.periodo;
            }else{
                this.periodo = this.periodo / 12;
                return this.capital * (this.taxa/100) * this.periodo;
            }
        }
    }
    public double obterCapitalMontate(int tipoTaxa, int tipoPeriodo){
        if(tipoTaxa == tipoPeriodo){
             return this.montate / (1 + (this.taxa/100)* this.periodo);
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return  this.montate / (1 + (this.taxa/100) * this.periodo);
            }else{
                this.periodo = this.periodo / 12;
                return this.montate / (1 + (this.taxa/100) * this.periodo);
            }
        }
    }
    public double obterTaxaMontate(int tipoTaxa, int tipoPeriodo){
        if(tipoTaxa == tipoPeriodo){
            System.out.println("entrei aqui");
            double resultado = (this.montate - this.capital) / (this.capital * this.periodo);
            System.out.println(resultado);
             return resultado;
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return  (this.montate - this.capital) / (this.capital * this.periodo);
            }else{
                this.periodo = this.periodo / 12;
                return (this.montate - this.capital) / (this.capital * this.periodo);
            }
        }
    }
    public double obterPeriodoMontate(int tipoTaxa, int tipoPeriodo){
        if(tipoTaxa == tipoPeriodo){
            double resultado = (this.montate - this.capital) / (this.capital * (this.taxa/100));
            System.out.println(resultado);
             return resultado;
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return  (this.montate - this.capital) / (this.capital * (this.taxa/100));
            }else{
                this.periodo = this.periodo / 12;
                return (this.montate - this.capital) / (this.capital * (this.taxa/100));
            }
        }
    }
    public double obterMontate(int tipoTaxa, int tipoPeriodo){
        if(tipoTaxa == tipoPeriodo){
            double resultado = this.capital * (1 + ((this.taxa/100)*this.periodo));
            System.out.println(resultado);
             return resultado;
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return  this.capital * (1 + ((this.taxa/100)*this.periodo));
            }else{
                this.periodo = this.periodo / 12;
                return this.capital * (1 + ((this.taxa/100)*this.periodo));
            }
        }
    }
}
