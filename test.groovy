def call() {
    println "hello"
    sh "echo hello from shell"
    sh "docker images"
}
return this;