#!/usr/bin/env groovy

def call(Map config = [:]) {

pipeline {
    agent any
    stages {
        stage('Demo') {
            steps {
                sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
            }
        }
    }
 }
}
