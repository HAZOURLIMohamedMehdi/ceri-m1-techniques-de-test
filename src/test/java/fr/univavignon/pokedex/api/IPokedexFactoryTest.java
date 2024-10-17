package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.*;


public class IPokedexFactoryTest {
	IPokedexFactory iPokedexFactory;
	IPokemonMetadataProvider metadataProvider;
	IPokemonFactory pokemonFactory;
	IPokedex iPokedex;
@Before 
public void config() {
	iPokedexFactory=mock(IPokedexFactory.class);
	metadataProvider=mock(IPokemonMetadataProvider.class);
	pokemonFactory=mock(IPokemonFactory.class);
	iPokedex=mock(IPokedex.class);
}


@Test
public void testCreatePokedex() {
	when(iPokedexFactory.createPokedex(metadataProvider, pokemonFactory)).thenReturn(iPokedex);
	
	IPokedex fakeIPokedex=iPokedexFactory.createPokedex(metadataProvider, pokemonFactory);
	assertNotNull(fakeIPokedex);
}
}
