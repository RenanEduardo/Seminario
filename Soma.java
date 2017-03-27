/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.seminario.calculadora.Operacoes;

/**
 *
 * @author renan
 * @version 0.1
 */
public class Soma {
    private int a;
    private int b;
    private int resultado;
    
    public Soma()
    {
        this.a = 0;
        this.b = 0;
        this.resultado = 0;
    }
    
    public int soma(int x, int y)
    {
        return x + y;
    }
}
