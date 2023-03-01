package MagesAndWarrios;

public class mainClass {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Warrior guerreiro = new Warrior();


        System.out.println(guerreiro.damagePoints(wizard) + " Pontos de dano no mago");
        System.out.println(wizard.damagePoints(guerreiro) + " De dano no guerreiro");

        System.out.println(wizard.isVulnerable());
        wizard.prepare();
        System.out.println(guerreiro.damagePoints(wizard) + " Pontos de dano no mago");
        System.out.println(wizard.isVulnerable());
        System.out.println(wizard.damagePoints(guerreiro) + " De dano no guerreiro");

    }
}
