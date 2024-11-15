package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;
import org.junit.Test;

public class IPokemonTrainerFactoryTest {
	IPokemonTrainerFactory iPokemonTrainerFactory=new PokemonTrainerFactory();
	String name="mehdi";
	Team team=Team.INSTINCT;
	IPokedexFactory pokedexFactory=new PokedexFactory();
	PokemonMetadataProvider metadataProvider=new PokemonMetadataProvider();
	PokemonFactory pokemonFactory=new PokemonFactory();
	IPokedex pokedex=new Pokedex(metadataProvider, pokemonFactory);


@Test
public void testCreateTrainer() {
	PokemonTrainer fakePokemonTrainer=iPokemonTrainerFactory.createTrainer(name, team, pokedexFactory);
	assertNotNull(fakePokemonTrainer);
	assertEquals(name,fakePokemonTrainer.getName());
	assertEquals(team,fakePokemonTrainer.getTeam());
	assertEquals(pokedex,fakePokemonTrainer.getPokedex());

}
}
