package fr.univavignon.pokedex.api;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;

import org.junit.*;

public class IPokemonFactoryTest {
   IPokemonFactory iPokemonFactory=new PokemonFactory();
	


@Test
public void testCreatePokemon() {
	Pokemon fakePokemon=iPokemonFactory.createPokemon(0,613, 64,4000,4);
	assertNotNull(fakePokemon);
	assertEquals(0, fakePokemon.getIndex());
	assertEquals(613, fakePokemon.getCp());
	assertEquals(64, fakePokemon.getHp());
	assertEquals(4000, fakePokemon.getDust());
	assertEquals(4, fakePokemon.getCandy());


}
@Test
public void testNullPokemon() {
	assertThrows(PokedexException.class,() ->iPokemonFactory.createPokemon(889,613, 64,4000,4));

}
}
