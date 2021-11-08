package br.ufla.gac103.s2021_1.Cleber_e_Max;
import br.ufla.gac103.s2021_1.base.Evento;

/**
 * A classe Sessao e responsavel por representar as sessoes de cada evento.
 * Cada sessao conta com os atributos nome, tipo, data, capacidade e ingressos vendidos.
 * @author (Cleber H. S. Júnior e Max Deivid do Nascimento). 
 * @version (1.0)
 */
public class Sessao implements Evento
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String tipo;
    private String data;
    private String capacidade;
    private int ingressosVendidos;
    
    
    /**
     * Construtor para objetos da classe Sessão. Ressalta-se que os ingressos vendidos sao inicializados com 0.
     * @param data String da data que o evento sera realizado
     * @param capacidade String de pessoas na sessao do evento
     * @param nome String nome do evento a qual a sessao sera realizada
     * @param tipo String do tipo do evento da sessao em questao
     */
    public Sessao(String data, String capacidade, String nome, String tipo)
    {   
        // inicializa variáveis de instância
        this.data = data;
        this.capacidade = capacidade;
        this.ingressosVendidos = 0;
        this.nome = nome;
        this.tipo = tipo;
        
    }
    
    /**
     * Metodo sobreescrito que retorna o nome do evento relacionado a sessao. 
     * @return String do nome do evento. 
     */
    @Override
    public String getNome()
    {
        return nome;
    }
    
    /**
     * Metodo sobreescrito que retorna o tipo do evento relacionado a sessao.
     * @return String do tipo do evento. 
     */
    @Override
    public String getTipo()
    {
        return tipo; 
    }
    
    /**
     *  Metodo que consulta e retorna a data de realizaçao do evento.
     *  @return String da data de realizaçao da sessao 
     */
    public String getData()
    {
        return data; 
    }
    
    /**
     * Metodo que consulta e retorna a capacidade de pessoas na sessao.
     * @return String da capacidade de pessoas no evento. 
     */
    public String getCapacidade()
    {
        return capacidade; 
    }
    
    /**
     *  Metodo que consukta e retorna a quantidade de ingressos vendidos para a sessao.
     *  @return String da quantidade de ingresss vendidos para a sessao.
     */
    public int getIngressosVendidos()
    {
        return ingressosVendidos; 
    }
    
    /**
     * Metodo que sobreescreve o metodo toString da superclasse Object. 
     * O metodo retorna a descriçao da sessao.
     * @return String com a descriçao da sessao. 
     */
    @Override
    public String toString()
    {
        String descricao;
        descricao = ("Data: " + getData() + "\tCapacidade: " + getCapacidade() + "\tIngressos Vendidos: " + getIngressosVendidos() + "\t");
        return descricao;
    }
}
