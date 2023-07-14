def call() {
  deploy adapters: [tomcat9(credentialsId: 'tomcat-cred', path: '', url: 'http://54.242.131.218:8080/')], contextPath: 'samplepipeline', war: '**/*.war'
}
