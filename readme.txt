Creation du projet

mvn io.quarkus:quarkus-maven-plugin:0.16.0:create -DprojectGroupId=com.pedro -DprojectArtifactId=papaya -DclassName="SprintResource" -Dpath="/sprint"

Lancement

./mvnw compile quarkus:dev

Lancement des tests

./mvnw test

https://quarkus.io/guides/getting-started-guide
https://quarkus.io/guides/building-native-image-guide.html