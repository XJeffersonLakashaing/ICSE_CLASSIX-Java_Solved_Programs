//<1> write a programs to enter two numbers. If they are unequal then display square of the smaller number and the cube of the greater number. Finally, display
//> the differnce between their results, otherwise display the message ""Both the numbers are equal";
import java.util.Scanner; 
public class find{
	void exe(){
		Scanner in=new Scanner(System.in);int minmax; int n1=in.nextInt();int n2=in.nextInt();int max=Math.max(n1,n2);int min=Math.min(n1,n2);
        if(max!=min){
        min=min*min;max=max*max*max;//:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-
    }
    System.out.println("Square of small number"+min);System.out.println("Cube of greater number"+max);minmax=max-min;
    System.out.println("Difference in their number"+minmax);
    }
    public static void main(String args[]){
    	find obj=new find();
    	obj.exe();
    }
}
        
        