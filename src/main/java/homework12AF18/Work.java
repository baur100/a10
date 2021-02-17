package homework12AF18;

public class Work {
    public static void main(String[]args){
        Messenger m1=new Messenger("Teammates",34);
        m1.sentMessage("Diana");
        m1.notification(20);
        Messenger m2=new Messenger("Click and sent", 45);
        m2.sentMessage("Vladimir");
        m2.notification(10);

        MediaApplication media1=new MediaApplication("SHARE",3);
        media1.notification(100);
        media1.sentMessage("images");
        MediaApplication media2=new MediaApplication("Among friends",1);
        media2.sentMessage("mp4");
        media2.notification(10);


        Functions[] all={m1,m2,media1,media2};
        System.out.println(all.toString());
    }
}
