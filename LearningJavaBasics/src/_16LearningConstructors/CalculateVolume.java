package _16LearningConstructors;

public class CalculateVolume {

public CalculateVolume()
{
	length =3;
	width=4;
	height=5;
}


public CalculateVolume(int length, int width, int height)
{
	 this.length=length;
	 this.width=width;
	 this.height=height;
}

	int length;
	int width;
    int height;	
	
    public void calculateVolumeOfBoxes()
    {
         int vol=length*width*height;
         System.out.println("Volume : " + vol);
    }
}
