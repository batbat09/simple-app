pipeline {
    agent any
    tools {
        maven 'Maven-3.9' 
    }
    stages {
        stage('Debug') {
            steps {
                // This will print the path Jenkins currently sees
                bat 'echo %PATH%'
                // This will check if Jenkins can see your specific Maven
                bat 'dir C:\\Maven-3.9\\bin'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn -version'
            }
        }
    }
}