package DungeonsAndDragons;
import java.util.Random;

public class geradorDungeonsAndDragons {
    private int Strength ;
    private int Dexterity;
    private int Constituition;
    private int Intelligence;
    private int Wisdom;
    private int Charisma;
    private int Hitpoints;
    Random gerador = new Random();

    public int getStrength() {
        return Strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public int getConstituition() {
        return Constituition;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public int getCharisma() {
        return Charisma;
    }

    public int getHitpoints() {
        return Hitpoints;
    }

    public geradorDungeonsAndDragons() {
        Strength = ability();
        Dexterity = ability();
        Constituition = ability();
        Intelligence = ability();
        Wisdom = ability();
        Charisma = ability();
        Hitpoints = 10 + modifier(Constituition);
    }
    int ability() {
        return gerador.nextInt(3,19);
    }
    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }
}
