package br.ufla.gac103.s2021_1.Cleber_e_Max;
import br.ufla.gac103.s2021_1.base.Evento;
import java.util.*;

/**
 * A classe Evento Geral é a superclasse abstrata da qual as classes Show, Filme e Futebol herdam.
 * Todos os Eventos tem com atributo o nome, local, valor do ingresso e tipo (show, filme ou futebol).
 * 
 * @author (Cleber H. S. Júnior e Max Deivid do Nascimento) 
 * @version (1.0)
 */
public abstract class EventoGeral implements Evento
{
    // variáveis comuns a todos os eventos
    private String nome;
    private String local;
    private double valor_ingresso;
    private String tipo;

    
    /**
     * Constrtuor da classe EventoGeral.
     * @param nome String do nome do evento
     * @param local String do local do evento
     * @param valor double do valor do ingresso para o evento
     * @param tipo String do tipo do evento 
     */
    EventoGeral (String nome, String local, double valor, String tipo){
        this.nome = nome;
        this.local = local;
        this.valor_ingresso = valor;
        this.tipo = tipo;
    }
    
    /**
     * Metodo herdado da interface Evento que retorna o nome do evento.
     * Dessa forma, o metodo teve que ser sobreescrito. 
     * @return String do nome do evento.
     */
    @Override
    public String getNome()
    {
        return nome;
    }
    
    /**
     * Metodo herdado da interface Evento que retorna o tipo do evento.
     * Dessa forma, o metodo teve que ser sobreescrito. 
     * @return String do tipo do evento. 
     */
    @Override
    public String getTipo()
    {
        return tipo;
    }
    
    /**
     * Metodo que rem como objetivo retornar o local onde ocorrera o evento.
     * @return String do local do evento.
     */
    public String getLocal()
    {
        return local;
    }
    
    /**
     * Metodo que retorna o valor do ingresso.
     * @return String do valor do ingresso.
     */
    public double getValor()
    {
        return valor_ingresso;
    }
    
    /**
     * Metodo para verificar se 
     */
    public boolean isNull()
    {
        return true;
    }
    
    /**
     * Metodo que retorna a descriçao do evento.
     * @return String da descriçao com nome, tipo e local. 
     */
    public String getDescricao()
    {
        return "\nNome: " + getNome() + "\nTipo: " + getTipo() + "\nLocal: " + getLocal();
    }
    
    /**
     * Sobreesecrita do metodo toString da superclasse Object.
     * O metodo retorna a descriçao do evento, por meio do retorno do metodo getDescricao.
     * @return String da descriçao do evento. 
     */
    @Override
    public String toString()
    {
        return getDescricao();
    }
}







