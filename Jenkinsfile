pipeline {
    agent any
    stages {
        stage('one') {
            steps {
                script {
                    echo 'Hello World'
                }
            }
        }
         stage('two') {
            steps {
                sh 'mvn install'
            }
        }
        stage('three') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('four') {
            steps {
                script {
                    echo 'clean build'
                }
            }
        }
    }
}
