/********************************************************************/
/*					  Programming Assignment 8						*/
/*  				Table Lookup - Restricted Input					*/
/*																	*/
/* This program calculates the tangent of an angle input on P1 and  */
/* outputs the result on P2.  The input angle is limited from -45   */
/* to 45 degrees.  The input 0x00 corresponds to -45 degrees and    */
/* 0xFF corresponds to 45 degrees.  The output of tangent in this   */
/* range is -1 to 1.  The output 0x00 corresponds to -1 and 0xFF    */
/* corresponds to 1.												*/
/********************************************************************/

#include <reg51.h>		//Include register definitions

void main(void) {

	//Create lookup table
	code unsigned char tan[]={
	0,1,3,4,6,7,9,10,11,13,14,16,17,18,20,21,22,24,25,26,28,29,30,31,
	33,34,35,36,37,39,40,41,42,43,44,45,46,48,49,50,51,52,53,54,55,56,
	57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,73,74,75,76,77,
	78,79,80,81,82,83,83,84,85,86,87,88,89,89,90,91,92,93,94,95,95,96,
	97,98,99,99,100,101,102,103,104,104,105,106,107,108,108,109,110,111,
	112,112,113,114,115,116,116,117,118,119,120,120,121,122,123,123,124,
	125,126,127,127,128,129,130,131,131,132,133,134,134,135,136,137,138,
	138,139,140,141,142,142,143,144,145,146,146,147,148,149,150,150,151,
	152,153,154,155,155,156,157,158,159,159,160,161,162,163,164,165,165,
	166,167,168,169,170,171,171,172,173,174,175,176,177,178,179,180,181,
	181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,
	198,199,200,201,202,203,204,205,206,208,209,210,211,212,213,214,215,
	217,218,219,220,221,223,224,225,226,228,229,230,232,233,234,236,237,
	238,240,241,243,244,245,247,248,250,251,253,255
	};

	while(1) {			//Repeat forever
		P2=tan[P1];		//Lookup output
	}
}







