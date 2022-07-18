package aula14;

public class Aula14 {
    public static void main(String[] args) {

        Video v[] = new Video[2];
        Gafanhoto g = new Gafanhoto("Carlos", 20, "M", "Carlin", 0);

        v[0] = new Video("Video 01");
        v[1] = new Video("Video 02");

        Visualizacao vis = new Visualizacao(g, v[0]);
        Visualizacao vis2 = new Visualizacao(g, v[1]);
        vis2.avaliar(7);
        System.out.println(g.getTotAssistido());
        // System.out.println(vis.toString());
        v[0].status();
        // System.out.println(g.getNome());
        /*
         * v[0].play();
         * v[0].like();
         * v[0].status();
         * v[1].status();
         * g.status();
         */
    }
}
