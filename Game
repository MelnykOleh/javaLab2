package lab2;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@XmlRootElement(name = "game")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"gameName","developer","characterList"})

public class Game  implements Serializate, Serializable {
    private String gameName;
    private String developer;
    private List<Character>characterList;


    public String getGameName() {
        return gameName;
    }
    public String getDeveloper() {
        return developer;
    }
    public List<Character> getCharacterList() {
        return characterList;
    }

    @XmlElement
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    @XmlElement
    public void setDeveloper(String developer) {
        this.developer = developer;
    }
    @XmlElement
    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }

    public static class Builder {
        private Game newGame;

        public Builder() {
            newGame = new Game();
        }

        public Builder withGameName(String name){
            newGame.gameName = name;
            return this;
        }

        public Builder withDeveloper(String developer){
            newGame.developer = developer;
            return this;
        }

        public Builder withList(List<Character> list){
            newGame.characterList = list;
            return this;
        }

        public Game build(){
            return newGame;
        }

    }

    public static List<Character> filter(List<Character> list, String name){

        for(int i = list.size()-1; i >=0 ;i--){
            if(list.get(i).getName() == name) {
                list.remove(i);
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", developer='" + developer + '\'' +
                ", characterList=" + characterList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return gameName.equals(game.gameName) && Objects.equals(developer, game.developer) && Objects.equals(characterList, game.characterList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameName, developer, characterList);
    }
}
