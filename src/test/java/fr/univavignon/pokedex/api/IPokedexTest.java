package fr.univavignon.pokedex.api;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.*;

public class IPokedexTest {
	PokedexFactory iPokedexFactory=new PokedexFactory();
	PokemonMetadataProvider metadataProvider=new PokemonMetadataProvider();
	IPokedex iPokedex=new Pokedex(metadataProvider, new PokemonFactory());
	Pokemon pokemon;
	Pokemon pokemon2;
	List<Pokemon> pokemons=new ArrayList<Pokemon>();
@Before 
public void config() {
pokemon=new Pokemon(0,"Bulbizarre",126,126,90, 613, 64,4000,4, 56);
pokemon2=new Pokemon(133,"Aquali",186, 168,260, 2729, 202,5000, 4,100 );
pokemons.add(pokemon);
pokemons.add(pokemon2);
}


@Test
public void testSize() {
	iPokedex.addPokemon(pokemon);
	iPokedex.addPokemon(pokemon2);
	assertEquals(2, iPokedex.size());
}


@Test
public void testAddPokemon() {
	
	assertEquals(1, iPokedex.addPokemon(pokemon));
} 

@Test
public void testGetPokemon() throws PokedexException {
	iPokedex.addPokemon(pokemon);
	assertTrue(pokemon.equals(iPokedex.getPokemon(1)));
	//assertThrows(PokedexException.class,() ->iPokedex.getPokemon(500));
}

@Test
public void testGetPokemons() {
	iPokedex.addPokemon(pokemon);
	iPokedex.addPokemon(pokemon2);
	assertEquals(pokemons, iPokedex.getPokemons());
}


@Test
public void testGetPokemonsOrder() {
	iPokedex.addPokemon(pokemon);
	iPokedex.addPokemon(pokemon2);
    Comparator<Pokemon> nameComparator = Comparator.comparing(Pokemon::getName);
    List<Pokemon> pokemonsOrderByName=new ArrayList<Pokemon>();
    pokemonsOrderByName.add(pokemon2);
    pokemonsOrderByName.add(pokemon);	
	assertEquals(pokemonsOrderByName, iPokedex.getPokemons(nameComparator));
}


}
