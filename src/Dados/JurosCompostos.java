/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author Joao
 */
public class JurosCompostos {
    private double capital;
    private double taxa;
    private double juros;
    private double periodo;
    private double montate;

    public JurosCompostos(float capital, float taxa, float juros, float periodo, float montate) {
        this.capital = capital;
        this.taxa = taxa;
        this.juros = juros;
        this.periodo = periodo;
        this.montate = montate;
    }

    public JurosCompostos() {
    }
    

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getPeriodo() {
        return periodo;
    }

    public void setPeriodo(double periodo) {
        this.periodo = periodo;
    }

    public double getMontate() {
        return montate;
    }

    public void setMontate(double montate) {
        this.montate = montate;
    }
    
    public double obterCapital(int tipoTaxa, int tipoPeriodo){
        if(tipoTaxa == tipoPeriodo){
            return this.juros / (java.lang.Math.pow((1 + (this.taxa/100)), this.periodo)-1);
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return this.juros / (java.lang.Math.pow((1 + (this.taxa/100)), this.periodo)-1);
            }else{
                this.periodo = this.periodo / 12;
                return this.juros / (java.lang.Math.pow((1 + (this.taxa/100)), this.periodo)-1);
            }
        }
    }
    public double obterTaxa(int tipoTaxa, int tipoPeriodo){
         if(tipoTaxa == tipoPeriodo){
             return java.lang.Math.pow((this.juros/this.capital +1), (1/this.periodo)) -1;
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return (java.lang.Math.pow((this.juros/this.capital +1), (1/this.periodo))) -1;
            }else{
                this.periodo = this.periodo / 12;
                return (java.lang.Math.pow((this.juros/this.capital +1), (1/this.periodo))) -1;
            }
        }
    }
    public double obterPeriodo(int tipoTaxa, int tipoPeriodo){
         if(tipoTaxa == tipoPeriodo){
             return java.lang.Math.log10(this.juros/this.capital +1) / java.lang.Math.log10(1 + (this.taxa/100));
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return java.lang.Math.log10(this.juros/this.capital +1) / java.lang.Math.log10(1 + (this.taxa/100)); 
            }else{
                this.periodo = this.periodo / 12;
                return java.lang.Math.log10(this.juros/this.capital +1) / java.lang.Math.log10(1 + (this.taxa/100));
            }
        }
    }
    public double obterJuros(int tipoTaxa, int tipoPeriodo){
         if(tipoTaxa == tipoPeriodo){
             return this.capital * ((java.lang.Math.pow(1 + (this.taxa/100), this.periodo))-1);
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return  this.capital * ((java.lang.Math.pow(1 + (this.taxa/100), this.periodo))-1);
            }else{
                this.periodo = this.periodo / 12;
                return this.capital * ((java.lang.Math.pow(1 + (this.taxa/100), this.periodo))-1);
            }
        }
    }
    public double obterCapitalMontate(int tipoTaxa, int tipoPeriodo){
        if(tipoTaxa == tipoPeriodo){
             return this.montate / java.lang.Math.pow(1 + (this.taxa/100), this.periodo);
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return  this.montate / java.lang.Math.pow(1 + (this.taxa/100), this.periodo);
            }else{
                this.periodo = this.periodo / 12;
                return this.montate / java.lang.Math.pow(1 + (this.taxa/100), this.periodo);
            }
        }
    }
    public double obterTaxaMontate(int tipoTaxa, int tipoPeriodo){
        if(tipoTaxa == tipoPeriodo){
            double resultado = ((java.lang.Math.pow(this.montate/this.capital, 1/this.periodo))-1);
            System.out.println(resultado);
             return resultado;
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return  ((java.lang.Math.pow(this.montate/this.capital, 1/this.periodo))-1);
            }else{
                this.periodo = this.periodo / 12;
                return ((java.lang.Math.pow(this.montate/this.capital, 1/this.periodo))-1);
            }
        }
    }
    public double obterPeriodoMontate(int tipoTaxa, int tipoPeriodo){
        if(tipoTaxa == tipoPeriodo){
            double resultado = java.lang.Math.log10(this.montate/this.capital) / java.lang.Math.log10(1 + (this.taxa / 100));
            System.out.println(resultado);
             return resultado;
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return  java.lang.Math.log10(this.montate/this.capital) / java.lang.Math.log10(1 + (this.taxa / 100));
            }else{
                this.periodo = this.periodo / 12;
                return java.lang.Math.log10(this.montate/this.capital) / java.lang.Math.log10(1 + (this.taxa / 100));
            }
        }
    }
    public double obterMontate(int tipoTaxa, int tipoPeriodo){
        if(tipoTaxa == tipoPeriodo){
            double resultado = this.capital * java.lang.Math.pow((1 + (this.taxa/100)), this.periodo);
            System.out.println(resultado);
             return resultado;
        }else{
            if(tipoTaxa == 1 && tipoPeriodo == 2){
                this.periodo = this.periodo * 12;
                return  this.capital * java.lang.Math.pow((1 + (this.taxa/100)), this.periodo);
            }else{
                this.periodo = this.periodo / 12;
                return this.capital * java.lang.Math.pow((1 + (this.taxa/100)), this.periodo);
            }
        }
    }
}
