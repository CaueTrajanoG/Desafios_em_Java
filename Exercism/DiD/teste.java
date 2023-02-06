package DiD;

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
*/
        for (int i = 0; i < 130; i++) {
            geradorDungeonsAndDragons character = new geradorDungeonsAndDragons();
            assertTrue(character.getStrength() > 2 && character.getStrength() < 19);
            assertTrue(character.getDexterity() > 2 && character.getDexterity() < 19);
            assertTrue(character.getConstituition() > 2 && character.getConstituition() < 19);
            assertTrue(character.getIntelligence() > 2 && character.getIntelligence() < 19);
            assertTrue(character.getWisdom() > 2 && character.getWisdom() < 19);
            assertTrue(character.getCharisma() > 2 && character.getCharisma() < 19);
            assertEquals(character.getHitpoints(), 10 + character.modifier(character.getConstituition()));
        }
    }

    private static void assertEquals(int hitpoints, int i) {
        System.out.println(hitpoints);
        System.out.println(i);
    }

    private static void assertTrue(boolean b) {
        System.out.println(b);
    }
}
