pipelineJob('pipeline') {
  definition {
    cps {
      script(
'''pipeline {
  agent {
    label 'agent'
  }
  stages {
    stage('stage') {
      steps {
        sh 'echo Hello from pipeline!\'
      }
    }
  }
}''')
      sandbox()
    }
  }
}