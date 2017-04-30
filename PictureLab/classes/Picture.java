import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; 

public class Picture extends SimplePicture {
  public Picture () {
    super();  
  }
  public Picture(String fileName) {
    super(fileName);
  }
  public Picture(int height, int width) {
	super(width,height);
  }
  public Picture(Picture copyPicture) {
    super(copyPicture);
  }
  public Picture(BufferedImage image) {
    super(image);
  }
  public String toString() {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
  }
  public void zeroBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setBlue(0);
      }
    }
  }
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  public void negate() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
        pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }
  public void grayscale() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
        pixelObj.setRed(average);
        pixelObj.setGreen(average);
        pixelObj.setBlue(average);
      }
    }
  }
  public void fixUnderwater() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray)
      {
        int red = Math.abs(pixelObj.getRed() - 21);
        int green = Math.abs(pixelObj.getGreen() - 163);
        int blue = Math.abs(pixelObj.getBlue() - 173);
        int difference = red + green + blue;
        if (difference > 21) {
          pixelObj.setRed(0);
          pixelObj.setGreen(0);
          pixelObj.setBlue(0);
        }
      }
    }
  }
  public void mirrorVerticalRightToLeft() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  public void mirrorVertical() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
public void mirrorHorizontal()
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      for (int row = 0; row < height; row++)
      {
          for (int col = 0; col < pixels[0].length; col++)
          {
              topPixel = pixels[row][col];
              bottomPixel = pixels[height - 1 - row][col];
              bottomPixel.setColor(topPixel.getColor());
          }
      }
  }
  
  public void mirrorHorizontalBotToTop() {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      for (int row = 0; row < height; row++) {
          for (int col = 0; col < pixels[0].length; col++) {
              topPixel = pixels[row][col];
              bottomPixel = pixels[height - 1 - row][col];
              topPixel.setColor(bottomPixel.getColor());
          }
      }
  }
  public void mirrorTemple() {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 27; row < 97; row++) { 
      for (int col = 13; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
        [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  public void mirrorArms() {
	int mirrorPoint = 193;
	Pixel topPixel = null;
	Pixel bottomPixel = null;
	Pixel [][] pixels = this.getPixels2D();
	for (int row = 158; row < mirrorPoint; row++) {
		for(int col = 103; col < 170; col++) {
			topPixel = pixels[row][col];
			bottomPixel = pixels[mirrorPoint - row +mirrorPoint][col];
			bottomPixel.setColor(topPixel.getColor());
		}
	}
	int mirrorPoint2 = 198;
	Pixel topPixel2 = null;
	Pixel bottomPixel2 = null;
	for (int row = 171; row < mirrorPoint2; row++) {
		for (int col = 239; col <294; col++) {
			topPixel2 = pixels[row][col];
			bottomPixel2 = pixels[mirrorPoint2 - row + mirrorPoint2][col];
			bottomPixel2.setColor(topPixel2.getColor());
		}
	}
  }
  public void mirrorGull() {
	int mirrorPoint = 345;
	Pixel rightPixel = null;
	Pixel leftPixel = null;
	Pixel[][] pixels = this.getPixels2D();
	for (int row = 237; row < 321; row++) {
		for (int col = 236; col < mirrorPoint; col++) {
			rightPixel = pixels[row][col];
			leftPixel = pixels[row][mirrorPoint - col + mirrorPoint/3];
			leftPixel.setColor(rightPixel.getColor());
		}
	}
  }
  public void copy(Picture fromPic, 
  int startRow, int startCol) {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
		fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
        fromCol < fromPixels[0].length &&
        toCol < toPixels[0].length;  
        fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  public void createCollage() {
    Picture motorcycle = new Picture("redmotorcycle.jpg");
    Picture flower2 = new Picture("flower2.jpg");
	Picture snowman = new Picture("snowman.jpg");
	Picture snowmanGrey = new Picture(snowman);
	snowmanGrey.grayscale();
    this.copy(motorcycle,0,0);
    this.copy(flower2,100,0);
    this.copy(snowmanGrey,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
	Picture motorcycleNegate = new Picture(motorcycle);
	motorcycleNegate.negate();
    this.copy(flowerNoBlue,300,0);
    this.copy(motorcycle,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  public void edgeDetection(int edgeDist) {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; 
           col < pixels[0].length-1; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  public void edgeDetection2(int edgeDist) {
    Pixel currentPixel = null;
    Pixel diagonalPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color diagonalColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        currentPixel = pixels[row][col];
        diagonalPixel = pixels[row+1][col+1];
        diagonalColor = diagonalPixel.getColor();
        if (currentPixel.colorDistance(diagonalColor) > edgeDist) 
			currentPixel.setColor(Color.BLACK);
        else
			currentPixel.setColor(Color.WHITE);
      }
    }	
  }
  public static void main(String[] args) {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
}