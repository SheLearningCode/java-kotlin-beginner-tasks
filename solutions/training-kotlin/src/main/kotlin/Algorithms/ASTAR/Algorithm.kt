package Algorithms.ASTAR

import java.util.*

class Algorithm {

    var start: Node

    lateinit var goal: Node

    var openNeighboors = Vector<Node>()

    var closedNeighboors = Vector<Node>()

    var route = Vector<Node>()

    companion object {
        lateinit var maze: List<List<String>>
    }

    constructor(maze: List<List<String>>, x: Int, y: Int) {
        Algorithm.maze = maze
        start = Node(x, y)
    }

    fun findPath(x: Int, y: Int) {
        this.goal = Node(x, y)

        this.start.setNode(this.goal)

        openNeighboors.add(this.start)

        findCheaper()
        var endNode = Node(0, 0)
        var energyCost = 0.0

        for (node in closedNeighboors) {
            if (node.equals(this.goal)) {
                endNode = node
            }
        }

        while (true) {
            route.add(endNode)
            energyCost += endNode.G
            try {
                endNode = endNode.parent!!
            } catch (e: NullPointerException) {
                break
            }
        }

        for (i in 0..maze.size - 1) {
            for (j in 0..maze.get(i).size - 1) {
                if (containsRoute(Node(i, j))) {
                    print("* ")
                } else {
                    print(maze.get(i).get(j) + " ")
                }
            }
            println()
        }
        println("The total amount of energy used is --> $energyCost")
    }

    fun findCheaper() {
        var cheaper = findOptimal()

        openNeighboors.remove(cheaper)
        closedNeighboors.add(cheaper)

        if (!cheaper.equals(this.goal)) {
            var neighboors = getNeighboors(cheaper)

            for (node in neighboors) {
                if (!containsOpen(node) && !containsClosed(node)) {
                    node.setNode(this.goal)
                    node.parent = cheaper
                    openNeighboors.add(node)
                }
            }
            findCheaper()
        }
    }

    fun findOptimal(): Node {
        var nodeFOptimal = Double.POSITIVE_INFINITY
        var optimalNode: Node? = null

        for (node in openNeighboors) {
            if (node.F < nodeFOptimal) {
                nodeFOptimal = node.F
                optimalNode = node
            }
        }

        return optimalNode!!
    }

    fun containsOpen(n: Node): Boolean {
        for (node in openNeighboors) {
            if (node.x == n.x && node.y == n.y) {
                return true
            }
        }
        return false
    }

    fun containsClosed(n: Node): Boolean {
        for (node in closedNeighboors) {
            if (node.x == n.x && node.y == n.y) {
                return true
            }
        }
        return false
    }

    fun containsRoute(n: Node): Boolean {
        for (node in route) {
            if (node.x == n.x && node.y == n.y) {
                return true
            }
        }
        return false
    }

    fun getNeighboors(node: Node): Vector<Node> {
        var neighbours = Vector<Node>()

        if (node.x + 1 < maze.size) {
            neighbours.add(Node(node.x + 1, node.y))
            if (node.y + 1 < maze[node.x].size) {
                neighbours.add(
                    Node(
                        node.x + 1,
                        node.y + 1,
                    ),
                )
            } else {
                neighbours.add(
                    Node(node.x + 1, node.y - 1),
                )
            }
        } else if (node.x - 1 >= 0) {
            neighbours.add(Node(node.x - 1, node.y))
            if (node.y - 1 >= 0) {
                neighbours.add(
                    Node(
                        node.x - 1,
                        node.y - 1,
                    ),
                )
            } else if (node.y + 1 < maze[node.x].size) {
                neighbours.add(
                    Node(node.x - 1, node.y + 1),
                )
            }
        }

        if (node.y + 1 < maze[node.x].size) {
            neighbours.add(Node(node.x, node.y + 1))
        }

        if (node.y - 1 >= 0) {
            neighbours.add(Node(node.x, node.y - 1))
        }
        /*if (node.x + 1 < maze.size) {
            neighboors.add(Node(node.x + 1, node.y))
        }

        if (node.x - 1 >= 0) {
            neighboors.add(Node(node.x - 1, node.y))
        }

        if (node.y + 1 < maze.get(node.x).size) {
            neighboors.add(Node(node.x, node.y + 1))
        }

        if (node.y - 1 >= 0) {
            neighboors.add(Node(node.x, node.y - 1))
        }

        if (node.x - 1 >= 0 && node.y - 1 >= 0) {
            neighboors.add(Node(node.x - 1, node.y - 1))
        }

        if (node.x + 1 < maze.size && node.y + 1 < maze.get(
                node.x,
            ).size
        ) {
            neighboors.add(Node(node.x + 1, node.y + 1))
        }

        if (node.x - 1 >= 0 && node.y + 1 < maze.get(node.x).size) {
            neighboors.add(Node(node.x - 1, node.y + 1))
        }

        if (node.x + 1 < maze.size && node.y - 1 >= 0) {
            neighboors.add(Node(node.x + 1, node.y - 1))
        }*/

        return neighbours
    }
}
