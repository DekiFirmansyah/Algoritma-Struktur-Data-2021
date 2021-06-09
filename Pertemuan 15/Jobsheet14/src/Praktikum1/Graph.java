/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;


/**
 *
 * @author PERSONAL
 */
public class Graph {
    int vertex;
    LinkedList list[];
    
    public Graph(int vertex){
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for(int i = 0; i < vertex; i++){
            list[i] = new LinkedList();
        }
    }
    
    public void addEdge(int source, int destination, int pilih){
        if(graphType(pilih) == true){
            list[source].addFirst(destination);
        }else {
            list[source].addFirst(destination);
            list[destination].addFirst(source);
        }
    }
    
    public boolean graphType(int pilih){
        boolean hasil = false;
        if(pilih == 1){
            hasil = true;
        }else {
            hasil = false;
        }
        return hasil;
    }
    
    public void degree(int source){
        //degree undericted graph
        System.out.println("degree vertex " + source + " : " + list[source].size());
        
        //degree directed graph
        //indegree
        int k, totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex; i++){
            for(int j = 0; j < list[i].size(); j++){
                if(list[i].get(j) == source)
                    ++totalIn;
            }
            //OutDegree
            for(k = 0; k < list[source].size(); k++){
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("Degree vertex " + source + " : " + (totalIn + totalOut));
    }
    
    public void removeEdge(int source, int destination){
        for (int i = 0; i < list[source].size(); i++) {
            if (destination == list[source].get(i)){
                list[source].remove(i);
            }
        }
    }
    
    public void removeAllEdges(){
        for(int i = 0; i < vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph(){
        for(int i = 0; i < vertex; i++){
            if(list[i].size() > 0){
                System.out.print("Vertex " + i + " terhubung dengan : ");
                for(int j = 0; j < list[i].size(); j++){
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
    
}
