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
        // Change the path to YOUR specific Tomcat installation directory
        bat 'copy /Y target\\*.war "C:\\tomcat10\\webapps\\ROOT.war"'
    }
}
    } // This closes 'stages'
} // This closes 'pipeline'