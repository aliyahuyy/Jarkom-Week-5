/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarkom.week.pkg5;

/**
 *
 * @author alyaghaitsa
 */
public class JarkomWeek5 {
    
    public int minDistance(int dist[], boolean b[]){
        int min=Integer.MAX_VALUE, index =-1;
        for (int x = 0; x<5; x++){
            if (b[x] == false && dist[x] <= min){
               min = dist[x];
               index = x;
            }
        }
        return index;
    }
    

    public void djikstra(int graph[][], int src){
           int dist[] = new int[5];
           
           boolean b[] = new boolean[5];
           for (int i = 0; i<5; i++){
               dist[i] = Integer.MAX_VALUE;
               b[i] = false;
           }
          
           dist[src] = 0;
           for (int count = 0; count<5; count++){
               int u = minDistance(dist,b);
               b[u] = true;
               for(int x = 0; x<5; x++){
                   if(!b[x] && graph[u][x]!= 0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][x]<dist[x]){
                   dist[x] = dist[u]+graph[u][x];
               }
            
            }
           
           }
           printGraph(dist, 0);
    }
    
    public void printGraph(int dist[], int x){
        System.out.println("jarak dari node 0 ke destination : ");
        for (int i = 0; i < 5; i++){
            System.out.println("node awal 0, jarak terpendek menuju Node " + i + " yaitu: " +dist[i]);
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int graph[][] = new int [][] {{0,4,0,0,7}, {4,0,1,2,0}, {0,1,0,6,0}, {0,2,6,0,0}, {7,0,0,0,0}};
    
        JarkomWeek5 p = new JarkomWeek5();
        p.djikstra(graph,0);
        
    }
}
