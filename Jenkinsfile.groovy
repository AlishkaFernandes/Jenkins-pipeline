pipeline {
    agent any
    triggers {
        githubPush()  // Trigger on GitHub push events
    }
    stages {
        stage('Build') {
            steps {
                script {
                    // Add your build steps here
                    echo "Building the application..."
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    // Add your deployment steps here
                    echo "Deploying the application..."
                }
            }
        }
    }
}
