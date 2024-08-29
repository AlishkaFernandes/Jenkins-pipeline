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
            }pipeline {
    agent any

    stages {
        stage('Clean Workspace') {
            steps {
                script {
                    echo 'Cleaning workspace...'
                    bat 'if exist Jenkins-pipeline rd /s /q Jenkins-pipeline'
                }
            }
        }

        stage('Clone Repository') {
            steps {
                script {
                    echo 'Cloning repository...'
                    bat 'git clone "https://github.com/AlishkaFernandes/Jenkins-pipeline.git"'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    echo 'Building Docker image...'
                    bat 'docker build -t testimage:latest .'
                }
            }
        }

        stage('Run Docker Container') {
            steps {
                script {
                    echo 'Running Docker container...'
                    bat 'docker run -d --name testcontainer -p 5000:5000 testimage:latest'
                }
            }
        }
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
