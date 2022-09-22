
public class ShapeMaker {
    /**
     * Returns a string that looks like a square with sides of size "size". If size = 5, the square looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param size length of side
     * @return a string that looks like the shape above when printed
     */
    public static String PrintSquare(int size)
    {
        String square = "";
        for(int l=0; l<size; l++)
        {
            for(int w=0; w<size; w++)
            {
                square += "* ";
            }
            square += "\n";
        }

        return square;
    }

    /**
     * Returns a string that looks like a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param length the width of the rectangle
     * @param height the height of the rectangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRectangle(int length, int height)
    {
        String rectangle = "";
        for(int h = 0; h < height; h++)
        {
            for(int l = 0; l < length; l++)
            {
                rectangle += "* ";
            }
            rectangle += "\n";
        }
        return rectangle;
    }

    /**
     * Returns a string that looks like a right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     *
     *     * *
     *     * * *
     *     * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRightTriangle(int height)
    {
        String triangle = "";
        for(int h = height; h >= 0; h--)
        {
            for(int b = h; b < height; b++)
            {
                triangle += "* ";
            }
            triangle += "\n";
        }
        return triangle;
    }

    /**
     * Returns a string that looks like an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     * * * * *
     *     * * * *
     *     * * *
     *     * *
     *     *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintInvertedRightTriangle(int height)
    {
        String triangle = "";
        for(int h = 0; h < height; h++)
        {
            for(int b = h; b < height; b++)
            {
                triangle += "* ";
            }
            triangle += "\n";
        }
        return triangle;
    }

    /**
     * Returns a string that looks like a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */

    public static String PrintBackwardsRightTriangle(int height)
    {
        String triangle = "";
        for(int h = 0; h < height; h++)
            {
                for(int b = h; b < height-1; b++)
                {
                    triangle+= "  ";
                }
                for(int s = h; s >= 0; s--)
                {
                    triangle+="* ";
                }
                triangle+="\n";
            }
            return triangle;
    }

    /**
     * Returns a string that looks like an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *         *
     *        * *
     *       * * *
     *      * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintEquilateralTriangle(int height)
    {
        String triangle = "";
        for(int h = 0; h < height; h++)
        {
            for(int b = h; b < height-1; b++)
            {
                triangle+= " ";
            }
            for(int s = h; s >= 0; s--)
            {
                triangle+="* ";
            }
            triangle+="\n";
        }
        return triangle;
    }
}
