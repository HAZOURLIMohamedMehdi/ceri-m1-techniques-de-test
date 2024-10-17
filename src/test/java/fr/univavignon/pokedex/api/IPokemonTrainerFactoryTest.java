package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IPokemonTrainerFactoryTest {
	IPokemonTrainerFactory iPokemonTrainerFactory;
	String name="mehdi";
	Team team=Team.INSTINCT;
	IPokedexFactory pokedexFactory;
	IPokedex pokedex;
	PokemonTrainer pokemonTrainer;
@Before 
public void config() {
	iPokemonTrainerFactory=mock(IPokemonTrainerFactory.class);
	pokedexFactory=mock(IPokedexFactory.class);
	pokedex=mock(IPokedex.class);
	pokemonTrainer=new PokemonTrainer(name,team,pokedex);
}


@Test
public void testCreateTrainer() {
	when(iPokemonTrainerFactory.createTrainer(name, team, pokedexFactory)).thenReturn(pokemonTrainer);
	PokemonTrainer fakePokemonTrainer=iPokemonTrainerFactory.createTrainer(name, team, pokedexFactory);
	assertNotNull(fakePokemonTrainer);
	assertEquals(name,fakePokemonTrainer.getName());
	assertEquals(team,fakePokemonTrainer.getTeam());
	assertEquals(pokedex,fakePokemonTrainer.getPokedex());

}
}
