# Typy proste

## Typy całkowite

Typy całkowite służą do przechowywania liczb bez części ułamkowej

| Typ      |   Wielkość    | Zakres |
|:---------|:-------------:|:------:|
| byte     |  1 bajt       | od -128 do 127 |
| short    |  2 bajty      |   od -32768 do -32767|
| int      |  4 bajty      | w przybliżeniu   od -2 * 10<sup>9</sup>  do 2 * 10<sup>9</sup>  |
| long     |  8 bajtów      |  w przybliżeniu od -9 * 10<sup>18</sup>  do 9 * 10<sup>18</sup>  |

## Typy zmiennoprzecinkowe

Typy zmiennoprzecinkowe służą do przechowywania liczb z częścią ułamkowej

| Typ      |   Wielkość    | Zakres | precyzja |
|:---------|:-------------:|:------:|:------:|
| float     |  4 bajty      |  w przybliżeniu   ± 3.4E+38   | 6-7 cyfr znaczących |
| double    |  8 bajtów      |   w przybliżeniu   ± 1.7E+308  | 15 cyfr znaczących |

## Typ char

Typ _char_ reprezentuje "jednostki zapisu" w kodowaniu znaków UTF-16 wykorzystywanym w języku __Java__.  

### Kody specjalne

| Kod      |   Wartość    | 
|:---------|:-------------:|
| '\n'     |  przejście do kolejnej linii      | 
| '\r'     |  powrót do początku wiersza      | 
| '\t'     |  tabulacja      | 
| '\b'     |  usunięcie       | 


## Typ boolean

Typ _boolean_ ma dwie wartości: __false__ i __true__.
W języku __Java__ typ _boolean_ nie ma bezpośredioge związku z liczbami całkowitymi _0_ i _1_.