package fr.univavignon.pokedex.api;

public class PokemonTrainerFactory implements IPokemonTrainerFactory {
    PokemonMetadataProvider metadataProvider=new PokemonMetadataProvider();
     PokemonFactory pokemonFactory=new PokemonFactory();
    @Override
    public PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory) {
       
        return new PokemonTrainer(name, team, pokedexFactory.createPokedex(metadataProvider,pokemonFactory));

    }
    
}
