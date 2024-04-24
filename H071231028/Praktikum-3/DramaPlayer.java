import java.util.Scanner;

class Actor {
    private String name;
    private int age;
    private String gender;

    public Actor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = "Unknown";
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("Actor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public void greet() {
        System.out.println("Hello, I'm " + name + "!");
    }
}

class DramaGenre {
    private String name;
    private Actor mainActor;
    private String description;

    public DramaGenre(String name, Actor mainActor, String description) {
        this.name = name;
        this.mainActor = mainActor;
        this.description = description;
    }

    public DramaGenre(String name, Actor mainActor) {
        this.name = name;
        this.mainActor = mainActor;
        this.description = "No description available";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Actor getMainActor() {
        return mainActor;
    }

    public void printMainActorInfo() {
        System.out.println("Main Actor in " + name + ":");
        mainActor.printInfo();
    }

    public void displayGenreInfo() {
        System.out.println("Genre: " + name);
        System.out.println("Description: " + description);
    }
}

class Drama {
    private String title;
    private String director;
    private DramaGenre genre;
    private int rating;
    private boolean isPopular;

    public Drama(String title, String director, DramaGenre genre, int rating, boolean isPopular) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
        this.isPopular = isPopular;
    }

    public Drama(String title, String director, DramaGenre genre, int rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
        this.isPopular = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public DramaGenre getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public boolean isPopular() {
        return isPopular;
    }

    public void printDramaInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        genre.displayGenreInfo();
        System.out.println("Rating: " + rating);
        System.out.println("Is Popular: " + isPopular);
    }

    public void checkPopularity() {
        if (isPopular) {
            System.out.println(title + " is a popular drama.");
        } else {
            System.out.println(title + " is not a popular drama.");
        }
    }
}

public class DramaPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Actor actor1 = new Actor("byeonwooseok", 32, "Male");
        Actor actor2 = new Actor("ChaEunwoo", 27);

        DramaGenre romanceGenre = new DramaGenre("Romance", actor1, "Love story");
        DramaGenre thrillerGenre = new DramaGenre("Thriller", actor2, "A story of revenge");

        System.out.println("1. Romance Genre");
        System.out.println("2. Thriller Genre");
        System.out.println("Choose a genre to view main actor info (1/2):");
        int genreChoice = scanner.nextInt();

        if (genreChoice == 1) {
            romanceGenre.printMainActorInfo();
        } else if (genreChoice == 2) {
            thrillerGenre.printMainActorInfo();
        } else {
            System.out.println("Invalid genre choice.");
        }

        Drama myDrama;
        if (genreChoice == 1) {
            myDrama = new Drama("Lovely Runner", "Kim Tae Yeob", romanceGenre, 8, true);
        } else {
            myDrama = new Drama("Wonderful World", "Yi Seung Young", thrillerGenre, 9, true);
        }

        myDrama.printDramaInfo();

        scanner.close();
    }
}