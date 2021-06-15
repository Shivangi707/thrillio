package com.company.thrillio.entities;
import com.company.constants.BookGenre;


    public class Book extends Bookmark{
        private int publicationYear;
        private  String publisher;
        private String[] authors;
        private String genre;
        private double amazonRating;
@Overrie
public String toString(){
    return "Book{"+"publicationYear="+ publicationYear + ", publisher=' "+ publisher + '\' ' + ", authors=' "+ authors+ '\' ' + ", genre=' "+ genre + '\'' + ", autoRating=' " + autoRating + '\' ' + '}';
}
        public int getPublicationYearYear(){
            return publicationYear;
        }
        public void setPublicationYear(int publicationYear){
            this.publicationYear=publicationYear;
        }
        public String getPublisher(){
            return publisher;
        }
        public void setPublisher(String publisher){
            this.publisher=publisher;
        }
        public String[] getAuthors(){
            return authors;
        }
        public void setAuthors(String[] authors){
            this.authors=authors;
        }
        public String getGenre(){
            return genre;
        }
        public void setGenre(String genre){
            this.genre=genre;
        }
        public double getAmazonRating(){
            return amazonRating;
        }
        public void setImdbRating(double amazonRating){
            this.amazonRating=amazonRating;
        }

    }


