# Java Basics
- Any code must be inside a class, java doesnt have standalone functions
- Java is case sensitive
- All source code will end in .java but will compile into byte code as .class
- Any code in the "public static void main(String[] args)" will be executed when we run the program (Hello.java)
- Every statement must end with a ';'
- All code needs to be wrapped in '{}'
# Variables and Data Types
- Variables are containers for our data during program runtime
- Java is strictly types - we define the container type and we can only put data with the proper type in that defined container
- Primitive data types:
    - int - holds a number
    - float/double - holds a floating-point number (decimals)
    - char - holds a single character (uses single quotes)
    - boolean - true or false value
- Non-Primitive data types:
    - String - holds text (bascially an array of chars) and is surrounded by double quotes
        - unlike other languages, String was added to java at a later time so its not part of the intital primitive list
        - Very important to pay attention to the casing of the String type, its capitalized in Java
- Variable names must be unique in the scope of your code flow
- Reusing a variable name (without redeclaring) will overwrite the previous value
- Basic declaration:
    - type variableName = variableValue;
- Important to select proper container fo ryour data, too big and you're wasting resources, too small and you'll have bugs
# Scope
- Scope is basically where the variable is accessible
    - not everything is global
- Typically the scope is the parent block its defined inside (the wrapping '{}')
- Typically our variables will be scoped to functions/methods or classes
# Logic and Flow
- IfJava.java for reference
- if - most basic condition check, if the condition evaluates to true it'll run the inner code
- else if - can only follow an if or else if; runs only if the condition is true and wasn't handled previously in the same if/else if block
- else - can only follow an if or else if; runs if no other condition was met
- OR - use '||' to separate two conditions where at least one must be true
- AND - use '&&' to separate two conditions where both must be true
- To negate a true/false value we can use '!' like '!var'
    - !true = false
    - !false = true
- Equality checking is done with '=='
# Switch and Case
- SwitchFlow.java for reference
- Switch takes in a value which is compared to a constant value defined for numerous cases
    - Only 1 case can match
    - A case uses the 'break' keyword to terminate flow; without 'break' it'll flow into the following case regardless if it was a match
    - The 'default' leyword may be used as a "catch all" similar to how 'else' works in an if/else if/else block
    -Structure/order matters when defining our logic
