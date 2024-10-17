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
	pokemon=new Pokemon(1,"Pikachu",55,40,35, 500, 35,1000,25, 0.85);
	iPokemonFactory=mock(IPokemonFactory.class);
}
	


@Test
public void testCreatePokemon() {
	when(iPokemonFactory.createPokemon(1,500, 35,1000,25)).thenReturn(pokemon);
	Pokemon fakePokemon=iPokemonFactory.createPokemon(1,500, 35,1000,25);
	assertNotNull(fakePokemon);
	assertEquals(1, fakePokemon.getIndex());
	assertEquals(500, fakePokemon.getCp());
	assertEquals(35, fakePokemon.getHp());
	assertEquals(1000, fakePokemon.getDust());
	assertEquals(25, fakePokemon.getCandy());


}
}
