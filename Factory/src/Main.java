public class Main {
    public static interface notofication{
        public void notifyuser();
    }
    static class smsnotification implements notofication
    {
        @Override
        public void notifyuser() {
            System.out.println("SMS Notification");
        }
    }
    static class emailnotification implements notofication
    {
        @Override
        public void notifyuser() {
            System.out.println("Email Notification");
        }
    }

    static class pushnotification implements notofication
    {
        @Override
        public void notifyuser() {
            System.out.println("Push Notification");
        }
    }
    static class notificationfactory{
        public notofication createnotification(String chan)
        {
            if(chan==null || chan.isEmpty())
            {
                return  null;
            }
            switch (chan)
            {
                case "SMS":
                    return  new smsnotification();
                case "EMAIl":
                    return  new emailnotification();
                case "PUSH":
                    return  new pushnotification();
                default:
                    throw new IllegalArgumentException("Unknown channel "+chan);

            }
        }
    }
    public static void main(String[] args) {
notificationfactory nf= new notificationfactory();
notofication nt= nf.createnotification("PUSH");
nt.notifyuser();

    }
}