# Logical Formula 
- [Question](#Question)
- [Predicates](#Predicates)
- [Breakdown](#Breakdown)
- [Requirement](#Requirement)
- [Structure A](#structure-a)

## Question
Express the formula in terms of a Structure where the ***univers of discourse*** is a ```Collection<Objects>``` and the Interpretation is ambigous.

 $\forall$ x  $\exists$ y P (x,y) $\wedge$ A(x) $\wedge$ S(y) $\implies$ $\forall$ z  P(y,z) $\wedge$ A(x) 

 --- 
### Predicates
- $P(x,y)$
- $A(x)$
- $S(y)$
- $P(y,x)$

### Breakdown
$\forall$ x : Bound the whole formula including the $\exists$ y 

- $
 \forall$ x ( $\exists$ y P (x,y) $\wedge$ A(x) $\wedge$ S(y)) 

$\exists$ y : Bound Formula 

- $\exists$ y (P (x,y) $\wedge$ A(x) $\wedge$ S(y) $\implies$ $\forall$ z  P(y,z) $\wedge$ A(x))

$\forall$ z: Bound After the implies but replaces the x values in the function

- $\forall$ z(P(y,z) $\wedge$ A(x))

## Requirement
- Create a general Class called Funtion\<T>
    - $P(x,y)$ returns Boolean  $( P: U \times U\rightarrow Boolean)$
    - $A(x)$ returns Boolean  $(A: U \rightarrow Boolean)$
    - $S(y)$ returns Boolean  $(S: U \rightarrow Boolean)$

- Implement qualifiers
    - $forAll(x)$: evaluates $\forall x$ over a Collection\<U>
    - $thereExists(y)$: evaluates $\exists y$ over a Collection\<U>
    - $forAll(z)$: evaluates $\forall z$ over a Collection\<U>
- Create a Main Class
    - Define a Collection \(List,Set, ArrayList, ect.)
    - Initalize the Formula with the Collection
    - Execute logical Formula Evaluation in Main
- User
 ## Structure A

**Universe (U):**  
- Collection\<Objects> : Strings

**Interpretation (I):**  
- $P(a,b)$
- $A(a)$
- $S(b)$
- $P(b,a)$
---
