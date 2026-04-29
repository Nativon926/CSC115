/*
 * Miranda Germain
 * September 1st 2022
 * CSC 115
 * Book Programs
 */
 
 public class VolumeSurfaceAreaCalc {
   public static void main(String[] args) {
   int length = 4;
   int width = 5;
   int height = 6;
   int volumeOfPrism = length*width*height;
   int surfaceArea = 2*(length*width + length*height + width*height);
   System.out.println("Volume: " + volumeOfPrism);
   System.out.println("Surface Area: " + surfaceArea);
   String name = " \" Name \" ";
   System.out.println( name ); 
   System.out.println("The quick brown fox jumps over the lazy dog!");
   String ai= "J.A.R.V.I.S.";
   System.out.println("\"" + ai + ", sometimes you gotta run before you can walk.\" - Tony Stark"); 
   }
  }