abstract class Fighter
{
    Kickbehavior kickbehavior;
    Jumpbehavior jumpbehavior;

    public  Fighter(Kickbehavior kickbehavior, Jumpbehavior jumpbehavior)
    {
        this.kickbehavior=kickbehavior;
        this.jumpbehavior=jumpbehavior;
    }
    public void punch()
    {
        System.out.println("Default punch");
    }
    public void kick()
    {
       kickbehavior.kick();
    }

    public void jump()
    {
        jumpbehavior.jump();
    }
    public void roll()
    {
        System.out.println("Default roll");
    }
    public  void setKickbehavior(Kickbehavior kickbehavior)
    {
        this.kickbehavior=kickbehavior;

    }
    public  void setjumpbehavior(Jumpbehavior jumpbehavior)
    {
        this.jumpbehavior=jumpbehavior;

    }

}
interface  Kickbehavior
{
    public  void kick();

}
class Lightningkick implements Kickbehavior
{
    public void kick()
    {
        System.out.println("Lighhtning kick");
    }

}


class TornadoKick implements Kickbehavior
{
    public void kick()
    {
        System.out.println("Tornado Kick");
    }

}

interface  Jumpbehavior
{
    public void jump();
}
class Longjump implements Jumpbehavior
{
    public void jump()
    {
        System.out.println("Long jump");
    }

}

class Shortjump implements Jumpbehavior
{
    public void jump()
    {
        System.out.println("Short jump");
    }

}


class Ryu extends Fighter
{
    public  Ryu(Kickbehavior kickbehavior, Jumpbehavior jumpbehavior)
    {
        super(kickbehavior,jumpbehavior);
    }
    public  void display()
    {
        System.out.println("RYU");
    }

}


class Ken extends Fighter
{
    public  Ken(Kickbehavior kickbehavior, Jumpbehavior jumpbehavior)
    {
        super(kickbehavior,jumpbehavior);
    }
    public  void display()
    {
        System.out.println("KEN");
    }

}









public class Main {
    public static void main(String[] args) {
        Jumpbehavior shortjump= new Shortjump();
        Jumpbehavior longjump=  new Longjump();
        Kickbehavior tornadokick= new TornadoKick();

        Ken ken= new Ken(tornadokick,shortjump);
        ken.display();

        ken.punch();
        ken.kick();


    }
}