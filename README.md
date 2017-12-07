# spring-boot-autoconfigure-processor-issue

## Verify Steps:

1. Clone this repository: `https://github.com/jearton/spring-boot-autoconfigure-processor-issue.git`

2. Execute `cd spring-boot-autoconfigure-processor-issue && ./mvnw clean compile`

3. View the file `target/classes/META-INF/spring-autoconfigure-metadata.properties`, 
   you'll see the difference. First is dot, second is dollar. The second is correct.