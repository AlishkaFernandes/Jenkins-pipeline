pipeline {
    agent any
    triggers {
        githubPush()  // Ensure this line is present for GitHub webhook triggers
    }
    stages {
        stage('Build') {
            steps {
                script {
                    echo 'Building...'
                    bat 'echo Build step'
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    echo 'Deploying...'
                    bat 'echo Deploy step'
                }
            }
        }
    }
}
