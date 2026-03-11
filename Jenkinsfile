pipeline {
    agent any
    tools {
        maven 'Maven-3.9' // This name must match your Global Tool Config exactly
    }
    stages {
        stage('Build') {
            steps {
                
                bat 'mvn clean package -DskipTests'
            }
        }
  
    }
}