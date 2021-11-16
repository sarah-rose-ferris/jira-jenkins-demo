pipelineJob('spring-demo-deploy-production-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/sarah-rose-ferris/zephyr-scale-jira.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
pipelineJob('spring-demo-deploy-pre-production-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/sarah-rose-ferris/zephyr-scale-jira.git'
                    }
                    branch 'preprod'
                }
            }
        }
    }
}
pipelineJob('spring-demo-deploy-development-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/sarah-rose-ferris/zephyr-scale-jira.git'
                    }
                    branch 'develop'
                }
            }
        }
    }
}