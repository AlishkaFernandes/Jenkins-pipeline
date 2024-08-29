pipeline {
    agent any

    stages {
        stage("Clone the Repo") {
            steps {
                bat 'git clone "https://github.com/AlishkaFernandes/Jenkins-pipeline.git"'
            }
        }

        stage("Build a Docker Image") {
            steps {
                bat 'docker build -t testImage ./Jenkins-pipeline'
            }
        }

        stage("Run Docker Container") {
            steps {
                bat 'docker run -d testImage'
            }
        }
    }
}
