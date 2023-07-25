def call(String project, String ImageTag, String hubUser){
  sh 'docker build -t ${hubUser}/${project} .'
  sh 'docker tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}'
  sh 'docker tag ${hubUser}/${project} ${hubUser}/${project}:latest'
}
