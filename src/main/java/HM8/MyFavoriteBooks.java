package HM8;

public class MyFavoriteBooks {


        public static void main(String[] args) {
            Books book1 = new Books();
            book1.name = "How Dare The Sun Rise";
            book1.author =    "Sandra Uwiringiyimana";
            book1.type  = "Memories of a war child";

            Books book2 = new Books();
            book2.name = "The Power Of Moments";
            book2.author =    "Chip Health & Dan Health";
            book2.type  = "Business lecture";

            book1.MyFavBook();
            book2.MyFavBook();
        }
    }


