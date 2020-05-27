def dockeruser = "hfcbf"
def imagename = "openjdk:7"
def container = "apache2"

node{
  echo 'Building ESII Docker Image"'

stage('Git Checkout'){
  git 'https://github.com/ESIIg18/Projecto'
  }
 
stage('Build Docker Image'){
  powershell "docker build -t ${imagename} ."
  }
  
stage('Stop Existing Container'){
  powershell "docker stop ${container}"
  }
  
stage('Remove Existing Container'){
  powershell "docker rm ${container}"
  }
  
stage('Runing Container to test built Docker Image'){
  powershell "docker run -dit --name ${container} -p 33:33 ${imagename}"
  }
  
}
