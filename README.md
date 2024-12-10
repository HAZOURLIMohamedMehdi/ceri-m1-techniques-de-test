# UCE Génie Logiciel Avancé : Techniques de tests

**Nom et Prénom :** HAZOURLI Mohamed Mehdi

**Groupe :** ALT

## Badges
![CircleCI](https://circleci.com/gh/HAZOURLIMohamedMehdi/ceri-m1-techniques-de-test/tree/master.svg?style=shield)

![Codecov](https://img.shields.io/codecov/c/github/HAZOURLIMohamedMehdi/ceri-m1-techniques-de-test.svg?style=shield) 

![Checkstyle](https://img.shields.io/badge/Checkstyle-OK-green)

# Pokedex Project

## Composants principaux

### Pokedex

La classe **`Pokedex`** implémente l'interface **`IPokedex`** et permet de gérer une collection de Pokémon. Elle offre des fonctionnalités pour :
- Ajouter des Pokémon (`addPokemon`).
- Récupérer un Pokémon par son ID (`getPokemon`).
- Obtenir la taille du Pokedex (`size`).
- Créer des Pokémon avec un **`IPokemonFactory`** (`createPokemon`).
- Trier les Pokémon selon un critère spécifique (`getPokemons`).

### PokemonFactory

La classe **`PokemonFactory`** implémente **`IPokemonFactory`** et est responsable de la création des objets **`Pokemon`**. Elle génère un Pokémon à partir de son **index** et d'autres propriétés (CP, HP, dust, candy), en utilisant les métadonnées du Pokémon obtenues via **`PokemonMetadataProvider`**.

### PokemonMetadataProvider

La classe **`PokemonMetadataProvider`** implémente **`IPokemonMetadataProvider`** et fournit des métadonnées sur les Pokémon (nom, attaque, défense, Stamina). Elle permet de récupérer les métadonnées d'un Pokémon à partir de son **index**. Si un Pokémon n'est pas trouvé, une **`PokedexException`** est lancée.

### PokemonTrainerFactory

La classe **`PokemonTrainerFactory`** implémente **`IPokemonTrainerFactory`** et crée des Trainers Pokémon. Elle génère un **`PokemonTrainer`** avec un nom, une équipe (par exemple, **`Team.INSTINCT`**) et un **Pokedex**.

## Installation

1. Clonez ce repository :
   ```bash
   git clone https://github.com/HAZOURLIMohamedMehdi/ceri-m1-techniques-de-test.git

