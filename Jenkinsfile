pipeline {
    agent any
    tools {
        // This 'Maven-3.9' must match the name you set in Jenkins Global Tool Configuration
        maven 'Maven-3.9' 
    }
    stages {
        stage('Build') {
            steps {
                // This command tells Maven to compile your project and create the .war file
                bat 'mvn clean package'
            }
        }
    }
}