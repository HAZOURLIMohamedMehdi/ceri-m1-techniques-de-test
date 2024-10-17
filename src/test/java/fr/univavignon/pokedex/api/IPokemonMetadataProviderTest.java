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
		pokemon=new PokemonMetadata(1,"Pikachu",55,40,35);
		iPokemonMetadataProvider=mock(IPokemonMetadataProvider.class);
	}
		


	@Test
	public void testGetPokemonMetadata() throws PokedexException {
		when(iPokemonMetadataProvider.getPokemonMetadata(1)).thenReturn(pokemon);
		PokemonMetadata fakePokemon=iPokemonMetadataProvider.getPokemonMetadata(1);
		assertNotNull(fakePokemon);
		assertEquals(1, fakePokemon.getIndex());
		assertEquals("Pikachu", fakePokemon.getName());
		assertEquals(55, fakePokemon.getAttack());
		assertEquals(44, fakePokemon.getDefense());
		assertEquals(35, fakePokemon.getStamina());

		
	}
}
