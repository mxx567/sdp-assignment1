<h1>Assignment 1 -  Builder Pattern </h1>
<p>This is a builder pattern implemented for videogame object creation.</p>
<h1>Project Structure</h1>
<ul>
  <li>classes/Videogame - the final product.</li>
  <li>classes/Builder - abstract class that defines the common building steps.</li>
  <li>classes/MultiplayerShooterBuilder, classes/RacingGameBuilder - Concrete Builders with predefined configurations..</li>
  <li>classes/Director -  class that knows the construction sequence and creates common types of games.</li>
  <li>Main.java -  main method that shows the resulting products.</li>
</ul>
<h1>How to use the builder</h1>
<ol>
  <li>Create Director variable in the main method.</li>
  <li>Create variable of Videogame type and use one of directors method to create the object.</li>
</ol>
