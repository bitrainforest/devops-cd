package org.devops

def GetCode(branchName, srcUrl){
  checkout([$class: 'GitSCM', 
            branches: [[name: branchName]], 
            extensions: [], 
            userRemoteConfigs: [[credentialsId: 'gtihub', 
                                 url: srcUrl]]]) 
          
}
