package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RocketPokemonFactoryTest {
    private RocketPokemonFactory pokemonFactory;

    @Before
    public void setUp() {
        pokemonFactory = new RocketPokemonFactory();
    }

    @Test
    public void testCreatePokemon() {
        int index = 0;
        int cp = 300;
        int hp = 33;
        int dust = 1500;
        int candy = 2;

        Pokemon fakePokemon = pokemonFactory.createPokemon(index, cp, hp, dust, candy);

        assertNotNull(fakePokemon);
        assertEquals(index, fakePokemon.getIndex());
        assertEquals(cp, fakePokemon.getCp());
        assertEquals(hp, fakePokemon.getHp());
        assertEquals(dust, fakePokemon.getDust());
        assertEquals(candy, fakePokemon.getCandy());
    }



    @Test
    public void testCreatePokemonInIndex2name() {
        int index = -1;
        int cp = 300;
        int hp = 20;
        int dust = 5600;
        int candy = 3;

        Pokemon pokemon = pokemonFactory.createPokemon(index, cp, hp, dust, candy);

        assertNotNull(pokemon);
        assertEquals("Ash's Pikachu", pokemon.getName());
    }

    @Test
    public void testCreatePokemonIndexOutOfRange() {
        int index = 168;
        int cp = 1500;
        int hp = 95;
        int dust = 2000;
        int candy = 3;

        Pokemon pokemon = pokemonFactory.createPokemon(index, cp, hp, dust, candy);

        assertNotNull(pokemon);
        assertEquals("MISSINGNO", pokemon.getName());
    }
}
