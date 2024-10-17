package fr.univavignon.pokedex.api;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.*;

public class IPokedexTest {
	IPokedex iPokedex;
	Pokemon pokemon;
	Pokemon pokemon2;
	List<Pokemon> pokemons=new ArrayList<Pokemon>();
@Before 
public void config() {
iPokedex=mock(IPokedex.class);	
pokemon=new Pokemon(1,"Pikachu",55,40,35, 500, 35,1000,25, 0.85);
pokemon2=new Pokemon(2,"Bulbasaur",49, 49,45, 450, 45,900, 20,0.90 );
pokemons.add(pokemon);
pokemons.add(pokemon2);
}


@Test
public void testSize() {
	when(iPokedex.size()).thenReturn(2);
	
	assertEquals(2, iPokedex.size());
}


@Test
public void testAddPokemon() {
	when(iPokedex.addPokemon(pokemon)).thenReturn(1);
	
	assertEquals(1, iPokedex.addPokemon(pokemon));
}

@Test
public void testGetPokemon() throws PokedexException {
	when(iPokedex.getPokemon(1)).thenReturn(pokemon);
	
	assertTrue(pokemon.equals(iPokedex.getPokemon(1)));
}

@Test
public void testGetPokemons() {
	when(iPokedex.getPokemons()).thenReturn(Arrays.asList(pokemon,pokemon2));
	
	assertEquals(pokemons, iPokedex.getPokemons());
}


@Test
public void testGetPokemonsOrder() {
    Comparator<Pokemon> nameComparator = Comparator.comparing(Pokemon::getName);
    List<Pokemon> pokemonsOrderByName=new ArrayList<Pokemon>();
    pokemonsOrderByName.add(pokemon2);
    pokemonsOrderByName.add(pokemon);
	when(iPokedex.getPokemons(nameComparator)).thenReturn(Arrays.asList(pokemon2,pokemon));
	
	assertEquals(pokemonsOrderByName, iPokedex.getPokemons(nameComparator));
}


}
