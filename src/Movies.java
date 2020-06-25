import java.util.*;

public class Movies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> movieList = new ArrayList<String>(); //array list to hold movieTitles
        String movieTitle = "";

//        PROMPT USER

        do {
            System.out.println("Enter a favorite movie: (Q to quit)");
            movieTitle = input.nextLine();

            if (!movieTitle.equalsIgnoreCase("q")){
                movieList.add(movieTitle);
            }
        } while (!movieTitle.equalsIgnoreCase("q"));


//        ALPHABETIZE

        boolean isSorted = false;
        String temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < movieList.size() - 1; i++) {
                for (int j = 0; j < movieList.size() -1 - i; j++){
                    if (movieList.get(i).charAt(0) == movieList.get(i+1).charAt(0)){    //if movies start with same letter
                        //check next car
                        if (movieList.get(i).charAt(1) > movieList.get(i+1).charAt(1)){
                            //swap
                            temp =movieList.get(i);
                            Collections.swap(movieList, i, i+1);
                            isSorted = false;
                        }
                    } else if (movieList.get(i).charAt(0) > movieList.get(i+1).charAt(0)){
                        //swap
                        temp =movieList.get(i);
                        Collections.swap(movieList, i, i+1);
                        isSorted = false;
    //                    movieList.get(i) = movieList.get(i+1);

                    } else {
                        //move on to check next movie - next i loop
                    }
                } // j loop

            } //i loop

        }


//        PRINT ALPHABETIZED LIST
        System.out.println("Here are all of the movies that you like: ");
        System.out.println(Arrays.toString(movieList.toArray())); //print array



        //SUGGEST RANDOM MOVIE TITLE
        System.out.println("Try watching this one tonight: ");
        int movieListSize = movieList.size();
        int movieRandomNumber = random.nextInt(movieListSize);

        String movieSuggestion = movieList.get(movieRandomNumber);

        System.out.println(movieSuggestion);

    }
}









