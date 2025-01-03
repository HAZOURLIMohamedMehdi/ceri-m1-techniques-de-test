package fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex{
    private List<Pokemon> pokemons;
    private int nextId;
    private final IPokemonMetadataProvider metadataProvider;
    private final IPokemonFactory pokemonFactory;

 public Pokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory) {
        this.metadataProvider = metadataProvider;
        this.pokemonFactory = pokemonFactory;
        this.pokemons = new ArrayList<>();
        this.nextId = 0;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
    
       return metadataProvider.getPokemonMetadata(index);
  
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) 
 {
    return pokemonFactory.createPokemon(index, cp, hp, dust, candy);
      
      
    }

    @Override
    public int size() {
        return pokemons.size();

    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
        nextId=nextId+1;
        return nextId;
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        if (id < 0 || id > pokemons.size()) {
            throw new PokedexException("Index invalide");
        }
        return pokemons.get(id-1);
    }

    @Override
    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
         List<Pokemon> sortedPokemons = new ArrayList<>(pokemons);
        Collections.sort(sortedPokemons, order);
        return Collections.unmodifiableList(sortedPokemons);
    
    }
    
}
