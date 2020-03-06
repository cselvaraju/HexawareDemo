public class ActorTest {
    public static void main(String[] args) {
        
        Actor actor = new Actor();
        //actor.setName("Amitabh Bacchan");
        //actor.setRating(9.8f);
        System.out.println(actor);

        Actor anotherActor = new Actor("Rajnikant",9.9f);
        System.out.println(anotherActor);

        Actor bongActor = new Actor("Mithun da", 9.9f);
        System.out.println(bongActor); 


        //CALLS THE CTOR COPY

            
        Actor anotherMithunDa = new Actor(bongActor);

        Actor anotherMithunDa = bongActor;
        System.out.println(anotherMithunDa);

        System.out.println((Object)bongActor);
        System.out.println((Object)anotherMithunDa);
    }
}