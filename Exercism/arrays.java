public class arrays {

    public static void main(String[] args) {
        String palavra = "a";
        int pontos = 0;
        for (int i = 0; i < palavra.length(); i++) {
            String letra = palavra.substring(i, i + 1);
            if (    letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u")||
                    letra.equalsIgnoreCase("l")||
                    letra.equalsIgnoreCase("n")||
                    letra.equalsIgnoreCase("r")||
                    letra.equalsIgnoreCase("s")||
                    letra.equalsIgnoreCase("t")) {

                pontos++;
            } else if ( letra.equalsIgnoreCase("d")||
                        letra.equalsIgnoreCase("g")) {
                pontos = pontos + 2;
            }else if(   letra.equalsIgnoreCase("b")||
                        letra.equalsIgnoreCase("c")||
                        letra.equalsIgnoreCase("m")||
                        letra.equalsIgnoreCase("p")){
                pontos += 3;
            }else if(   letra.equalsIgnoreCase("f")||
                        letra.equalsIgnoreCase("h")||
                        letra.equalsIgnoreCase("v")||
                        letra.equalsIgnoreCase("w")||
                        letra.equalsIgnoreCase("y")){
                pontos += 4;
            }else if(letra.equalsIgnoreCase("k")){
                pontos +=5;
            }else if(letra.equalsIgnoreCase("j")||letra.equalsIgnoreCase("x")){
                pontos += 8;
            }else if(letra.equalsIgnoreCase("q")||letra.equalsIgnoreCase("z")){
                pontos += 10;
            }else{
                System.out.println("Caractere incorreto");
            }

        }
        System.out.println("Pontos: " + pontos);

    }

    public static int scrabble() {
        return 0;
    }
    /*
     * Letter Value
     * A, E, I, O, U, L, N, R, S, T (1)
     * D, G                         (2)
     * B, C, M, P                   (3)
     * F, H, V, W, Y                (4)
     * K                            (5)
     * J, X                         (8)
     * Q, Z                         (10)
     */
}
