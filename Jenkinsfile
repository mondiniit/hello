pipeline {
    agent { docker { image 'maven:3.8.4-openjdk-11-slim' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('install') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
<<<<<<< HEAD:jenkinsfile
    }
}
=======

        stage("build & SonarQuube") {
          node {
              withSonarQubeEnv('My SonarQube Serer') {
                 sh 'mvn clean package sonar:sonar'
              }
          }
        }

        stage("Quality Gate"){
          timeout(time: 1, unit: 'HOURS') {
              def qg = waitForQualityGate()
              if (qg.status != 'OK') {
                  error "Pipeline aborted due to quality gate failure: ${qg.status}"
              }
          }
      }
}
}
>>>>>>> 88869057d33abd418e3d4b266dd380eb1270c555:Jenkinsfile
