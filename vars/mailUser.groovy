def call(user, result) {
  // Add mail message from snippet generator here
  mail bcc: '', body: "The current build\'s result is ${result}.", cc: '', from: '', replyTo: '', subject: 'Build Status', to: "${user}"
}
