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
        // Stop Tomcat so we can replace the file
        // (Note: use 'net stop tomcat10' if your service is named 'tomcat10')
        bat 'net stop tomcat10'

        // 1. Rename the built artifact
        bat 'rename target\\simple-app-0.0.1-SNAPSHOT.war my-app.war'

        // 2. Clean out the old deployment folder
        bat 'del /Q "C:\\tomcat10\\webapps\\my-app.war"'
        bat 'rmdir /S /Q "C:\\tomcat10\\webapps\\my-app"'

        // 3. Move the new renamed file to webapps
        bat 'copy target\\my-app.war "C:\\tomcat10\\webapps\\my-app.war"'

        // 4. Start Tomcat back up
        bat 'net start tomcat10'
    }
}
    } // This closes 'stages'
} // This closes 'pipeline'