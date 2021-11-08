package br.ufla.gac103.s2021_1.Cleber_e_Max;
import java.util.*;


/**
 * A classe Administração é responsável por realizar as operações de cadastramento e consulta, tanto de eventos quanto de sessões relativas a cada evento.
 * 
 * @author (Cleber H. S. Júnior e Max Deivid do Nascimento) 
 * @version (1.0)
 */

public class Administracao
{
    private static ArrayList <EventoGeral> eventos = new ArrayList <EventoGeral> ();        //Lista polimórfica de eventos, contém todos os eventos.
    private static int control;                                                             //Variável de controle usado na main();
    private static ArrayList <Sessao> listaSessoes = new ArrayList <Sessao> ();             //Lista de sessões usadas pelos eventos
    
    /**
     * Função main, responsável por inciar o programa dando boas vindas ao usuário e indicando as operações possíveis. 
     */
    public static void main(String[] args)
    {
        do {     
            try
            { 
                control = 0;
                control = menu();
            }catch(Exception e){
        
                System.out.println(e.getMessage());
        
            }
            switch (control) {
                case 1:
                    cadastraFilme(); // Erro
                    break;
                case 2:
                    cadastraShow();
                    break;
                case 3:
                    cadastraFutebol(); 
                    break;
                case 4:
                    cadastrarSessao();
                    break;
                case 5:
                    listaCadastrados();
                    break;
                case 6:
                    detalharEvento();
                    break;
                case 7:
                    listaSessao();
                    break;
                case 8:
                    System.out.println("Obrigado por utilizar o administrador de programas!");// nao faz nada, apenas vai sair do programa
                    break;
                default:
                    System.out.println("\n");
                }
            }while (control != 8);
    }
    
    /**
     * Responsável por verficar se uma sessão não possui conteúdo ou não foi instanciada.
     * 
     * @param  listaSessoes Um objeto da lista de sessões.
     * @return Verificação se é veradeiro ou falso.
     */
    public boolean isNull()
    {
        return Objects.isNull(listaSessoes);
    }
    
    /**
     * Responsável por mostrar as possíveis decisões que o usuário pode tomar.
     * 
     * @return  O valor da escolha do usuário 
     */
    public static int menu()
    {
        System.out.println("\n\nOlá, bem vindo ao módulo de administração do gerenciador de eventos, digite o número referente a operação desejada");
            
        System.out.println("Cadastrar um filme ...................1");
        System.out.println("Cadastrar um show ....................2");
        System.out.println("Cadastrar uma partida de futebol .....3");
        System.out.println("Cadastrar sessão de evento ...........4");
        System.out.println("Listar todos os eventos cadastrados...5");
        System.out.println("Detalhar um evento ...................6");
        System.out.println("Listar as sessões de um evento .......7");
        System.out.println("Sair .................................8");
        System.out.println("\n");
        
        String entrada = "";
        
        Scanner escolha = new Scanner(System.in);
        entrada = escolha.nextLine();
        
        String escolhaSemEspacos = entrada.replaceAll(" ", "");
        
        int escolhaReal; 
       if ((entrada.equals("1")) || (entrada.equals("2")) || (entrada.equals("3")) || (entrada.equals("4")) || (entrada.equals("5")) || (entrada.equals("6")) || (entrada.equals("7")) || (entrada.equals("8")))
       {
           int escolhaInt = Integer.parseInt(entrada);
           return escolhaInt;
           //escolhaReal = escolhaInt;
       }
       else{
           throw new RuntimeException("Valor " + "'" + entrada + "'" + " não é um valor válido. O valor deve ser um número inteiro entre 1 e 8.");
       } 
    }
    
    /**
     * Responsável por fazer um cadastro de um evento do tipo filme.
     * 
     * @return Não possui.
     */
    private static void cadastraFilme()
    {
        Scanner dado = new Scanner(System.in);
        
        String nome;
        String local;
        String genero;
        ArrayList<String> atores = new ArrayList <String> ();
        String ator;
        String diretor;
        
        //recebendo o nome do filme
        System.out.print("Digite o nome do filme: ");
        nome = dado.nextLine();
        
        //recebendo o nome do local
        System.out.print("Digite o nome do local de exibição do filme: ");
        local = dado.nextLine();
        
        //recebendo o nome do genero
        System.out.print("Digite o gênero: ");
        genero = dado.nextLine();
        
        //recebendo a lista de atores
        System.out.print("Digite os nomes que compõe a lista de atores. Após cada nome aperte enter. Ao final, digite ok: ");
        do{
            ator = dado.nextLine();
            atores.add(ator);
        }while (!(ator.equalsIgnoreCase("")));
        
        //recebendo o nome do diretor
        System.out.print("Digite o diretor: ");
        diretor = dado.nextLine();
        
        Filme filmeNovo = new Filme(nome, local, genero, atores, diretor);
        eventos.add(filmeNovo);
        
        dado.close();
    }
    
    /**
     * Responsável por fazer um cadastro de um evento do tipo show.
     * 
     * @return Não possui.
     */
    private static void cadastraShow()
    {
        Scanner dado = new Scanner(System.in);
        
        String nome; 
        String local;
        String cantor;
        String nomeTurne;
        
        //recebendo o nome do show
        System.out.print("Digite o nome do show: ");
        nome = dado.nextLine();
        
        //recebendo o nome do local
        System.out.print("Digite o nome do local de exibição do show: ");
        local = dado.nextLine();
        
        //recebendo o nome do cantor
        System.out.print("Digite o nome do cantor: ");
        cantor = dado.nextLine();       
        
        //recebendo o nome do diretor
        System.out.print("Digite o nome da turnê: ");
        nomeTurne = dado.nextLine();
        
        Show showNovo = new Show(nome, local, cantor, nomeTurne);
        eventos.add(showNovo);
        
        for(EventoGeral e: eventos)
        {
            e.getNome();
        }
        
        dado.close();
    }
    
    /**
     * Responsável por fazer um cadastro de um evento do tipo partida de futebol.
     * 
     * @return Não possui.
     */
    private static void cadastraFutebol()
    {
        Scanner dado = new Scanner(System.in);
        
        String nome;
        String local;
        String campeonato;
        String timeDaCasa;
        
        //recebendo o nome do filme
        System.out.print("Digite o nome do jogo de futebol: ");
        nome = dado.nextLine();
        
        //recebendo o nome do local
        System.out.print("Digite o nome do local de exibição do jogo de futebol: ");
        local = dado.nextLine();
        
        //recebendo o nome do cantor
        System.out.print("Digite o nome do campeonato: ");
        campeonato = dado.nextLine();       
        
        //recebendo o nome do diretor
        System.out.print("Digite o nome do time da casa: ");
        timeDaCasa = dado.nextLine();
        
        Futebol futebolNovo = new Futebol(nome, local, campeonato, timeDaCasa);
        eventos.add(futebolNovo);
        
        for(EventoGeral e: eventos)
        {
            e.getNome();
        }
        
        dado.close();
    }
    
    private static boolean verificaEvento(nome)
    
    /**
     * Responsável por verificar se é possível fazer um cadastro de um evento e chamar a criaSessao().
     * 
     * @return Não possui.
     */
    private static void cadastrarSessao()
    {
        Scanner dado = new Scanner(System.in);
        
        System.out.println("\nDigite o nome e o tipo do evento para o qual será criada uma sessão:\n");
        
        boolean existe = false; //Verifica se o evento escolhido existe na lista
        
        String nome;
        String tipo;
        System.out.print("Digite o nome do evento da sessão: ");

        System.out.println("\nNome do evento: ");
        nome = dado.nextLine();
        
        System.out.println("\nTipo de evento (filme, show e futebol são válidos) ");
        tipo = dado.nextLine();
                        
        existe = confereNome(nome,tipo);
                        
        if(existe == true){
            try
            { 
                criaSessao(nome, tipo);
            }catch(Exception e){
        
                System.out.println(e.getMessage());
                criaSessao(nome, tipo);
        
            }
        }else{
            System.out.println("\n ->Não foi possível encontrar o evento desejado na lista!\n");
        }
        
        dado.close();
    }
    
    /**
     * Responsável por criar e cadastrar uma sessão de um evento escolhido.
     * 
     * @param String O nome e o tipo do evento para o qual se deseja cadastrar uma sessão.
     * @return Não possui.
     */
    private static void criaSessao(String nome, String tipo)
    {
        Scanner dado = new Scanner(System.in);
        
        String dataDia;
        String dataMes;
        String dataAno;
        String capacidade;
        
        //recebendo a data da sessao no formato dd/mm/aaaa
        System.out.print("\nDigite a data do dia da sessao: ");
        dataDia = dado.nextLine();
        
        //recebendo a data da sessao no formato dd/mm/aaaa
        System.out.print("\nDigite a data do mês da sessao: ");
        dataMes = dado.nextLine();
        
        //recebendo a data da sessao no formato dd/mm/aaaa
        System.out.print("\nDigite a data do ano da sessao: ");
        dataAno = dado.nextLine();
        
        //recebendo a capacidade do evento
        System.out.print("\nDigite o número de pessoas do evento: ");
        capacidade = dado.nextLine();

        String data;
        if ((verStringInt(dataDia)) && (verStringInt(dataMes)) && (verStringInt(dataAno)) && (verStringInt(capacidade)))
        {
            int dataD = Integer.parseInt(dataDia);
            int dataM = Integer.parseInt(dataMes);
            
            if((dataD >= 1) && (dataD <= 31) && (dataM >= 1) && (dataM <= 12))
            {
                data = (dataDia + "/" + dataMes + "/" + dataAno);
            }else{
                throw new RuntimeException("\n->Confira os valores inseridos nas datas e nas capacidades. Os campos somente aceitam números inteiros da seguinte forma:\n\n->Dias devem ser inteiros que não podem ultrapassar 31 dias\n->Meses devem ser inteiros que não podem ultrapassar 12\n->Anos devem ser valores inteiros\n->Capacidade de pessoas deve ser um número inteiro\n\nPor favor insira novamente");
            }
        }else{
            throw new RuntimeException("\n->Confira os valores inseridos nas datas e nas capacidades. Os campos somente aceitam números inteiros da seguinte forma:\n\n->Dias devem ser inteiros que não podem ultrapassar 31 dias\n->Meses devem ser inteiros que não podem ultrapassar 12\n->Anos devem ser valores inteiros\n->Capacidade de pessoas deve ser um número inteiro\n\nPor favor insira novamente");
        }
        
        Sessao sessao = new Sessao (data, capacidade, nome, tipo);
        
        String confere;
        boolean ver = false;
        if (tipo.equals("futebol")){           
            for(Sessao e: listaSessoes)
            {
                confere = e.getNome();
                if(nome.equals(confere))
                {
                    ver = true;
                    System.out.println("\n ->Esse evento já possui sessão marcada !\n");
                    break;
                }
            }
            if(ver == false)
            {
                listaSessoes.add(sessao);
            }else{
                System.out.println("");
            }
        }
        else
        {
            listaSessoes.add(sessao);
        }
        
        dado.close();
    }
    
    /**
     * Responsável por conferir se o evento desejado existe.
     * 
     * @param String O nome e o tipo do evento para o qual se deseja cadastrar uma sessão.
     * @return Verdadeiro ou falso dependendo do resultado.
     */
    private static boolean confereNome(String nome, String tipo)
    {
        boolean esta = false;
        String confere;
        for(EventoGeral e: eventos)
        {
            confere = e.getNome();
            if(nome.equals(confere))
            {
                confere = e.getTipo();
                if(tipo.equals(confere))
                {
                    esta = true;
                    break; //Para o processo quando o objetivo é atingido
                }else{
                    esta = false;
                }
            }else{
                esta = false;
            }
        }
        return esta;
    }
    
    /**
     * Responsável por listar todos os eventos cadastrados, seus nomes e tipos.
     * 
     * @return Não possui.
     */
    private static void listaCadastrados()
    {
        System.out.print("   Nome do evento:    |    Tipo do Evento:  \n");
        for(EventoGeral e: eventos)
        {   
            System.out.print("         " + e.getNome() + "   -   " + e.getTipo() + "\n");   
        }
    }
    
    /**
     * Responsável por detalhar todos os eventos cadastrados, com todos os seus dados.
     * 
     * @return Não possui.
     */
    private static void detalharEvento()
    {
        Scanner dado = new Scanner(System.in);
        
        String tipo;
        String nome;
        String confere;
        boolean verifica;

        System.out.print("Digite o nome do evento: ");
        nome = dado.nextLine();
        System.out.print("Digite o tipo do evento: ");
        tipo = dado.nextLine();

        verifica = confereNome(nome,tipo);

        if(verifica == true){
            for(EventoGeral e: eventos)
            {
                confere = e.getNome();
                if(nome.equals(confere))
                {
                    confere = e.getTipo();
                    if(tipo.equals(confere))
                    {
                        System.out.println(e.toString());
                        break;
                    }
                }
            }
        }else{
            System.out.println("\n\nDeu não. Você está procurando um evento inexistente.\n\n");
        }
        dado.close();
    }
    
    /**
     * Responsável por listar todas as sessões de um evento específico, chamando a printaSesao().
     * 
     * @return Não possui.
     */
    private static void listaSessao()
    {
        Scanner dado = new Scanner(System.in);

        String tipo;
        String nome;
        String confere;
        boolean verifica;

        System.out.print("Digite o nome do evento: ");
        nome = dado.nextLine();
        System.out.print("Digite o tipo do evento: ");
        tipo = dado.nextLine();

        verifica = confereNome(nome,tipo);

        if(verifica == true){
            for(EventoGeral e: eventos)
            {
                confere = e.getNome();
                if(nome.equals(confere))
                {
                    confere = e.getTipo();
                    if(tipo.equals(confere))
                    {
                        printaSessao(nome, tipo);
                        break;
                    }
                }
            }
        }else{
            System.out.println("\n\nVocê está procurando uma sessão inexistente.\n\n");
        }
    }
    
    /**
     * Responsável por detalhar todos os eventos cadastrados, com todos os seus dados para um evento desejado.
     * 
     * @param String Nome e tipo do evento desejado.
     * @return Não possui.
     */
    private static void printaSessao(String nome, String tipo)
    {
        String confere;
        boolean nTem = true;
        for(Sessao s: listaSessoes)
        {
            confere = s.getNome();
            if(nome.equals(confere))
            {
                confere = s.getTipo();
                if(tipo.equals(confere))
                {
                    System.out.println(s.toString());   
                    nTem = false;
                 }
            }                 
        }
        if(nTem == true){
            System.out.println("\n->Não há sesões para este evento!\n");  
        }
    } 
    
    /**
     * Responsável por verificar se uma string é formada somente de números inteiros.
     * 
     * @param String Nome da string a ser verificada.
     * @return Verdadeiro ou falso dependendo do resultado.
     */
    public static boolean verStringInt(String verificada) 
    {
        return verificada != null && verificada.matches("[0-9]*");
    }
}


