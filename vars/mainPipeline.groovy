@Library('mainPipeline')

def call(Map pipelineParams) {
    pipeline{
        agent 'any'
        stages{
            stage('say hello'){
                steps{
                    script{
                        //def pipeline = load 'test.groovy'
                        //println pipeline.t()
                        test("hello" + pipelineParams.world)
                    }
                }
            }
        }
    }
}