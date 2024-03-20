abstract class Ghosts(name: String) {
    fun hunt() {
        println("the ghost started hunting") // призрак начал охоту
    }

    fun stoppedHunt() {
        println("the ghost has finished the hunt") // призрак закончил охоту
    }

    fun show() {
        println("the ghost appeared to the players") // призрак показывает себя (гост ивент)
    }

    fun openTheDoor() {
        println("ghost opened the door")
    }

    abstract fun printName()

    fun describeYourself() {
        printName()
    }

    fun () {

    }
}