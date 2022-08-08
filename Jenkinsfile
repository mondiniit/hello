pipeline {
    agent any
    stages {
        stage('install') {
            steps {
                sh 'mvn clean build'
            }
        }
        stage('clean package') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('clean build') {
            steps {
                sh 'mvn clean deploy'
            }
        }
    }
}
