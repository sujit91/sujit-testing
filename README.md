# sujit-testing


Here we are using for parsing JSON, reading files, and running JUnit tests.

The class Testing is defined, with a JSONArray called players that will store the player information from the JSON file.

The setUp() method is used to parse the JSON file "team.json" and store the player information in the players array. This method is called before each test, to ensure that the test is run on the most up-to-date player information.

The testForeignPlayers() method is defined as a JUnit test. This method starts by initializing a variable foreignPlayerCount to 0.

The method then iterates through each player in the players array, and for each player, it checks if the player's country is not "India". If it's not, it increments the foreignPlayerCount variable by 1.

After iterating through all the players, the method asserts that the foreignPlayerCount variable is equal to 4. This checks whether the team has only 4 foreign players or not.

The testWicketKeeper() method is defined as a JUnit test. This method starts by initializing a variable wicketKeeper to false.

The method then iterates through each player in the players array, and for each player, it checks if the player's role is "Wicket-keeper". If it is, it changes the value of wicketKeeper to true.

After iterating through all the players, the method asserts that the wicketKeeper variable is true. This checks whether the team has at least one wicket keeper or not.




