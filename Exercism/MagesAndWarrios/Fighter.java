package MagesAndWarrios;

public abstract class Fighter {
        private boolean isVulnerable = false;
          boolean isVulnerable() {   return false;           }
        abstract int damagePoints(Fighter fighter);

    }

    class Warrior extends Fighter {

        boolean isVulnerable() {
            return false;
        }


        public String toString() {
            return "Fighter is a Warrior";
        }


        int damagePoints(Fighter wizard) {
            if(wizard.isVulnerable()==true){
                return 10;
            }else{
                return 6;
            }
        }
    }

    class Wizard extends Fighter {
        private boolean spellIsPrepared;

        public Wizard() {
            this.spellIsPrepared = false;
        }
        public void prepare(){
            this.spellIsPrepared = true;
        }
        boolean isVulnerable() {
            if(this.spellIsPrepared){
                return false;
            }else {
                return true;
            }
        }

        int damagePoints(Fighter warrior) {
            if(this.spellIsPrepared){
                return 12;
            }else{
                return 3;
            }
        }
        void prepareSpell() {
            spellIsPrepared = true;
        }

}


