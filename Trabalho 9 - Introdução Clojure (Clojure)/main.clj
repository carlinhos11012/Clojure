; 1. Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  ultimo  que  receba  uma  lista  e devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure. 
(defn Ultimo [lista] (get lista (- (count lista) 1))) 
(println "Ultimo =" (Ultimo [1,2,7])) 

; 2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista e  devolva  o  penúltimo  elemento  desta  lista  usar as  funções  já  prontas  e disponíveis para esta mesma finalidade na linguagem Clojure. 
(defn Penultimo [lista] (get lista (- (count lista) 2))) (println "Penultimo =" (Penultimo [1,2,7])) 

; 3. Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista e um inteiro N e devolva o  elemento que  está na  posição N desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure. 
(defn elementoN [lista n] (if (zero? n) (first lista) (elementoN (rest lista) (dec n)))) (println "Elemento 3 de [1,2,7,4,6,7,8,9] = "(elementoN [1,2,7,4,6,7,8,9] 3)) 

; 4. Utilizando  a  linguagem Clojure,  crie  uma função  chamada  inverso  que  receba uma  lista  e devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] e devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure. 
(defn inverso [lista] (if (= lista []) [] (concat (inverso (rest lista)) [(first lista)]))) (println "Inverso de [1,2,3] = "(inverso [1,2,3])) 

; 5. Utilizando a  linguagem Clojure, crie uma função chamada  mdc que receba  dois inteiros e devolve o mínimo divisor comum entre eles.  Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure. 
(defn isPrimo [x n] 
  (if (= n 1) 
    true 
    (if (= (mod x n) 0) 
      false 
      (isPrimo x (dec n))))) 

(defn nextPrimo [n] 
  (if (isPrimo (+ n 1) (- n 1)) 
    (+ n 1)
    (nextPrimo (+ n 1)))) 

(defn hasDivisorPrimoComum [x y primo] 
  (if (and (= (mod x primo) 0) (= (mod y primo) 0)) 
    primo 
    (if (or (> primo x) (> primo y)) 
      false 
      (hasDivisorPrimoComum x y (nextPrimo primo))))) 

(defn mdc [x y] 
  (let [menorPrimo (hasDivisorPrimoComum x y 2)] 
    (if (int? menorPrimo) 
      (* menorPrimo (mdc (/ x menorPrimo) (/ y menorPrimo))) 
      1))) 

(println "Vamo ve a 5 " (mdc 72 60))