package lab2;

import java.util.ArrayList;
import java.util.List;


class Main {


    public static void main(String args[]){

        Character character_1 = new Character();
        character_1.setName("character_1");
        character_1.setHealth(11);
        character_1.setAttack(1);

        Character character_2 = new Character();
        character_2.setName("character_2");
        character_2.setHealth(22);
        character_2.setAttack(2);

        Character character_3 = new Character();
        character_3.setName("character_3");
        character_3.setHealth(33);
        character_3.setAttack(3);

        Character character_4 = new Character();
        character_4.setName("character_4");
        character_4.setHealth(44);
        character_4.setAttack(4);

        Character character_5 = new Character();
        character_5.setName("character_5");
        character_5.setHealth(55);
        character_5.setAttack(5);

        Character character_6 = new Character();
        character_6.setName("character_6");
        character_6.setHealth(66);
        character_6.setAttack(6);

        Character character_7 = new Character();
        character_7.setName("character_7");
        character_7.setHealth(77);
        character_7.setAttack(7);


        Game game_1 = new Game();
        game_1.setGameName("Game_1");
        game_1.setDeveloper("Developer_1");
        List<Character> list_1 =new ArrayList<Character>();
        list_1.add(character_1);
        list_1.add(character_2);
        list_1.add(character_3);
        list_1.add(character_4);
        list_1.add(character_5);
        game_1.setCharacterList(list_1);


        game_1.SerializeToTxt(game_1);
        Game game_1_f = game_1.SerializeFromTxt();
        System.out.println(game_1_f);


        Game game_2 = new Game();
        game_2.setGameName("Game_2");
        game_2.setDeveloper("Developer_2");
        List<Character> list_2 =new ArrayList<Character>();
        list_2.add(character_2);
        list_2.add(character_3);
        list_2.add(character_4);
        list_2.add(character_5);
        list_2.add(character_6);
        game_2.setCharacterList(list_2);

        game_2.SerializeToXml(game_2);

        Game game_2_from = game_2.SerializeFromXml();
        System.out.println(game_2_from);

        Game game_3 = new Game();
        game_3.setGameName("Game_3");
        game_3.setDeveloper("Developer_3");
        List<Character> list_3 =new ArrayList<Character>();
        list_3.add(character_3);
        list_3.add(character_4);
        list_3.add(character_5);
        list_3.add(character_6);
        list_3.add(character_7);
        game_3.setCharacterList(list_3);

        game_3.SerializeToJson(game_3);

        Game game_3_from = game_3.SerializeFromJson();
        System.out.println(game_3_from);

    }
}
