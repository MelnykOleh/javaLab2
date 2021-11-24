
package lab2;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.*;
import java.util.regex.Pattern;
import java.util.Objects;
import java.util.regex.Pattern;
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"name","health","attack"})

public class Character implements Serializable {
    protected String name;
    protected double health;
    protected double attack;

    public String getName() {return name;}

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    @XmlElement
    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    @XmlElement
    public void setAttack(double attack) {
        this.attack = attack;
    }

    @JsonIgnore
    public void changeHealth(double coefficient) {
        this.health = this.health-this.health*coefficient;
    }

    @JsonIgnore
    public void changeAttack(double coefficient) {
        this.attack = this.attack-this.attack*coefficient;
    }

    public static class Builder {
        private Character newCharacter;

        public Builder() {
            newCharacter = new Character();
        }

        public Builder withName(String name){
            newCharacter.name = name;
            return this;
        }

        public Builder withHealth(double health){
            newCharacter.health = health;
            return this;
        }

        public Builder withAttack(double attack){
            newCharacter.attack = attack;
            return this;
        }

        public Character build(){
            return newCharacter;
        }

    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Double.compare(character.health, health) == 0 && Double.compare(character.attack, attack) == 0 && name.equals(character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, attack);
    }
}
