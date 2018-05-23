pipeline {
  agent {
    node {
      label 'master'
    }

  }
  stages {
    stage('build') {
      steps {
        sh 'mvn package'
      }
    }
    stage('Deliver') {
      steps {
        archiveArtifacts 'target/thecastle.jar'
      }
    }
  }
}