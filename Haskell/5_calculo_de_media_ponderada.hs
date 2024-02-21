main = do
    putStrLn "Digite nota 1:"
    inputNota1 <- getLine
    putStrLn "Digite nota 2:"
    inputNota2 <- getLine
    putStrLn "Digite nota 3:"
    inputNota3 <- getLine
    
    putStrLn "Digite peso 1:"
    inputPeso1 <- getLine
    putStrLn "Digite peso 2:"
    inputPeso2 <- getLine
    putStrLn "Digite peso 3:"
    inputPeso3 <- getLine
    
    let nota1 = read inputNota1 :: Double
        nota2 = read inputNota2 :: Double
        nota3 = read inputNota3 :: Double
        peso1 = read inputPeso1 :: Double
        peso2 = read inputPeso2 :: Double
        peso3 = read inputPeso3 :: Double
        
        somaPesos = peso1 + peso2 + peso3
        mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos
        
    putStrLn $ "Média ponderada = " ++ show mediaPonderada