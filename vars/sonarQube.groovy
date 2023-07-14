def call() {
    withSonarQubeEnv('SonarQube') {
    sh "${scannerHome}/bin/sonar-scanner"         
}
}
