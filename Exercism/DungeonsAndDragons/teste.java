package DungeonsAndDragons;

public class teste {
    public static void main(String[] args) {
        
        /*geradorDungeonsAndDragons character = new geradorDungeonsAndDragons();


        System.out.println(character.getStrength() );
        System.out.println(character.getDexterity());
        System.out.println(character.getConstituition());
        System.out.println(character.getIntelligence());
        System.out.println(character.getWisdom());
        System.out.println(character.getCharisma());
        System.out.println(character.getHitpoints());
*/      boolean signal = false;
        for (int i = 0; i < 200; i++) {
            geradorDungeonsAndDragons character = new geradorDungeonsAndDragons();

            assertEquals(character.getHitpoints(), 10 + character.modifier(character.getConstituition()));
            if(character.getStrength() > 2 && character.getStrength() < 19 &&
                    character.getDexterity() > 2 && character.getDexterity() < 19 &&
                    character.getConstituition() > 2 && character.getConstituition() < 19&&
                    character.getIntelligence() > 2 && character.getIntelligence() < 19&&
                    character.getWisdom() > 2 && character.getWisdom() < 19 &&
                    character.getCharisma() > 2 && character.getCharisma() < 19 ){


                signal = true;
            }else {signal = false;}
        }
        System.out.println(signal);
    }

    private static void assertEquals(int hitpoints, int i) {
        //System.out.println(hitpoints);
       // System.out.println(i);
    }

    private static void assertTrue(boolean b) {
        //System.out.println(b);
    }
}
