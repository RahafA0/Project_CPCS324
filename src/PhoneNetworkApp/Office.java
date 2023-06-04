//By Team members: Abrar Alkamajani - Rahaf Albrakati - Ghada Aljuhani - Rahaf Koshak
package PhoneNetworkApp;

import GraphFramework.Edge;
import java.util.LinkedList;

//subclass of Vertex
public class Office extends GraphFramework.Vertex {

    Office(String Label) {
        this.setLabel(Label);

    }

    @Override
    public LinkedList<Edge> getAdjList() {
        return super.getAdjList(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIsVisited(boolean isVisited) {
        super.setIsVisited(isVisited); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean IsVisited() {
        return super.IsVisited(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    /*setLabel() method (alternatively set the correct value within the relevant constructor)
    to store O1, O2,… or O15 – starts with O followed by a unique number.*/
    public void setLabel(String label) {
        super.setLabel(label); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabel() {
        return super.getLabel(); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayInfo() {
        System.out.println("Office No. ");
        super.displayInfo();
        System.out.println(" - ");
        super.displayInfo(); //To change body of generated methods, choose Tools | Templates.
    }

}
