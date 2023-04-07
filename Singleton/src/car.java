public class car {

    private static car bmw=null;

    private  car()
    {

    }

    public static car getInstance()
    {
        if(bmw==null)
        {
            bmw= new car();
        }
        return  bmw;
    }


}

