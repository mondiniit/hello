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
    }
}
