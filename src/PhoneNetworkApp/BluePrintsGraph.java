//By Team members: Abrar Alkamajani - Rahaf Albrakati - Ghada Aljuhani - Rahaf Koshak
package PhoneNetworkApp;

import GraphFramework.*;

public class BluePrintsGraph extends Graph {

    public BluePrintsGraph() {
    }

    @Override
    public Edge craeteEdge(Vertex source, Vertex target, int weight) {
        return new Line(source, target, weight);
    }

    @Override
    public Vertex createVertex(String label) {
        return new Office(label);
    }

}
