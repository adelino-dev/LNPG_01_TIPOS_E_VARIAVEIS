main = do

putStrLn "Digite o primeiro número:"
input1 <- getLine

putStrLn "Digite o segundo número:"
input2 <- getLine

let num1 = read input1 :: Double
    num2 = read input2 :: Double
    addition = num1 + num2
    subtraction = num1 - num2
    multiplication = num1 * num2
    division = if num1 / num2
    
putStrLn $ show num1 ++ " + " ++ show num2 ++ " = " ++ show addition
putStrLn $ show num1 ++ " - " ++ show num2 ++ " = " ++ show subtraction
putStrLn $ show num1 ++ " * " ++ show num2 ++ " = " ++ show multiplication
putStrLn $ show num1 ++ " / " ++ show num2 ++ " = " ++ show division