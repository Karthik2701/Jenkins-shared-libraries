def call(String project, String ImageTag, String hubUser){
  with Credentials([usernamePassword(
          credentialsId: "dockerhub-cred"
          userNameVariable: "USER"
          passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
  }
  sh "dokcer image push ${hubUser}/${project}:${ImageTag}"
  sh "docker image push ${hubUser}/${project}:latest"
}
