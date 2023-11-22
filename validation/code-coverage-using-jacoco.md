# Generating Code Coverage for a Specific Test file
## Jacoco Setup
Add following plugins in `pom.xml` of the service for which test file needs
to be executed.
```
<plugins>
...
    <plugin>
        <groupId>org.jacoco</groupId>
        <artifactId>jacoco-maven-plugin</artifactId>
        <version>0.8.2</version>
        <executions>
          <execution>
            <goals>
              <goal>prepare-agent</goal>
            </goals>
          </execution>
          <execution>
            <id>generate-code-coverage-report</id>
            <phase>test</phase>
            <goals>
              <goal>report</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.0.0-M5</version>
        <configuration>
          <forkedProcessExitTimeoutInSeconds>60</forkedProcessExitTimeoutInSeconds>
          <forkCount>1</forkCount>
          <argLine>@{argLine} -Xmx1024m -XX:MaxPermSize=256m</argLine>
        </configuration>
      </plugin>
  </plugins>
```

## Executing Specific Test file
To run a single test file - `SampleTest.java`, execute following command at
root location of the project:
```
mvn test -Dtest="SampleTest"
```
The Jacoco report will be generated at: `target/site/jacoco/index.html`