def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "mvn clean package"
       sh "echo hello"
       sh "echo hello"
       sh "echo hello"
       sh "echo hello"
       sh "echo hello"
       sh "echo hello"
       sh "echo hello"
       sh "echo hello"
       sh "echo hello"
       sh "echo hello"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "mvn clean deploy"
     }
}
