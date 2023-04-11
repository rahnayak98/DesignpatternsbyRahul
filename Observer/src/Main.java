import java.util.*;
public class Main {

    interface Subject
    {
        public void registerObserver(Observer o);
        public  void unregisterObserver(Observer o);
        public void notiyObserver();



    }


     static class CricketData implements Subject

    {
        int runs;
        int wickets;
        float overs;
        ArrayList<Observer> observerArrayList;
        public  CricketData()
        {
            observerArrayList= new ArrayList<Observer>();
        }

        @Override
        public void registerObserver(Observer o) {
            observerArrayList.add(o);
        }

        @Override
        public void unregisterObserver(Observer o) {
            observerArrayList.remove(o);
        }

        @Override
        public void notiyObserver() {
            for(Iterator<Observer> it=observerArrayList.iterator(); it.hasNext();)
            {
                Observer o=it.next();
                o.update(runs,wickets,overs);
            }
        }
        private int getRuns(){
            return 90;
        }
        private int getWickets()
        {
            return  5;
        }
        private  float getOvers()
        {
            return (float)10.5;
        }
        public void changedata()
        {
            runs=getRuns();
            wickets=getWickets();
            overs=getOvers();
            notiyObserver();
        }




    }


    interface  Observer
    {
        public void update(int runs, int wickets,float overs);
    }
    static class  CurrentScore implements Observer
    {
        private int runs;
        private int wickets;
        private  float overs;


        @Override
        public void update(int runs, int wickets, float overs) {
            this.runs=runs;
            this.wickets=wickets;
            this.overs=overs;
            display();
        }
        public void display()
        {
            System.out.println("\nCurrent Score Display:\n"
                    + "Runs: " + runs +
                    "\nWickets:" + wickets +
                    "\nOvers: " + overs );
        }
    }

    static class Avergaescoredisplay implements  Observer
    {
        private float runrate;
        private float predictedscore;


        @Override
        public void update(int runs, int wickets, float overs) {
            this.runrate=(float)runs/overs;
            this.predictedscore=(float) (int)(this.runrate*50);
            display();
        }

        public void display()
        {
            System.out.println("\nAverage Score Display:\n"
                    + "Runrate: " + runrate +
                   "Predicted Score" + predictedscore);
        }





    }


    public static void main(String[] args) {
        Avergaescoredisplay avg= new Avergaescoredisplay();
        CurrentScore cur= new CurrentScore();
        CricketData data= new CricketData();

        data.registerObserver(avg);
        data.registerObserver(cur);

        data.changedata();
        



    }
}