; 1. Na  aula  disponível  em: https://replit.com/@frankalcantara/ClojureAula2?v=1  foram destacadas diversas funções (expressões), como funções de primeira ordem, disponíveis em Clojure.  Sua  primeira  tarefa  será  descrever  cada  uma  destas  funções  e  apresentar  dois exemplos  de  uso  de  cada  uma  delas.  Lembre-se  os  exemplos  precisam  ser  utilizados  de forma que o resutado da função possa ser visto no terminal. 



; 2. Utilizando a linguagem Clojure, crie uma função chamada ehPrimo que receba um inteiro e devolva True caso este inteiro seja verdadeiro e False caso contrário. 



; 3. Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  fatoresPrimos  que  receba  um inteiro e devolva uma lista dos seus fatores primos. Decomposição em fatores primos é uma tarefa fundamental da aritmética.
(defn isPrimo [x n]
  (if (= x n) 
    true 
    (if (= (mod x n) 0) false (isPrimo x (+ n 1)))))

(defn nextPrimoDivisor [x n]
  (if (false? (isPrimo n 2)) 
    (nextPrimoDivisor x (+ n 1))
    (if (= (mod x n) 0)
      n
      (nextPrimoDivisor x (+ n 1)))))

(defn fatoresPrimos [x]
  (if (true? (isPrimo x 2)) 
    [x] 
    (concat [(nextPrimoDivisor x 2)] (fatoresPrimos (/ x (nextPrimoDivisor x 2))))))

(println (fatoresPrimos 1000))


; 4. Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  todosPrimos  que  receba  dois valores inteiros e devolve todos os números primos que existam entre estes dois valores. 