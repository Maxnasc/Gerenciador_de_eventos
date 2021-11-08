package br.ufla.gac103.s2021_1.base;

 

/**
 * Escreva a descrição da interface Evento aqui.
 * 
 * @author (Cleber H. S. Júnior e Max Deivid do Nascimento) 
 * @version (1.0)
 */


public interface Evento
{
    // Nome do evento (ex: "Harry Potter e a Pedra Filosofal", "Músicas Raiz", "Brasil x Argentina")
    String getNome();
    // Tipo do evento (deve indicar se é um filme, um show ou uma partida de futebol)
    String getTipo(); 
}
