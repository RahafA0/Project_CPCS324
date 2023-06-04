package PhoneNetworkApp;

import GraphFramework.*;
import java.io.*;
import java.util.*;

public class PhNWDesignApp {

    static BluePrintsGraph graph;

    public static void main(String[] args) throws FileNotFoundException {

        graph = new BluePrintsGraph();

        Scanner input = new Scanner(System.in);
        // Intilize variables
        int verticesNO = 0; // number of vertices
        int edgesNO = 0; // number of edges
        KruskalAlg kruskalAlg;
        MHPrimAlg primAlg;

        System.out.print("Requirement 1 or Requirement 2 ? (1 or 2): ");
        int user = input.nextInt();

        switch (user) {
            case 1:
                // use to test req 1 
                System.out.println(" ------------------ Requirement 1 ------------------ ");

                //Declare & Create the input
                File inputF = new File("input.txt");

                //Check the input file is exists
                if (!(inputF.exists())) {
                    System.out.println("The Input files does not exist");
                    System.exit(0);
                }
                graph.readGraphFromFile(inputF);

                System.out.println("\nThe phone network (minimum spanning tree) generated by Kruskal algorithm is as follows:");
                kruskalAlg = new KruskalAlg(graph);
                kruskalAlg.applyAlgorithm();
                kruskalAlg.displayResultingMST();

                System.out.println("\nThe phone network (minimum spanning tree) generated by min-heap based Prim algorithm is as follows:");
                primAlg = new MHPrimAlg(graph);
                primAlg.applyAlgorithm(graph.getVertices().get(0));
                primAlg.displayResultingMST();
                break;

            case 2:
                // use to test req 2 
                System.out.println(" ------------------ Requirement 2 ------------------ ");

//                 if (user == 2) {
                System.out.println("Cases of Edges(m) and Vertcies(n):");
                System.out.println("(1) n= 1000, m= 10000\n(2) n= 1000, m= 15000\n(3) n= 1000, m= 25000");
                System.out.println("(4) n= 5000, m= 15000\n(5) n= 1000, m= 25000");
                System.out.println("(6) n= 10000, m= 15000\n(7) n= 10000, m= 25000");

                // Read User Input for the Selected Case  
                System.out.print("Select your Test Option: ");
                user = input.nextInt(); // Option of the Case

                switch (user) {
                    case 1: {
                        verticesNO = 1000;
                        edgesNO = 10000;
                    }
                    ;
                    break;

                    case 2: {
                        verticesNO = 1000;
                        edgesNO = 15000;
                    }
                    ;
                    break;
                    case 3: {
                        verticesNO = 1000;
                        edgesNO = 25000;
                    }
                    ;
                    break;
                    case 4: {
                        verticesNO = 5000;
                        edgesNO = 15000;
                    }
                    ;
                    break;
                    case 5: {
                        verticesNO = 5000;
                        edgesNO = 25000;
                    }
                    ;
                    break;
                    case 6: {
                        verticesNO = 10000;
                        edgesNO = 15000;
                    }
                    ;
                    break;
                    case 7: {
                        verticesNO = 10000;
                        edgesNO = 25000;
                    }
                    ;
                    break;

                    default:
                        System.out.println("Option not found.");
                        // System.out.print("Select your Test Option -> ");
                        break;
                }
                graph.makeGraph(verticesNO, edgesNO);
                long startTime,
                 endTime;

                System.out.println("\nThe time takes to find (minimum spanning tree) by Kruskal algorithm is :");
                kruskalAlg = new KruskalAlg(graph);
                startTime = System.nanoTime();
                kruskalAlg.applyAlgorithm();
                endTime = System.nanoTime();
                System.out.println((endTime - startTime) + " nanoseconds");

                System.out.println("\nThe time takes to find (minimum spanning tree) by min-heap based Prim algorithm is :");
                primAlg = new MHPrimAlg(graph);
                startTime = System.nanoTime();
                primAlg.applyAlgorithm(graph.getVertices().get(0));
                endTime = System.nanoTime();
                System.out.println((endTime - startTime) + " nanoseconds");
                break;

            default:
                System.out.println("not valid");
        }

    }

}
