package fr.univavignon.pokedex.api;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.*;

public class IPokemonFactoryTest {
   IPokemonFactory iPokemonFactory;
	Pokemon pokemon;
	

@Before
public void config() {
	pokemon=new Pokemon(0,"Bulbizarre",126,126,90, 613, 64,4000,4, 56);
	iPokemonFactory=mock(IPokemonFactory.class);
}
	


@Test
public void testCreatePokemon() {
	when(iPokemonFactory.createPokemon(0,613, 64,4000,4)).thenReturn(pokemon);
	Pokemon fakePokemon=iPokemonFactory.createPokemon(0,613, 64,4000,4);
	assertNotNull(fakePokemon);
	assertEquals(0, fakePokemon.getIndex());
	assertEquals(613, fakePokemon.getCp());
	assertEquals(64, fakePokemon.getHp());
	assertEquals(4000, fakePokemon.getDust());
	assertEquals(4, fakePokemon.getCandy());


}
}
