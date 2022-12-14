import java.util.ArrayList;

public class ArrayListPractice {
    /**
     * Get the first element in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The first element in the list.
     */
    public static int GetFirst(ArrayList<Integer> numbers) {
        int num = numbers.get(0);
        return num;
    }

    /**
     * Get the third element in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The third element in the list.
     */
    public static int GetThird(ArrayList<Integer> numbers) {
        int num = numbers.get(2);
        return num;
    }

    /**
     * Get the last element in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The last element in the list.
     */
    public static int GetLast(ArrayList<Integer> numbers) {
        int num = numbers.get(numbers.size()-1);
        return num;
    }

    /**
     * Get the sum of all elements in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The sum of the elements in the list.
     */
    public static int GetSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for(int element: numbers)
        {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns a string that contains all of the numbers in the ArrayList
     * separated by one space.
     * 
     * For example, if numbers = {1, 4, 3, 2, 6}, your output should
     * be "1 4 3 2 6".
     * 
     * @param numbers List of numbers to search over.
     * @return A string representing the list.
     */
    public static String ConvertToString(ArrayList<Integer> numbers) {
    String numberList = "";
        for(int i = 0; i <numbers.size(); i++)
            numberList+=numbers.get(i) + " ";
        return numberList;
    }

    /**
     * Returns the largest element in the array
     * 
     * @param numbers List of numbers to search over.
     * @return The largest element in the list.
     */
    public static int GetMax(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++)
        {
            if(numbers.get(i) > max)
            {
                max = numbers.get(i);
            }
        }
        return max;
    }

    /**
     * Creates an array of continuous numbers represented by the range [first, last).
     * Include the first element, but not the last one.
     * If the first and last elements are the same, then the list should be empty.
     * If the last number is less than the first, then the list should also be empty.
     *
     * For example:
     *  CreateNumberArray(4, 8) returns {4, 5, 6, 7}
     *  CreateNumberArray(2, 2) returns {} (an empty list)
     * 
     * @param first The first number in the list (inclusive).
     * @param last The last number in the list (exclusive).
     * @return A list of all numbers between first and last.
     */
    public static ArrayList<Integer> CreateNumberArray(int first, int last) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        if(first == last)
        {
            return numberList;
        }
        else
        {
            for(int i = first; i < last; i++)
            {
                numberList.add(i);
            }
        }
        return numberList;
    }

    /**
     * Finds the first student whose favorite color is the one specified.
     *
     * @param students The list of students to search over.
     * @param color The favorite color the student must have.
     * @return The first student whose favorite color is the one specified.
     */
    public static Student GetFirstStudentWithFavoriteColor(ArrayList<Student> students, String color) {
        for(Student element: students)
        {
            if(element.GetFavoriteColor().equals(color))
            {
                return element;
            }
        }
        return new Student();
    }

    /**
     * Gets the favorite color for a specified student.
     *
     * @param students The list of students to search over.
     * @param name The name of the student to look for.
     * @return The favorite color of the specified student.
     */
    public static String GetFavoriteColorOfStudent(ArrayList<Student> students, String name) {
        String favColor = "";
        for(Student element: students)
        {
            if(element.GetName().equals(name))
            {
                favColor += element.GetFavoriteColor();
            }
        }
        return favColor;
    }

    /**
     * Finds the tallest student.
     *
     * @param students The list of students to search over.
     * @return The tallest student in the list.
     */
    public static Student GetTallestStudent(ArrayList<Student> students) {
        int maxHeight = students.get(0).GetHeight();
        Student tallest = students.get(0);
        for(Student element: students)
        {
            if(element.GetHeight() > maxHeight)
            {
                maxHeight = element.GetHeight();
                tallest = element;
            }
        }
        return tallest;
    }

    /**
     *  Creates an array of Student objects using the information provided in via the parameters.
     * (names[0], heights[0] ...) are for the first student. (names[1], height[1]...)
     * are for the second student, etc.
     * 
     * @param names The list of names of the students.
     * @param heights The list of heights of the students.
     * @param gradeLevels The list of gradeLevels of the students.
     * @param favoriteColors The list of favoriteColors of the students.
     * @param bankAccounts The list of bankAccounts of the students.
     * @return List of Student objects.
     */
    public static ArrayList<Student> CreateStudentArray(ArrayList<String> names, ArrayList<Integer> heights, ArrayList<Integer> gradeLevels, ArrayList<String> favoriteColors, ArrayList<BankAccount> bankAccounts) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        for(int i = 0; i < names.size(); i++)
        {
            Student s = new Student(names.get(i), heights.get(i), gradeLevels.get(i),favoriteColors.get(i),bankAccounts.get(i));
            studentList.add(s);
        }
        return studentList;
    }

    /**
     * Returns a string that lists teams from a 2-D ArrayList. Each ArrayList in
     * the bigger ArrayList contains members of the team.
     * 
     * The expected output looks like this:
     * Team 1: Amy, Abby, Arnold
     * Team 2: Bob, Beatrice, Becky, Ben
     * Team 3: Claire
     * 
     * @param teams The list of teams of students.
     * @return A string that lists the team number followed by each team.
     */
    public static String GetTeamsString(ArrayList<ArrayList<Student>> teams) {
        String teamLists = "";
        for(int r = 0; r < teams.size(); r++)
        {
            teamLists += "Team " + (r + 1) + ": ";
            for(int c = 0; c < teams.get(r).size(); c++)
            {
                teamLists += teams.get(r).get(c).GetName();
                if((c+1) != teams.get(r).size())
                {
                    teamLists += ", ";
                }

            }
            teamLists += "\n";
        }
        return teamLists;
    }

    /**
     * Finds the student with the given name, and updates their favorite color to the given color.
     *
     * @param students The list of students to search over.
     * @param name The name of the student whose favorite color should be updated.
     * @param newFavoriteColor The new favorite color of the student.
     */
    public static void UpdateFavoriteColor(ArrayList<Student> students, String name, String newFavoriteColor) {
        for(Student element: students)
        {
            if(element.GetName().equals(name))
            {
                element.SetFavoriteColor(newFavoriteColor);
            }
        }
    }

    /**
     * Create an ArrayList consisting of all students in the given grade level.
     *
     * @param students The list of students to search over.
     * @param gradeLevel The grade level the students should be in.
     * @return An ArrayList containing all the students in gradeLevel.
     */
    public static ArrayList<Student> GetStudentsInGradeLevel(ArrayList<Student> students, int gradeLevel) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        for(Student element: students)
        {
            if(element.GetGradeLevel() == gradeLevel)
            {
                studentList.add(element);
            }
        }
        return studentList;
    }

    /**
     * Transfer money from one student to another.
     *
     * @param students A list of students.
     * @param fromStudentName The name of the student to transfer money from.
     * @param toStudentName The name of the student to transfer money to.
     * @param amount The amount of money to transfer.
     * @return true if the transfer was successful, i.e. the student to transfer money from
     *     had sufficient funds in their account. Otherwise, false.
     */
    public static boolean TransferMoney(ArrayList<Student> students, String fromStudentName, String toStudentName, double amount) {
        Student from = null;
        Student to = null;
        for(Student element: students)
        {
            if(element.GetName().equals(fromStudentName))
            {
                from = element;
            }
            if(element.GetName().equals(toStudentName))
            {
                to = element;
            }
        }
        if(from == null || to == null)
        {
            return false;
        }
        if(from.GetBankAccount().GetBalance() < amount || amount <= 0)
        {
            return false;
        }
        else
        {
            from.GetBankAccount().Withdraw(amount);
            to.GetBankAccount().Deposit(amount);
        }
        return true;
    }

    /**
     * EXTRA CREDIT:
     * Increments everyone's grade level by one. If a student is in 12th grade, remove them from the array.
     *
     * @param students The list of students to advance to the next grade.
     */
    public static void UpdateGradeLevels(ArrayList<Student> students) {

        // write your code above and remove the line below
        throw new UnsupportedOperationException();
    }

    /**
     * EXTRA CREDIT:
     * Sort the array list by increasing grade level (all the 9th graders, then 10th graders, etc)
     * If there is a tie (aka 2 people in the same grade), the person whose name is first in the
     * alphabet should appear first.
     *
     * @param students The list of students to sort.
     */
    public static void SortByGradeAndName(ArrayList<Student> students) {

        // write your code above and remove the line below
        throw new UnsupportedOperationException();
    }
}
