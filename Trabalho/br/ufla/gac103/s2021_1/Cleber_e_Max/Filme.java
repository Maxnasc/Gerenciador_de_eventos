package br.ufla.gac103.s2021_1.Cleber_e_Max;
import java.util.ArrayList;

/**
 * A classe Filme é responsável por reunir e tratar as características do evento "Filme".
 * 
 * @author (Cleber H. S. Júnior e Max Deivid do Nascimento) 
 * @version (1.0)
 */

public class Filme extends EventoGeral
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String genero;
    private ArrayList <String> listaAtores = new ArrayList <String> ();
    private String diretor;
    
    private static final double valor_ingresso = 20; //Valor do ingresso, comum a todos os shows
    private static final String tipo = "filme";
    
    /**
     * Construtor para objetos da classe Filme
     */
    public Filme(String nome, String local, String genero, ArrayList <String> listaDeAtores, String diretor)
    {
        super(nome, local, valor_ingresso, tipo);
        this.genero = genero;
        for(String ator: listaDeAtores){
            this.listaAtores.add(ator);
        }
        this.diretor = diretor;      
    }
    
    /**
     * Retorna o gênero do filme.
     * 
     * @return String.
     */
    public String getGenero() // retorna o valor do ingresso
    {
        return genero;
    }
    
    /**
     * Retorna uma lista dos atores presentes no filme.
     * 
     * @return String.
     */
    public String getLista() //retorna a lista de atores
    {
        String lista = "";
        for(String ator: listaAtores){
            lista = lista + (ator + "\t");
        }
        return lista;
    }
    
    /**
     * Retorna o nome do diretor.
     * 
     * @return String.
     */
    public String getDiretor() //retorna o nome do diretor
    {
        return diretor;
    }
    
    /**
     * Retorna uma lista dos detalhes do evento filme.
     * 
     * @return String.
     */
    @Override
    public String getDescricao()
    {
        String descricao = super.getDescricao();
        System.out.println("\nDescrição do evento");
        return descricao + "\nGênero: " + getGenero() + "\nLista de atores:\n" + getLista() + "\nDiretor: " + getDiretor();
    }
}
