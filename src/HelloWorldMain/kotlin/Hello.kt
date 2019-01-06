    package sample.helloworld

    import sample.tetris.Config
    import sample.tetris.Game
    import sample.tetris.SDL_Visualizer

    fun main(args: Array<String>) {
        var startLevel = Config.startLevel
        var width = Config.width
        var height = Config.height
        when (args.size) {
            1 -> startLevel = args[0].toInt()
            2 -> {
                width = args[0].toInt()
                height = args[1].toInt()
            }
            3 -> {
                width = args[0].toInt()
                height = args[1].toInt()
                startLevel = args[2].toInt()
            }
        }
        val visualizer = SDL_Visualizer(width, height)
        val game = Game(width, height, visualizer, visualizer)
        game.startNewGame(startLevel)

        return
    }