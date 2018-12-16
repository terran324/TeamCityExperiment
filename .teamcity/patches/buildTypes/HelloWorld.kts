package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with id = 'HelloWorld'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, BuildType({
    id("HelloWorld")
    name = "HelloWorld"
    description = "First Try"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script {
            name = "TestTemplateStep"
            scriptContent = """echo "This is a test template build step""""
        }
    }
}))

