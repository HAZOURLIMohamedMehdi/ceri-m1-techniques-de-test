package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertNotNull;

import org.junit.*;


public class IPokedexFactoryTest {
	PokedexFactory iPokedexFactory=new PokedexFactory();
	PokemonMetadataProvider metadataProvider=new PokemonMetadataProvider();
	PokemonFactory pokemonFactory=new PokemonFactory();
	IPokedex iPokedex;


@Test
public void testCreatePokedex() {	
	 iPokedex=iPokedexFactory.createPokedex(metadataProvider, pokemonFactory);
	assertNotNull(iPokedex);
}
}
