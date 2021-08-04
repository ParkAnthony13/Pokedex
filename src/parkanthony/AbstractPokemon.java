package parkanthony;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon poke = new Pokemon(name,health,type);
		return poke;
	}
	public String pokemonInfo(Pokemon pokemon) {
		String result = pokemon.getName()+" " + pokemon.getHealth()+" " + pokemon.getType();
		return result;
	}
}
