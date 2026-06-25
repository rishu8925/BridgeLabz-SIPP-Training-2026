class GameCharacter {
    String characterName;

    GameCharacter(String name) {
        characterName = name;
    }

    void performAttack() {
        System.out.println("Attack");
    }
}

class Warrior extends GameCharacter {
    Warrior(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with sword");
    }
}

class Mage extends GameCharacter {
    Mage(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " casts magic");
    }
}

class Archer extends GameCharacter {
    Archer(String name) {
        super(name);
    }

    void performAttack() {
        System.out.println(characterName + " shoots arrow");
    }
}

public class GameSystem {
    static void startBattle(GameCharacter[] characters) {
        int warrior = 0, mage = 0, archer = 0;

        for (GameCharacter c : characters) {
            c.performAttack();

            if (c instanceof Warrior) warrior++;
            else if (c instanceof Mage) mage++;
            else if (c instanceof Archer) archer++;
        }

        System.out.println("Warriors: " + warrior);
        System.out.println("Mages: " + mage);
        System.out.println("Archers: " + archer);
    }

    public static void main(String[] args) {
        GameCharacter[] arr = {
            new Warrior("Thor"),
            new Mage("Merlin"),
            new Archer("Robin")
        };

        startBattle(arr);
    }
}