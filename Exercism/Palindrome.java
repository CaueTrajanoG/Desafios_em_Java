import java.text.Normalizer;
import java.util.Locale;

public class Palindrome {
    /*
         # Problema
            Palindrome significa palíndromo, que é uma palavra ou frase
            que pode ser lida no seu sentido normal, da esquerda para a direita,
            bem como no sentido contrário, da direita para a esquerda,
            sem que haja mudança nas palavras que a formam e no seu significado.
            No sentido normal da frase, o palíndromo deverá ser lido da forma habitual.
            Na leitura de palíndromos do fim para o início deverão ser consideradas
            apenas as letras e números, sendo desconsiderados espaços entre palavras,
            maísculas e minúsculas, sinais de pontuação e de acentuação,
            bem como outros sinais gráficos.
        # Dicas
            Comece resolvendo pequenos problemas primeiro, tais como o
            de espaçamento e letras maiúsculas/minúsculas, depois parta
            para os problemas mais complexos como pontuação, acentuação
            e sinais gráficos.
        # Exemplos
        "A grama é amarga"
        A base do teto desaba
        Adias a data da saída.
        A diva em Argel alegra-me a vida.
        */
    public static void main(String[] args) {
        String frase = "A diva em Argel alegra-me a vida";
        frase = frase.replace(" ", "");
        frase = frase.replace(".","");
        frase = frase.toLowerCase();
        frase = removerAcentos(frase);
        System.out.println(frase);
    }
    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
