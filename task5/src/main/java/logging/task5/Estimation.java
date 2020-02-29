package logging.task5;

public class Estimation {
	public double estimateHouse(double area,int standard,boolean fullyautomated){
        int array[] = new int[4];
        array[0] = 1200;
        array[1] = 1500;
        array[2] = 1800;
        array[3] = 2500;
        int costpersquarefeet = 0;
        double constructionCost = 0;
        if(fullyautomated) costpersquarefeet = array[3];
        else costpersquarefeet = array[standard-1];
        constructionCost = area*costpersquarefeet;
        return constructionCost;
    }
}
