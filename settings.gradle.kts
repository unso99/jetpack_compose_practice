pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "jetpack_compose"
include(":app")
include(":button")
include(":modifier")
include(":surface")
include(":box")
include(":row")
include(":column")
include(":boxwithconstraints")
include(":image")
include(":networkimage")
include(":practicecard")
include(":checkbox")
