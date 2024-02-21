main = do
    putStrLn "Digite a temperatura em Celsius:"
    input <- getLine
    let celsius = read input :: Double
        fahrenheit = celsius * 9/5 + 32
    putStrLn $ "A temperatura em Fahrenheit é: " ++ show fahrenheit