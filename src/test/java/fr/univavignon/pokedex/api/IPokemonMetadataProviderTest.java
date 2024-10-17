package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class IPokemonMetadataProviderTest {		
	PokemonMetadata pokemon;
	IPokemonMetadataProvider iPokemonMetadataProvider;

	@Before
	public void config() {
		pokemon=new PokemonMetadata(0,"Bulbizarre",126,126,90);
		iPokemonMetadataProvider=mock(IPokemonMetadataProvider.class);
	}
		


	@Test
	public void testGetPokemonMetadata() throws PokedexException {
		when(iPokemonMetadataProvider.getPokemonMetadata(0)).thenReturn(pokemon);
		PokemonMetadata fakePokemon=iPokemonMetadataProvider.getPokemonMetadata(0);
		assertNotNull(fakePokemon);
		assertEquals(0, fakePokemon.getIndex());
		assertEquals("Bulbizarre", fakePokemon.getName());
		assertEquals(126, fakePokemon.getAttack());
		assertEquals(126, fakePokemon.getDefense());
		assertEquals(90, fakePokemon.getStamina());

		
	}
}
