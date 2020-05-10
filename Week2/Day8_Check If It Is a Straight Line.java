class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<2)
            return false;
        if(coordinates.length==2)
            return true;
        int x1,x2,x3,y1,y2,y3;
        for(int i=0;i<coordinates.length-2;i++){
            x1=coordinates[i][0];
            x2=coordinates[i+1][0];
            x3=coordinates[i+2][0];
            
            y1=coordinates[i][1];
            y2=coordinates[i+1][1];
            y3=coordinates[i+2][1];
            
            if((((x2 - x1)*(y3 - y1)) -  ((x3 - x1)*(y2 - y1))) != 0)
                return false;
        }
        return true;
    }
}