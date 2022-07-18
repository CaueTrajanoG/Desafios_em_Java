package aula14;

public class Video implements AcoesVideo{
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int likes;
    private boolean reproduzindo;

    
    //contrutor
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.likes = 0;
        this.reproduzindo = false;
    }

    //Métodos da interface
    @Override
    public void play(){
        this.setReproduzindo(true);
    }
    @Override
    public void pause(){
        this.setReproduzindo(false);
    }
    @Override
    public void like(){
        this.setLikes(this.getLikes() + 1);
    }
    //Metodos

    public void status(){
        System.out.println("\nTitulo: "+this.titulo);
        System.out.println("Avaliação "+this.avaliacao);
        System.out.println("Visualizações: "+this.views);
        System.out.println("Likes: "+this.likes);
        System.out.println("Reproduzindo: "+this.reproduzindo+"\n");
    }

    //Getters e Setters

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }


    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }


    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }

}
