using System;
using System.ComponentModel.Design;
using System.Linq;

class Program
{
    static void Main()
    {
        int number = 52;
        string wordstring = NumberToWords(number);

        Console.WriteLine($"Number: {number}");
        Console.WriteLine($"Word Representation: {wordstring}");




        string Greetings= "How are you";
        string pigLatinPhrase = ConvertToPigLatin(Greetings);

        Console.WriteLine($"How are you: {Greetings}");
        Console.WriteLine($"Pig Latin Phrase: {pigLatinPhrase}");

        Console.ReadKey();
    }

    static string ConvertToPigLatin(string phrase)
    {
        
        string[] words = phrase.Split(' ');

        // itirate each word in the array calls the function to pig latin 
        for (int i = 0; i < words.Length; i++)
        {
            words[i] = ConvertWordToPigLatin(words[i]);
        }

        // Join the words back into a phrase, that has been seperated by space 
        return string.Join(' ', words);
    }

    static string ConvertWordToPigLatin(string word)
    {
        // Check if the word starts with a vowel
        if ("how are you".Contains(word[0]))
        {
            return word + "way";
        }
        else
        {
            // Find the index of the first vowel
            int firstVowelIndex = word.IndexOfAny("how are you".ToCharArray());

            // Move the consonant or consonant cluster to the end and add "ay"
            return word.Substring(firstVowelIndex) + word.Substring(0, firstVowelIndex) + "ay";


        }
        static string NumberToWords(int number)
        {
            if (number < 0 || number > 99)
            {
                return "Number out of range (0-99)";
            }

            if (number == 0)
            {
                return "zero";
            }

            string[] num1 = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
            string[] num2 = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
            string[] num3 = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

            string wordRepresentation = "";

            if (number >= 20)
            {
                wordRepresentation += num1[number / 10];
                number %= 10;

                if (number > 0)
                {
                    wordRepresentation += "-";
                }
            }

            if (number > 0 && number < 10)
            {
                wordRepresentation += num2[number];
            }
            else if (number >= 11 && number <= 19)
            {
                wordRepresentation += num3[number - 11];
            }

            return wordRepresentation;
        }
    }












}
}   

