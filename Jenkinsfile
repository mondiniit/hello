pipeline {
    agent {
        any
    }
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
