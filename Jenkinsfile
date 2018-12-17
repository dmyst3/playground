pipeline{
    agent any
    stages{
        stage('Test') {
            steps {
                script{
                    def code=load 'test.groovy'
                    code.call()
                }
            }
        }
    }
}