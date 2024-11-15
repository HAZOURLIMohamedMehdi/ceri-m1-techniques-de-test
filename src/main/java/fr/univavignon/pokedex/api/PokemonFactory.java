package fr.univavignon.pokedex.api;


public class PokemonFactory implements IPokemonFactory{


      
    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        PokemonMetadata metadata;
        PokemonMetadataProvider metadataProvider = new PokemonMetadataProvider();
        try {
            metadata = metadataProvider.getPokemonMetadata(index);
              double iv =(metadata.getAttack() + metadata.getDefense() + metadata.getStamina())/45;
        return new Pokemon(index, metadata.getName(), metadata.getAttack(), metadata.getDefense(), metadata.getStamina(), cp, hp, dust, candy, iv);
        } catch (PokedexException e) {
            return null;
        }
    }



}