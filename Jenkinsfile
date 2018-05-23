pipeline {
  agent none
  stages {
    stage('build') {
      steps {
        sh 'mvn package'
      }
    }
    stage('Deliver') {
      steps {
        sh './jenkins/scripts/deliver.sh'
      }
    }
  }
}