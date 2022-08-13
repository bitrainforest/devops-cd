package org.devops

def GetCommitID(){
  ID = sh returnStdout: true, script:"git rev-parse HEAD"
  return ID -"\n"
}
