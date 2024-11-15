package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class IPokemonMetadataProviderTest {		
	IPokemonMetadataProvider iPokemonMetadataProvider=new PokemonMetadataProvider();



	@Test
	public void testGetPokemonMetadata() throws PokedexException {
		PokemonMetadata fakePokemon=iPokemonMetadataProvider.getPokemonMetadata(0);
		assertNotNull(fakePokemon);
		assertEquals(0, fakePokemon.getIndex());
		assertEquals("Bulbizarre", fakePokemon.getName());
		assertEquals(126, fakePokemon.getAttack());
		assertEquals(126, fakePokemon.getDefense());
		assertEquals(90, fakePokemon.getStamina());

		
	}
}
