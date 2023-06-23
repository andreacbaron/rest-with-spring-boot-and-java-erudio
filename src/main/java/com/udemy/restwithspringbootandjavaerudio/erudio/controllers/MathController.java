package com.udemy.restwithspringbootandjavaerudio.erudio.controllers;

import com.udemy.restwithspringbootandjavaerudio.erudio.converters.NumberConverters;
import com.udemy.restwithspringbootandjavaerudio.erudio.exceptions.UnsupportedMathOperationException;
import com.udemy.restwithspringbootandjavaerudio.erudio.math.SimpleMath;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {
    private final AtomicLong counter = new AtomicLong();
    private SimpleMath math = new SimpleMath();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne, //   @PathVariable e usado para recuperar dados da url
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Plesse set a numeric value!");
        }
        return math.sum(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/subtracton/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtracton(@PathVariable(value = "numberOne") String numberOne, //   @PathVariable e usado para recuperar dados da url
                             @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Plesse set a numeric value!");
        }
        return math.subtracton(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne, //   @PathVariable e usado para recuperar dados da url
                           @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Plesse set a numeric value!");
        }
        return math.division(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));

    }
    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne, //   @PathVariable e usado para recuperar dados da url
                                 @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Plesse set a numeric value!");
        }
        return math.multiplication(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));
    }

    // MÉDIA
    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double mean(@PathVariable(value = "numberOne") String numberOne, //   @PathVariable e usado para recuperar dados da url
                       @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Plesse set a numeric value!");
        }
        return math.mean(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));
    }

    //Raiz quadrada
    @RequestMapping(value = "/squareRoot/{number}",
            method = RequestMethod.GET)
    public Double squareRoot(@PathVariable(value = "number") String number//   @PathVariable e usado para recuperar dados da url
    ) throws Exception {
        if (!NumberConverters.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Plesse set a numeric value!");
        }
        return math.squareRoot(NumberConverters.convertToDouble(number));
    }
}

