package Algorithms.ASTAR

fun main() {
    var maze = listOf(
        listOf("0", "0", "0", "0", "0", "0", "0", "0"),
        listOf("0", "0", "0", "0", "0", "0", "0", "0"),
        listOf("0", "0", "0", "1", "1", "1", "0", "0"),
        listOf("0", "0", "0", "0", "0", "1", "0", "0"),
        listOf("0", "0", "1", "0", "0", "1", "0", "0"),
        listOf("0", "0", "1", "0", "0", "1", "0", "0"),
        listOf("0", "0", "1", "1", "1", "1", "0", "0"),
        listOf("0", "0", "0", "0", "0", "0", "0", "0"),
    )

    var astar = Algorithm(maze, 0, 0)

    astar.findPath(7, 7)
}