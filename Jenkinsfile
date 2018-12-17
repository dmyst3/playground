pipeline{
    agent any
    stages{
        stage('Test') {
            steps {
                def code=load 'test.groovy'
                code.call()
            }
        }
    }
}