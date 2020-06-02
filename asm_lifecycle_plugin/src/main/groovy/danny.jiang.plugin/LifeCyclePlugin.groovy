package danny.jiang.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

public class LifeCyclePlugin implements Plugin<Project> {
    void apply(Project project) {
        System.out.println("==LifeCyclePlugin gradle plugin 卧槽无情c4==")

        def android = project.extensions.getByType(AppExtension)
        println '----------- registering AutoTrackTransform  -----------'
        LifeCycleTransform transform = new LifeCycleTransform()
        android.registerTransform(transform)
        // android.registeringterTransform(transform)
    }
}