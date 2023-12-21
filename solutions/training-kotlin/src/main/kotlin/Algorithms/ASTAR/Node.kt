package Algorithms.ASTAR

class Node {
    var x = 0
    var y = 0

    var G = 0.0
    var H = 0.0
    var F = 0.0

    var parent: Node? = null

    constructor(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun setNode(node: Node) {
        if (Algorithm.maze.get(x).get(y) == "0") G = 1.0 else G = 100.0
        H = euclideanDistance(node)
        F = G + H
    }

    fun euclideanDistance(node: Node): Double = Math.sqrt(Math.pow((node.x - x).toDouble(), 2.0) + Math.pow((node.y - y).toDouble(), 2.0))

    override fun toString(): String {
        return "[ $x - $y ] --> G= $G/ H= $H/ F= $F/"
    }

    override fun equals(other: Any?): Boolean {
        other as Node
        return if (this.x == other.x && this.y == other.y) return true else return false
    }
}
