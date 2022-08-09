package aula14;

public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totAssistido;

    //Construtor

    public Gafanhoto(String nome, int idade, String sexo, String login, int tot) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = tot;
        
    }
    public void status(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void viuMaisUm(){

        this.setTotAssistido(this.getTotAssistido() + 1 );
    }

    //Acessores

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
