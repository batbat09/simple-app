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
    }
}