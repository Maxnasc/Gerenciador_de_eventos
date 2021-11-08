package br.ufla.gac103.s2021_1.Cleber_e_Max;
import java.util.ArrayList;


/**
 * A classe Show é responsável por reunir e tratar as características do evento "Show".
 * 
 * @author (Cleber H. S. Júnior e Max Deivid do Nascimento) 
 * @version (1.0)
 */
public class Show extends EventoGeral
{
    private String cantor;
    private String nomeTurne;
    private static final double valor_ingresso = 50; //Valor do ingresso, comum a todos os shows
    private static final String tipo = "show";
    
    /**
     * Construtor para objetos da classe Show
     */
    public Show(String nome, String local, String cantor, String nomeTurne)
    {
        super(nome, local, valor_ingresso, tipo);
        this.cantor = cantor;
        this.nomeTurne = nomeTurne;   
    }
    
    /**
     * Retorna o nome do cantor.
     * 
     * @return String.
     */
    public String getCantor() // retorna o nome do(a) cantor(a)
    {
        return cantor;
    }
    
    /**
     * Retorna o nome da turnê.
     * 
     * @return String.
     */
    public String getTurne() // retorna o nome da turnê
    {
        return nomeTurne;
    }
    
    /**
     * Retorna a descrição completa do evento "show".
     * 
     * @return String.
     */
    @Override
    public String getDescricao()
    {
        String descricao = super.getDescricao();
        System.out.println("\nDescrição do evento");
        return descricao + "\nCantor: " + getCantor() + "\nNome da turne: " + getTurne();
    }
}
