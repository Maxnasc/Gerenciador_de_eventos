package br.ufla.gac103.s2021_1.Cleber_e_Max;
import java.util.*;


/**
 * A classe Futebol é responsável por reunir e tratar as características do evento "partida de futebol".
 * 
 * @author (Cleber H. S. Júnior e Max Deivid do Nascimento) 
 * @version (1.0)
 */
public class Futebol extends EventoGeral
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String campeonato;
    private String timeDaCasa;
    private static final double valor_ingresso = 80; //Valor do ingresso, comum a todas as partidas
    private static final String tipo = "futebol";
    
    /**
     * Construtor para objetos da classe Futebol
     */
    public Futebol(String nome, String local, String campeonato, String timeDaCasa)
    {
        super(nome, local, valor_ingresso, tipo);
        this.campeonato = campeonato;
        this.timeDaCasa = timeDaCasa;
    }
    
    /**
     * Retorna o nome do campeonato.
     * 
     * @return String.
     */
    public String getCampeonato() // retorna o nome do campeonato
    {
        return campeonato;
    }
    
    /**
     * Retorna o nome do time da casa.
     * 
     * @return String.
     */
    public String getTimeDaCasa() // retorna o nome do time da casa
    {
        return timeDaCasa;
    }
    
    /**
     * Retorna a descrição do evento partida de futebol.
     * 
     * @return String.
     */
    @Override
    public String getDescricao()
    {
        String descricao = super.getDescricao();
        System.out.println("\nDescrição do evento");
        return descricao + "\nCampeonato: " + getCampeonato() + "\nTime da casa: " + getTimeDaCasa();
    }
}
