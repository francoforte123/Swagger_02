package Swagger02.Controllers;

import Swagger02.Entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/")
    public String getWelcomeMathMsg(){
        return "welcome insede section";
    }


    @GetMapping("/division-info")
    @ApiOperation(value = "Division information", notes = "Prints the information and properties for the division")
    public ArithmeticOperation getDivision() {
        return new ArithmeticOperation(
                "The division",
                2,
                "Division is the opposite of multiplication. If 3 groups of 4 make 12 in multiplication, " +
                        "12 divided into 3 equal groups give 4 in each group in division.\nThe main goal of dividing " +
                        "is to see how many equal groups are formed or how many are in each group when sharing fairly. ",
                new String[]{
                        "Dividend: The dividend is the number that is being divided in the division process.",
                        "Divisor: The number by which the dividend is being divided by is called the divisor.",
                        "Quotient: The quotient is a result obtained in the division process.",
                        "Remainder: Sometimes, we cannot divide things exactly. There may be a leftover number. " +
                                "That leftover number is called the remainder.",
                        "1. If we divide a whole number (except zero) by itself, the quotient or the answer is always 1.",
                        "2. If we divide a whole number by zero, the answer will be undefined.",
                        "3. Zero divided by any number will give the answer zero.",
                        "4. If we divide a whole number (other than zero) by 1, the answer will be the number itself.",
                        "5. If a whole number is divided by another whole number, the quotient may not " +
                                "necessarily be a whole number.",
                        "6. In the case of exact division (with no remainder), the divisor multiplied by the quotient " +
                                "is the dividend. This property holds true only if all three numbers are non-zero whole numbers.",
                        "7. If there are three non-zero whole numbers a, b and c, and b × c = a, then,\n" +
                                "\n" +
                                "a ÷ b = c and a ÷ c = b"
                });
    }


    @GetMapping("/multiplication")
    @ApiOperation(value = "Multiplication", notes = "Returns the result of the multiplication between 2 numbers")
    public int doMultiplication(@RequestParam int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @GetMapping("/square/{n}")
    @ApiOperation(value = "Square", notes = "Prints the result of the square from a number")
    public int doSquare(@PathVariable int n) {
        return n * n;
    }
}
