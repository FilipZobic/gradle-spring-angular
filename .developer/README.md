
## TODO (Developer)
### 1. Import & select google code style in your IDE
**IntelliJ** <br/>
Preferences -> Editor -> Code Style <br>
Select `google-style.xml`
### 2. Install SonarLint
Plugins -> Install SonarLint -> Restart IDE

## Tools

### SonarCloud (SonarQube SAAS)

Translates `systemProp.sonar.host.url ` to ` SONAR_HOST_URL` system property

* Organization name is used

* Project key is in (Info)

* Login should be a generated token in account security

Since we are running SonarCube with gradle we need to disable automatic analysis -
`Administration -> Anlyisis Methods -> SonarCloud Automatic Analysis -> OFF` we would use automatic if we used Jenkins, GitHub actions....)

### Copy template gradle.properties and fill out properties
Location
`~/.gradle/gradle.properties`