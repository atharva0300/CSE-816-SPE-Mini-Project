pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK'
    }

    environment {
        DOCKER_IMAGE = "atharva0300/scientific-calculator"
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package Application') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE:latest .'
            }
        }

        stage('Push Docker Image to DockerHub') {
            steps {

                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-credentials',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {

                    sh '''
                    echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
                    docker push $DOCKER_IMAGE:latest
                    '''

                }

            }
        }

    }

    post {

        success {
            mail to: 'learning.atharva0300@email.com',
                 subject: 'Jenkins Build SUCCESS',
                 body: 'Scientific Calculator pipeline executed successfully.'
        }

        failure {
            mail to: 'atharva0300@email.com, learning.atharva0300@gmail.com',
                 subject: 'Jenkins Build FAILED',
                 body: 'Pipeline execution failed. Check Jenkins logs.'
        }

    }

}