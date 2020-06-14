def server = Artifactory.server 'Artifactory Version 4.15.0'

def rtMaven = Artifactory.newMavenBuild()

def buildInfo

pipeline {
   agent any

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
           git url: 'https://github.com/shivapabbu/springdocker.git'

              

            // To run Maven on a Windows agent, use
            bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }

        
      }
   }
}