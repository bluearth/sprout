sprout
======

Sprout collects usefull and interesting Maven archetype templates.

Archetype templates are maven projects that can be used to derive archetype by using `maven-archetype-plugin`'s `create-from-project` goal. So it's a maven project, to generate maven archetype, that can later be use to generate more maven projects.

TOC
===
* javafx8-archetype
  JavaFX 8 Application, ControlsFX, SLF4J (logback backed, all others routed)
* ... (expect more to come)

Install
=======
* Clone this repo
* Change directory to archetype template you choose 

   ```
   # cd sprout/<archetype_name>
   ```

* Generate archetype

   ```
   # mvn archetype:create-from-project
   ```

* Build, package and install the generated archetype

   ```
   # cd target/generated-sources/archetype
   # mvn package
   # mvn install
   ```

* Archetype is installed in your local maven repository 

Use
===
Once archetypes are installed in your local repository, you can use it to generate maven project like any other archetype.

Here are some examples :
* The following will run in interactive mode, and will give you list of available artifacts (online and local)

   ```
   # mvn archetype:generate
   ```
* The Maven to Eclipse (M2E) plugins also able to give you list of available artifacts when you create a maven project. NOTE M2E by default uses built in maven and might not be using the same local repository as your 'command line' maven. Check your environment.

