pipeline {
 agent none
 tools {
    	maven 'Maven'
 }
 stages {
  stage("Checkout"){
   agent any
   steps{
     snDevOpsStep()
     //snDevOpsChange()
   }
  }
  stage("Tests") {
   agent any
   steps {
    snDevOpsStep()
    checkout scm
    sh 'mvn clean test'
    junit '**/target/surefire-reports/*.xml'
    //step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
   }
  }
  stage('Perf Tests'){
   agent any
   steps{
     snDevOpsStep()
     bzt "load_test1.yml"
     //junit '**/xunit.xml'
   }
  }
 }
}
