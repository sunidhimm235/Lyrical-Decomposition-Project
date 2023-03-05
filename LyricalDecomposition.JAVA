// Nikul Jethalal Halai
// COP 3330 (Spring 2023)
// ni014425

public class LyricalDecomposition 
{
    // This function returns a value of how many hours I took to complete this assignment.
    public static double hoursSpent() 
    {
        return 5;
    }

    // This function returns a value of how difficult the assignment was.
    public static double difficultyRating() 
    {
        return 4.0;
    }

    // This function prints the lyrics.
    public static void printLyrics()
    {
        // Array to store the words that show up a lot of times in the song in different verses
        String[] SimilarWords = {"fly", "spider", "bird", "cat", "dog", "horse", "How absurd", "Imagine that", "What a hog"};

        int stanza = 1, currentLine = 1; // Variables to determine the para and line number

        while (stanza < 7) // While loop to print the lyrics
        {   
            if (stanza == 2) // Prints the first line of the current stanza
            {
                System.out.println("There was an old woman who swallowed a " + SimilarWords[stanza-1] + ",");
            }
            else
            {
                System.out.println("There was an old woman who swallowed a " + SimilarWords[stanza-1] + ".");
            }

            if (stanza == 2) // Prints the second line of the current stanza
            {
                System.out.println("That wriggled and iggled and jiggled inside her!");
            }
            else if (stanza > 2 && stanza < 6)
            {
                System.out.println(SimilarWords[stanza+3] + ", to swallow a " + SimilarWords[stanza-1] + "!");
            }

            int firstWord = 1, secondWord = 2; // Variables to use later to choose the word from the array
            currentLine = 1; // Resetting the current line number

            while (stanza < 6 && currentLine < stanza) // While loop to print the middle lines of the current stanza
            {
                System.out.print("She swallowed the " + SimilarWords[stanza - firstWord] + " to catch the " + SimilarWords[stanza - secondWord]);

                if (currentLine == stanza-1) 
                {
                    System.out.println(".");
                }
                else
                {
                    System.out.println(";");
                }

                // Incrementing all the varibles
                currentLine++;
                firstWord++;
                secondWord++;
            }

            if (stanza < 6) { // Prints the last second line of the current stanza
                System.out.println("I don't know why she swallowed that fly;");
            }

            if (stanza < 6) { // Prints the last line of the current stanza
                System.out.println("Perhaps she'll die.");
            }

            if (stanza == 6) { // Prints the last line of the last stanza
                System.out.println("She died, of course!");
            }

            if (stanza != 6) { // Prints a blank line between stanzas
                System.out.println();
            }

            // Incrementing the stanza 
            stanza++;
        }
    }
}
