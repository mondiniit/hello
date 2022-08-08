pipeline {
    agent any
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
        stage('clean package') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('build') {
            steps {
                sh 'mvn clean build'
            }
        }
    }
}
