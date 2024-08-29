pipeline{
    agent any

    stages{
        stage("clone the repo"){
            steps{
               bat 'git clone "https://github.com/AlishkaFernandes/Jenkins-pipeline.git"'
            }
        }

        stage("Build a Docker Image"){
            steps{
               bat 'docker build -t  testImage  .'
            }
        }

        stage("Run Docker Container"){
            steps{
                bat 'docker run testImage'
            }
        }
    }
}