// org.demo.buildUtils
package org.demo

class buildUtils implements Serializable {
   def env
   def steps
   buildUtils(env,steps) {
	this.env = env
        this.steps = steps
   }
   def timedGradleBuild_class(tasks) {
      def gradleHome = steps.tool 'gradle3.2'
      steps.sh "echo Building for ${env.BUILD_TAG}"
      steps.timestamps {
         steps.sh "${gradleHome}/bin/gradle ${tasks}"
      }
   }
}
