# Prisoner's Dilemma #

## What's in here? ##

* 2 Player multi round game each player can choose to _Co-operate_ or _not co-operate_
based on the both players choices points will be evaluated.
* There is an option to set up point system and no of rounds.
* By default, it's a 10 point and 3 round play.
* After each round results are displayed.


## Design ##

### Components ###
* Series orchestrator
* Individual game/decision/round
* Players

### Orchestrator ###

* Sets the play 
  * No of players
  * Target
  * No of rounds
  * Win condition
* Starts each round/game
* Ends the play

### Game ###

* Sets up a game
  * No of players/Identifiers
  * Point system for all scenarios
  * End conditions
* Decides turns
* Evaluates moves
* Closes the game

### Players ###

* Sets up a players
  * Name
  * Default decision's
* Makes a move
* Keeps track of score
* Can keep track of past list of moves
* Can keep track of performance across series

### Oct-08/2024 ###

* Split code into MVC (Game engine, Logic, Models + Data).
* Implement strategy support in players 
( Ability to use and switch between strategies for a player).
* Orchestrate a tournament between a given set of players
* Compare performance of various strategies.
