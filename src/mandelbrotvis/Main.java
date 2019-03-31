package mandelbrotvis;

import processing.core.*;

/**
 *
 * @author Wind
 */
public class Main extends PApplet
{
    double min = -2;
    double max = 2;
    float bright;
    
    public static void main(String[] args)
    {
	PApplet.main("mandelbrotvis.Main");
    }

    public void settings()
    {
	size(1000, 1000);
	
	pixelDensity(1);
    }

    public void setup()
    {
	
    }

    public void draw()
    {
	
	int maxit = 100;
	
	
	loadPixels();
	for (int x = 0; x < width; x++)
	{
	    for (int y = 0; y < height; y++)
	    {
		float a = map(x, 0, width, (float)min, (float)max);
		float b = map(y, 0, height, (float)min, (float)max);

		bright = Mandelbrot.genMand(a, b, maxit);

		int pix = (x + y * width);
		pixels[pix] = color(bright, bright, bright, 255);
	    }
	}
	updatePixels();
	
	min = min * 0.99;
	max =  max* 0.99;
    }
    
}
