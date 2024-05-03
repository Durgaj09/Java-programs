import java.util.Scanner;
public class spiral_matrix{
    public static void main(String args[]){
      
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter row");
        int r=s.nextInt();
        System.out.println("enter col");
        int c=s.nextInt();
          int left=0,right=c-1,bottom=r-1,top=0;
        System.out.println("enter the elements");
        int m[][]=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                m[i][j]=s.nextInt();
            }
        }
        while(top<=bottom && left<=right){
        
         System.out.println();
       
        for(i=left;i<=right;i++){
            System.out.print(m[top][i]);
            
        }
        top++;
        for(i=top;i<=bottom;i++){
            System.out.print(m[i][right]);
        }
        right--;
        if(top<=bottom){
            for(i=right;i>=left;i--){
                System.out.print(m[bottom][i]);
            }
            bottom--;
        }
            if(left<=right){
                for(i=bottom;i>=top;i--){
                    System.out.print(m[i][left]);
                }left++;
            }
        
        
        
        
        
        }   
    }
}