package fr.univavignon.pokedex.api;

import java.util.List;

public class PokemonMetadataProvider implements IPokemonMetadataProvider {
          private List<PokemonMetadata> pokemonMetadata;


public PokemonMetadataProvider(){
    pokemonMetadata.add(new PokemonMetadata(0,"Bulbizarre",126,126,90));
    pokemonMetadata.add( new Pokemon(133,"Aquali",186, 168,260, 2729, 202,5000, 4,100 ));
}

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
     for(PokemonMetadata pokemon: pokemonMetadata){
         if(pokemon.getIndex() == index){
             return pokemon;
         }
     }
     throw new PokedexException("PokemonMetadataProvider.getPokemonMetadata: index: "+index+" not found");
    
    }
    
}
