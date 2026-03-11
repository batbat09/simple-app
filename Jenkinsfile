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
        // 1. Delete the old deployment if it exists (no service stop needed!)
        bat 'if exist "C:\\tomcat10\\webapps\\my-app.war" del /Q "C:\\tomcat10\\webapps\\my-app.war"'
        bat 'if exist "C:\\tomcat10\\webapps\\my-app" rmdir /S /Q "C:\\tomcat10\\webapps\\my-app"'

        // 2. Copy the new file - Tomcat will automatically unpack it
        bat 'copy target\\simple-app-0.0.1-SNAPSHOT.war "C:\\tomcat10\\webapps\\my-app.war"'
    }
}
    } // This closes 'stages'
} // This closes 'pipeline'