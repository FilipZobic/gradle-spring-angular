## TODO (Developer)

Run: `./gradlew precommit` before creating PR

### 1. Import & select google code style in your IDE

**IntelliJ** <br/>
Preferences -> Editor -> Code Style <br>
Select `google-style.xml`

### 2. Install SonarLint

Plugins -> Install SonarLint -> Restart IDE

### 3. Use Auto Format

Install google plugin `Plugins -> Install google-java-format -> Restart IDE`

Enable the plugin `Preferences -> google-java-format-settings -> Enable google-java-format`

Enable Save-On
action `Prefrences -> Tools -> Save On Actions -> Enable: Reformat Code, Optimize Imports, Rearange code`

**NOTE! You could work without the plugin & save actions and at the end just run command 2.**

1. To check formatting run: `./gradlew spotlessCheck`

2. To fix formatting issues project scope run: `./gradlew spotlessApply`

## Tools

### SonarCloud (SonarQube SAAS)

Translates `systemProp.sonar.host.url ` to ` SONAR_HOST_URL` system property

* Organization name is used

* Project key is in (Info)

* Login should be a generated token in account security

Since we are running SonarCube with gradle we need to disable automatic analysis -
`Administration -> Anlyisis Methods -> SonarCloud Automatic Analysis -> OFF` we would use automatic
if we used Jenkins, GitHub actions....)

### Copy template gradle.properties and fill out properties

Location `~/.gradle/gradle.properties`