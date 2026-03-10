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
        /*
        stage('Force Failure') {
            steps {
                sh 'exit 1'
            }
        }
        */
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
                sh 'docker build -t $DOCKER_IMAGE:v1 .'
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
                    docker push $DOCKER_IMAGE:v1
                    '''
                }
            }
        }

        stage('Deploy with Ansible'){
            steps{
            script{
                sh 'cd project'
                sh 'ansible-playbook -i inventory.ini deploy.yml'
            }
        }
    }

    
    post {
        success {
            mail to: 'learning.atharva0300@gmail.com',
                 subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "Build succeeded.\nCheck details: ${env.BUILD_URL}"
        }
        failure {
            mail to: 'learning.atharva0300@gmail.com, atharva0300@gmail.com',
                 subject: "FAILED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "Build failed.\nCheck details: ${env.BUILD_URL}"
        }
    }
}