package org.devops

def GetCommitID(){
  ID = sh returnStdout: true, script:"git rev-parse HEAD"
  IDS = ID[:7]
  return IDS -"\n"
}
