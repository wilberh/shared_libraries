// vars/mailStatus.groovy
def call(body) {
    // evaluate the body block, and collect mappings 
    def mappings = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = mappings
    body()

    // email, based on mappings
    node {
        mail bcc: '', body: "The current build\'s status is ${mappings.status}.", cc: '', from: '', replyTo: '', subject: 'Build Status', to: "${mappings.user}"
    }
}



