pipeline{
    agent 'any'
    stages{
        stage('My first stage'){
            steps{
                def pipeline = load 'test.groovy'
                pipeline.t()
            }
        }
    }
}