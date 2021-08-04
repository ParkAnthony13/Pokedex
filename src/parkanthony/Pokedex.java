package parkanthony;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
	public void listPokemon() {
		for (Pokemon name : myPokemons) {
			System.out.println(name);
		}
	}
	public ArrayList<Pokemon> getMyPokemons() {
		return myPokemons;
	}
	public void setMyPokemons(String name, int health, String type) {
		Pokemon result = super.createPokemon(name, health, type);
		this.myPokemons.add(result);
	}
}