package PhoneNetworkApp;

import GraphFramework.*;

//subclass of Edge
public class Line extends Edge {

    private Integer lLength;

    Line(Vertex sourceVertex, Vertex destinationVertex, int weight) {
        this.setSource(sourceVertex);
        this.setTarget(destinationVertex);
        this.setWeight(weight);
        this.lLength = weight * 5;
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getWeight() {
        return super.getWeight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTarget(Vertex target) {
        super.setTarget(target); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vertex getTarget() {
        return super.getTarget(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSource(Vertex source) {
        super.setSource(source); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vertex getSource() {
        return super.getSource(); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getlLength() {
        return lLength;
    }

    public void setlLength(Integer lLength) {
        this.lLength = lLength;
    }

    @Override
    public void displayInfo() {
        System.out.println("line length: " + lLength);
        super.displayInfo(); //To change body of generated methods, choose Tools | Templates.
    }

}
