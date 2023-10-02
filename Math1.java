public class Math1 
{
    public static void main(String[] args)
    {
        double earthdiameter = 7600;
        double sundiameter = 865000;
        double earthradius = earthdiameter/2;
        double sunradius = sundiameter/2;

        double earthvolume = (4.0/3.0)* Math.PI*Math.pow(earthradius,3);
        double sunvolumne = (4.0/3.0)* Math.PI*Math.pow(sunradius,3);

        double ratio = sunvolumne/earthvolume;

        System.out.println("The volume of the Earth is " + earthvolume + " cubic miles.");
        System.out.println("The volume of the Sun is " + sunvolumne + " cubic miles.");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + ratio);

    }
}
