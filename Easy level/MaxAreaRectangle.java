class maxArea{
    
    static int calculate_Area(Rectangle arr[]){
        
        // Your code here
        int area=0;
        for(int i=0;i<arr.length;i++)
        {
            area=Math.max(area,arr[i].length*arr[i].breadth);
        }
        return area;
        
    }
    
}
