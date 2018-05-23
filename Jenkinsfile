pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean compile assembly:single'
      }
    }
    stage('Deliver') {
      steps {
        sh './jenkins/scripts/deliver.sh'
      }
    }
  }
}