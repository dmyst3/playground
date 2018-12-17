pipeline{
    agent 'any'
    stages{
        stage('My first stage'){
            steps{
                script{
                    def pipeline = load 'test.groovy'
                    println pipeline.t()
                }
            }
        }
    }
}