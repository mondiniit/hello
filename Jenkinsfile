pipeline {
    agent any
    stages {
         stage('install') {
            steps {
                sh 'mvn install'
            }
        }
        stage('package') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('clean build') {
            steps {
                sh 'mvn clean dependency:copy-dependencies package'
            }
        }
    }
}
