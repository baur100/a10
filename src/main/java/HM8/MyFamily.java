package HM8;

public class MyFamily {


        public static void main(String[] args) {
            FamilyMemebers dad = new FamilyMemebers();
            dad.firstName = "Vali";
            dad.lastName = "Sharakhmetov";
            dad.age = 62;
            dad.hobby = "Music";

            FamilyMemebers mom = new FamilyMemebers();
            mom.firstName = "Sofia";
            mom.lastName = "Karimova";
            mom.age = 56;
            mom.hobby = "Reading";

            FamilyMemebers child1 = new FamilyMemebers();
            child1.firstName = "Zarina";
            child1.lastName = "Sharakhmetova";
            child1.age = 27;
            child1.hobby = "Java";

            FamilyMemebers child2 = new FamilyMemebers();
            child2.firstName = "Irina";
            child2.lastName = "Sharakhmetova";
            child2.age = 26;
            child2.hobby = "Baking";

            dad.introduceYourFamily();
            mom.introduceYourFamily();
            child1.introduceYourFamily();
            child2.introduceYourFamily();

        }
    }


