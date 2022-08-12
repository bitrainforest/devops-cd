package org.devops

//下载代码
def GetCode(branchName, srcUrl){
  checkout([$class: 'GitSCM', 
            branches: [[name: branchName]], 
            extensions: [], 
            userRemoteConfigs: [[credentialsId: 'gtihub', url: srcUrl]]]) 
}
