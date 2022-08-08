pipeline {
    agent any
    stages {
        stage('package') {
            steps {
                sh 'mvn package'
            }
        }
        stage('clean build') {
            steps {
                sh 'mvn clean dependency:copy-dependencies package'
            }
        }
    }
}
