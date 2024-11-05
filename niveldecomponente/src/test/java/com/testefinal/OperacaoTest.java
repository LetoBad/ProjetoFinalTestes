package com.testefinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class OperacaoTest {
    private Operacao o;
    public OperacaoTest() {
        o = new Operacao();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    @Test
    public void somarTest(){
        System.out.println("Teste de soma");
        int resultado = o.somar(12,3);
        assertEquals(15, resultado);
        System.out.println("O resultado é : " + resultado);
    }

    @Test
    public void substrairTest(){
        System.out.println("Teste de substrair");
        int resultado = o.subtrair(97,27);
        assertEquals(70, resultado);
        System.out.println("O resultado é : " + resultado);
    }

    @Test
    public void multiplicarTest(){
        System.out.println("Teste de multiplicacao");
        int resultado = o.multiplicar(25,4);
        assertEquals(100, resultado);
        System.out.println("O resultado é : " + resultado);
    }

    @Test
    public void dividirTest(){
        System.out.println("Teste de divicao");
        int resultado = o.dividir(100,20);
        assertEquals(5, resultado);
        System.out.println("O resultado é : " + resultado);
    }
    
    @Test
    public void somarSubtrairTest() {
        System.out.println("Integrar somar e subtrair");
        int soma = o.somar(10, 5);
        int subtrai = o.subtrair(soma, 3);
        System.out.println("Resultado: " + subtrai);
        assertEquals(12, subtrai);
    }

    @Test
    public void subtrairMultiplicarTest() {
        System.out.println("Integrar subtrair e multiplicar");
        int subtrai = o.subtrair(20, 10);
        int multi = o.multiplicar(subtrai, 3);
        System.out.println("Resultado: " + multi);
        assertEquals(30, multi);
    }

    @Test
    public void multiplicarDividirTest() {
        System.out.println("Integrar multiplicar e dividir");
        int multi = o.multiplicar(15, 3);
        int div = o.dividir(multi, 5);
        System.out.println("Resultado: " + div);
        assertEquals(9, div);
    }

    @Test
    public void dividirSomarTest() {
        System.out.println("Integrar dividir e somar");
        int div = o.dividir(21, 3);
        int soma = o.somar(div, 3);
        System.out.println("Resultado: " + soma);
        assertEquals(10, soma);
    }
    
}
