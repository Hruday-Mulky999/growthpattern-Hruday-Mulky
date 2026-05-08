/*Hruday Mulky
 * Period 7
 * GrowthPattern.java
 * 1/12/26
 * Program description:
 * this program measures the height of the plant and shows it with o,+ or -
 * depending on whether the height has increased, decreased or stayed the same
 * Working on:
 * Arrays
 * Pseudocode
 * import Scanner
 * class header
 * 	declare private array height which is an int
 * 	contructor
 * 		Initialize the array height with the desired values
 * 	main
 * 		create instance ofclass called grow
 * 		us grow to call growIt()
 * 	growIt()
 * 		Print 3 BLs
 * 		create a for loop that runs while int loop is lesser than length of height
 * 		loop starts at 0 and increments each time
 * 			D&I byte whatSymbol as -1
 * 			set value of whatSymbol as the call of decideSymbols, sending in loop
 * 			call printSymbols, sending in loop and whatSymbol
 * 		call printRate()
 * 		print 3 BLs
 * 	decideSymbols(int loopNo)
 * 		if loopNo is 0
 * 			return 0
 * 		else
 * 			if height's value at index of loopNo is greater than height's value at index of loopNo-1
 * 				return 1
 * 			else if height's value at index of loopNo is lesser than height's value at index of loopNo-1
 * 				return -1
 * 			else
 * 				return 0
 * 	printSymbols(int loopNo, byte whichSymbol)
 * 		D&I int currentHeight as -1
 * 		save currentHeight as height[loopNo]+5;
 * 		Print out the time using printf
 * 		create a for loop that runs while int i is lesser than currentHeight
 * 		i starts at 0 and increments each time
 * 			if whichSymbol is 1
 * 				print a +
 * 			else if whichSymbol is -1
 * 				print a - sign
 * 			else if whichSymbol is 0
 * 				print a o
 * 		use println to move to next ine
 * 	printRate
 * 		D&I double average as (height[height.length-1]-height[0])/((double)(height.length-1));
 * 		which is the change in height over time divided by the no of days
 * 		print the rate using printf
 */

import java.util.Scanner;//import Scanner
public class GrowthPattern//class header
{
	private int[] height;//declare int height which is an array
	public GrowthPattern()//contructor
	{
		height=new int[]{-1,-3,1,2,3,4,3,4,4,6,8,6,6,7,10};//Initialize the array height
	}
	public static void main(String[] args)//main
	{
		GrowthPattern grow = new GrowthPattern();//create instance of class called grow
		grow.growIt();//use grow to call growIt()
	}
	public void growIt()//growIt()
	{
		System.out.print("\n\n\n");//print 3 BLs
		for(int loop=0; loop<height.length;loop++)//create a for loop which runs while loop is
		//lesser tha length of height. loop starts at 0 and increments each time
		{
			byte whatSymbol=-1;//D&I byte whatSymbol as -1
			whatSymbol=decideSymbols(loop);//set value of whatSymbol
			//as the call of decideSymbols sending in loop
			printSymbols(loop,whatSymbol);//call printSymbols sending in loop
			//as well as whatSymbol
		}
		printRate();//call printRate
		System.out.print("\n\n\n");//print 3 BLs
	}
	public byte decideSymbols(int loopNo)//decideSymbols accepts loopNo
	{
		if(loopNo==0)//if loopNo is 0
		{
			return 0;//return 0
		}
		else
		{
			if(height[loopNo]>height[loopNo-1])//if height of current loop
			//is greater than the height of last loop
			{
				return 1;//return 1
			}
			else if(height[loopNo]<height[loopNo-1])//if height of current loop
			//is lesser than the height of last loop
			{
				return -1;//return -1
			}
			else//else
			{
				return 0;//return 0
			}
		}
	}
	public void printSymbols(int loopNo,byte whichSymbol)//printSymbols accept
	// int loopNo as well as byte whichSymbol
	{
		int currentHeight=-1;//D&I int currentHeight as -1
		currentHeight=height[loopNo]+5;//set value of currentHeight as
		//height's value at index loopNo +5
		System.out.printf("t%-5d",loopNo);//print loop no using printf
		for(int i=0; i<currentHeight;i++)//for loop which runs when int i is lesser than
		//currentHeight. i starts at 0 and increments each time
		{
			if(whichSymbol==1)//if whichSymbol is 1
			{
				System.out.print("+");//print a +
			}
			else if(whichSymbol==-1)//else if whichSymbol is -1
			{
				System.out.print("-");//print a -
			}
			else if(whichSymbol==0)//else if whichSymbol is 0
			{
				System.out.print("o");//print a o
			}
		}
		System.out.println();//moves cursor to new line
	}
	public void printRate()//printRate
	{
		double average = (height[height.length-1]-height[0])/((double)(height.length-1));
		//D&I double average as the change in height over time divided by the no of days
		System.out.printf("\nThe avreage rate is around %-4.2f millimeters per unit of time",average);
		//print the rate using printf
	}
}
