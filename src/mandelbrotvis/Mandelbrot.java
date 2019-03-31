package mandelbrotvis;

import static processing.core.PApplet.map;

/**
 *
 * @author Wind
 */
public class Mandelbrot
{

    public static float genMand(float a, float b, int maxit)
    {
	float ca = a;
	float cb = b;

	int n;
	for (n = 0; n < maxit; n++)
	{
	    float aa = a * a - b * b;
	    float bb = 2 * a * b;
	    a = aa + ca;
	    b = bb + cb;
	    if (a + b > 4)
	    {
		break;
	    }
	}

	float bright = map(n, 0, maxit, 0, 1);
	bright = map(bright, 0, 1, 0, 255);
	if (n == maxit)
	{
	    bright = 0;
	}
	
	return bright;
    }
    
    public static float genJulia(float a, float b, int maxit)
    {
	float ca = -0.70176f;
	float cb = -0.3842f;

	int n;
	for (n = 0; n < maxit; n++)
	{
	    float aa = a * a - b * b;
	    float bb = 2 * a * b;
	    a = aa + ca;
	    b = bb + cb;
	    if (a + b > 4)
	    {
		break;
	    }
	}

	float bright = map(n, 0, maxit, 0, 1);
	bright = map(bright, 0, 1, 0, 255);
	if (n == maxit)
	{
	    bright = 0;
	}
	
	return bright;
    }
}
