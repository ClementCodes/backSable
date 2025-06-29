pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                echo 'Code source local trouvé dans /home/clement/Documents/backSable'
                dir('/home/clement/Documents/backSable') {
                    sh 'ls -la'
                }
            }
        }
        stage('Build') {
            steps {
                dir('/home/clement/Documents/backSable') {
                    sh './mvnw clean package -DskipTests'
                }
            }
        }
        stage('Test') {
            steps {
                dir('/home/clement/Documents/backSable') {
                    sh './mvnw test'
                }
            }
        }
    }
    post {
        always {
            echo 'Archivage des résultats de tests.'
            junit '**/target/surefire-reports/TEST-*.xml'
        }
    }
}