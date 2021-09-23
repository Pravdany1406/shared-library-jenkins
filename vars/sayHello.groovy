#!/usr/bin/env groovy

def call(Map config = [:]) {

    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."

}
pipeline {
    agent any
    stages {
        stage('Demo') {
            steps {
                echo 'Hello world'
                sayHello(config)
            }
        }
    }
}
