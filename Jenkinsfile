pipeline {
    agent any
    tools {
        maven 'Maven-3.9'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'tomcat-creds', path: '', url: 'http://localhost:8088')], 
                       war: 'target/*.war'
            }
        }
    } // This closes 'stages'
} // This closes 'pipeline'