package actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloAction1 : AnAction() {
    override fun actionPerformed(event: AnActionEvent) = Messages.showInfoMessage("Hello1", "Hello")
}

class HelloAction2 : AnAction() {
    override fun actionPerformed(event: AnActionEvent) = Messages.showInfoMessage("Hello2", "Hello")
}

class HelloAction3 : AnAction() {
    override fun actionPerformed(event: AnActionEvent) = Messages.showInfoMessage("Hello3", "Hello")
}