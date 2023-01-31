public class isograma {
    public static void main(String[] args) {
        //System.out.println(isIsogram("Alf"));
        String palavra = "aba";
        System.out.println(palavra.chars().distinct());
        //metodo distinct mostra quais letras distintas existem na string, count as conta.
        // Combinando ambas é possivel identificar se existem letras repetidas
        // comparando-as com o numero total de chars
    }
    public static boolean isIsogram(String phrase) {
        phrase = phrase.replace("-", "").replace(" ", "").toLowerCase();
        return (phrase.chars().distinct().count() == phrase.length());
    }
}
