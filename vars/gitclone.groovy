// vars/gitClone.groovy

def call(String repoUrl, String branch = 'master') {
    dir("${env.WORKSPACE}") {
        checkout([$class: 'GitSCM', branches: [[name: "${branch}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: "${repoUrl}"]]])
    }
}
