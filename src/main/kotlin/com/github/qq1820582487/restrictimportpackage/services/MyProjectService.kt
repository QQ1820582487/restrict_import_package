package com.github.qq1820582487.restrictimportpackage.services

import com.github.qq1820582487.restrictimportpackage.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
