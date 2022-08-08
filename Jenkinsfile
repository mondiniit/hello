pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    echo 'Hello World'
                }
            }
        }
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
            script {
                    echo 'clean build'
                }
        }
    }
}
