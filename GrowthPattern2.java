/*Hruday Mulky
 * Period 7
 * GrowthPattern2.java
 * 1/13/26
 * Program description:
 * this program measures the height of the plant based on the user's input and shows it with o,+ or -
 * depending on whether the height has increased, decreased or stayed the same
 * and aligns it based on the height being negative or positive
 * Working on:
 * Arrays
 * Pseudocode
 * import Scanner
 * class header
 * 	declare private array height which is an int
 * 	contructor
 * 		Initialize the array height with a random length(changes later)
 * 	main
 * 		create instance ofclass called grow
 * 		us grow to call growIt()
 * 	growIt()
 * 		Print 3 BLs
 *		call getHeights()
 * 		create a for loop that runs while int loop is lesser than length of height
 * 		loop starts at 0 and increments each time
 * 			D&I byte whatSymbol as -1
 * 			set value of whatSymbol as the call of decideSymbols, sending in loop
 * 			call printSymbols, sending in loop and whatSymbol
 * 		call printRate()
 * 		print 3 BLs
 *	getHeights()
 *		D&I scanner read
 *		Ask user for no of value and save it to an int lengthArray
 *		change height's length to lengthArray
 *		Ask user for all values
 *		create a for loop where int i starts at 0, increments each time and the loops runs while i is lesser than lengthArray
 *			height's value at index i is not the user's next int value
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
 * 				add a + to symbols
 * 			else if whichSymbol is -1
 * 				add a - to symbols
 * 			else if whichSymbol is 0
 * 				add a o to symbols
 *		if currentHeight is greater than 0
 *			prints the symbols in the right column
 *		else if currentHeight is 0
 *			prints the symbols in the right column
 *		lse if currentHeight is lesser than 0
 *			prints the symbols in the right column
 * 		use println to move to next ine
 * 	printRate
 * 		D&I double average as (height[height.length-1]-height[0])/((double)(height.length-1));
 * 		which is the change in height over time divided by the no of days
 * 		print the rate using printf
 */

import java.util.Scanner;//import Scanner
public class GrowthPattern2//class header
{
	private int[] height;//declare int height which is an array
	public GrowthPattern2()//contructor
	{
		height=new int[10000000];//Initialize the array height as a random value
	}
	public static void main(String[] args)//main
	{
		GrowthPattern2 grow = new GrowthPattern2();//create instance of class called grow
		grow.growIt();//use grow to call growIt()
	}
	public void growIt()//growIt()
	{
		System.out.print("\n\n\n");//print 3 BLs
		getHeights();//call getHeights
		System.out.println();//moves cursor to new line
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
	public void getHeights()//getHeights
	{
		Scanner read=new Scanner(System.in);//D&I a scanner called read
		System.out.println("Input how many values you wish to check:");//ask the user how many values should be checked
		int lengthArray=read.nextInt();//read the user's value and save it to an int lengthArray
		height = new int[lengthArray];//save a new length to height as lengthArray
		System.out.println("Input the values you wish to check. negavtive values cannot be lesser than -5");//Ask user for the values.
		for(int i=0; i<lengthArray;i++)//create a for loop where int i starts at 0, increments each time and the loops runs while i is lesser than lengthArray
		{
			height[i]=read.nextInt();//height's value at index i is not the user's next int value
		}
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
		currentHeight=height[loopNo];//set value of currentHeight as
		//height's value at index loopNo +5
		System.out.printf("t%-5d",loopNo);//print loop no using printf
		String symbols="";//D&I string symbols
		for(int i=0; i<Math.abs(currentHeight);i++)//for loop which runs when int i is lesser than
		//currentHeight. i starts at 0 and increments each time
		{
			if(whichSymbol==1)//if whichSymbol is 1
			{
				symbols+="+";//save a plus to string
			}
			else if(whichSymbol==-1)//else if whichSymbol is -1
			{
				symbols+="-";//save a minus to string
			}
			else if(whichSymbol==0)//else if whichSymbol is 0
			{
				symbols+="o";//save an o to string
			}
		}
		if(currentHeight>0)//if currentHeight is greater than 0
		{
			System.out.printf("%5s|%5s|%-5s","","",symbols);//prints the symbols in the right column
		}
		else if(currentHeight==0)//else if currentHeight is 0
		{
			System.out.printf("%5s|%5s|%5s","","  0  ","");//prints the symbols in the right column
		}
		else if(currentHeight<0)//else if currentHeight is lesser than 0
		{
			System.out.printf("%5s|%5s|%5s",symbols,"","");//prints the symbols in the right column
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


