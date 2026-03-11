pipeline {
    agent any
    tools {
        maven 'Maven-3.9' 
    }
    stages {
        stage('Build') {
            steps {
                // Now that your POM is fixed, remove -DskipTests
                bat 'mvn clean package'
            }
        }
        stage('Deploy') {
            steps {
                // This deploys the war file from the target folder to Tomcat
                deploy adapters: [tomcat9(credentialsId: 'tomcat-creds', path: '', url: 'http://localhost:8088')], 
                       war: 'target/*.war'
            }
    }
}