pipeline
{
    agent any
    stages
    {
      stage('Continuous Download')
      {
          steps
          {
              git 'https://github.com/Srujanabayye/maven_new.git'
          }
      }
      stage('Continuous Build')
      {
          steps
          {
              sh 'mvn package'
          }
      }
      stage('Continuous Deployment')
      {
          steps
          {
              deploy adapters: [tomcat9(credentialsId: 'c884fe50-3001-425e-ad2b-22c8007a722f', path: '', url: 'http://172.31.12.179:8080')], contextPath: 'mytest', war: '**/*.war'
          }
      }
      stage('Continuous Testing')
      {
          steps
          {
              git 'https://github.com/intelliqittrainings/FunctionalTesting.git'
              sh 'java  -jar /var/lib/jenkins/workspace/DeclarativePipeline1/testing.jar'
          }
      }
      stage('Continuous Delivery')
      {
          steps
          {
              deploy adapters: [tomcat9(credentialsId: 'c884fe50-3001-425e-ad2b-22c8007a722f', path: '', url: 'http://172.31.11.241:8080')], contextPath: 'myprod', war: '**/*.war'
          }
      }
    }
}
