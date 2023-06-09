
# Usability
The game most be able to run on Android devices
with touch screen. The visualizations and the
text must be clearly able to be read from at least
1 meter. We also want to make sure that the game design is clean and easily readable
so that our users can be able to enjoy the app. This may include using certain color patterns to help those
with color blindness. We also want to make sure that the question is displayed simultaneously with the answer
choices whenever they're posted to ensure that the user will know what the question is and not have to memorize it. 
# Reliability
When a player selects their game mode, whether single-player or multiplayer,
if there is a problem with loading a second player onto the app, then instead
of the app failing, we can provide the option to switch back to single-player,
as it does not require a secondary player.  We must also make sure that whenever a player is provided 
questions that they receive unique questions and one's that fall in their chosen category. Whenever a player
answers such a question, we also want to ensure that they are properly registered. We do not want to act 
as if the player selected one choice when they actually clicked on a different one. The user will be able to continuously be fed new questions until they've reached the 5 question limit or got a
question incorrect. We want to make sure that our app will be able to allow a player to finish one came and still
be able to run the next, without the app crashing. This support is necessary for the app to run smoothly.We also plan to eventually save 
game progress, so that if a game were to crash, the user wouldn't have to worry about lost progress. 
# Performance
The game will be able to generate questions at a decent rate, despite
pulling from a large database. A player should not have to wait more
than 10 seconds for the question to be printed out.

The game should also be able to provide answer choices and register
the user's answers at a quick rate as well. We do not need long time 
lapses as efficient and smooth performance is needed. 
# Supportability
We could potentially support different variations, in which our questions could 
be translated into different languages, allowing us to expand our market. As for now, 
we are primarily focused on making this work on Android apps only, so we do not expect to 
work on IOS or other operating systems. 
# Implementation 
Our game must run on Android devices. Also, our game must be written using Java. We also want our game to have multiple
game shows to choose from, so we want to ensure that it has the capability of doing so. We want to do this so that our game 
does not quickly become repetitive and boring. We also hope to maintenance the game with new updated shows. 
# Interface
We have to pull questions from an outside database/interface. At this point, we will likely create or find a large
.csv file or .txt file of trivia questions which we will parse through to find questions and create our database. 
That way we can easily  put them into our game, making much easier to design. It is important that this interface provides a 
structure where we can easily pull questions of various categories and give valid solutions  to them. We found a free Trivia
API that will allow us get trivia questions in such format. The link is https://the-trivia-api.com/.
# Legal
We need to ensure that the questions that we use are legal, in the sense they
could be privatized. Also, when designing our game, we have to avoid legal restrictions
on certain structures, such as popular game shows. 