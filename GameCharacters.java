//Base class GameCharacter: field name, method attack()
//Subclasses:
//Warrior: override attack() to return melee damage
//Archer: uses arrowCount
//Mage: uses mana
//Override attack() in each and demonstrate use via polymorphic method calls.
//File: GameCharacters.java.

class GameCharacter {
    protected String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public String attack() {
        return name + " attacks!";
    }
}


class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return name + " strikes with a sword (melee damage)!";
    }
}


class Archer extends GameCharacter {
    private int arrowCount;

    public Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }

    @Override
    public String attack() {
        if (arrowCount > 0) {
            arrowCount--;
            return name + " shoots an arrow! Arrows left: " + arrowCount;
        } else {
            return name + " has no arrows left!";
        }
    }
}


class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    @Override
    public String attack() {
        if (mana >= 10) {
            mana -= 10;
            return name + " casts a spell! Mana left: " + mana;
        } else {
            return name + " doesn't have enough mana!";
        }
    }
}

public class GameCharacters {
    public static void main(String[] args) {
        
        GameCharacter[] characters = {
            new Warrior("Thor"),
            new Archer("Legolas", 3),
            new Mage("Gandalf", 20)
        };

        
        for (GameCharacter character : characters) {
            System.out.println(character.attack());
        }

        
        System.out.println(characters[1].attack()); 
        System.out.println(characters[2].attack()); 
    }
}