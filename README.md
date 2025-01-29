
# PROGRAMMING ASSIGNMENT 2

In this course, we will discuss advanced data structures and software engineering topics in light of their application to three main areas: bioinformatics, navigational applications, and computer games. This assignment is designed to help you get started on all three. 


## **Question 1.** Computational Biology


Create a class `DNA` at path `app/src/main/java/DNA.java` with the following static methods:

```java
public class DNA {
    public static String countNucleotides(String dna);
    public static String transcribe(String dna);
    public static String reverseComplement(String dna);
}
```

#### 1.1. Counting DNA Nucleotides

<br/>
<div style="float: right; margin:3%; width: 15%">
    <img src="https://rosalind.info/media/problems/dna/cell.thumb.jpg" alt="drawing" /><br/>
    <span><small><i>Figure 1. A 1900 drawing by Edmund Wilson of onion cells at different stages of mitosis. The sample has been dyed, causing chromatin in the cells (which soaks up the dye) to appear in greater contrast to the rest of the cell.</i></small></span>
</div><br/>

<small>**A Rapid Introduction to Molecular Biology**


Making up all living material, the **cell** is considered to be the building block of life. The **nucleus**, a component of most **eukaryotic** cells, was identified as the hub of cellular activity 150 years ago. Viewed under a light microscope, the nucleus appears only as a darker region of the cell, but as we increase magnification, we find that the nucleus is densely filled with a stew of macromolecules called **chromatin**. During **mitosis** (eukaryotic cell division), most of the chromatin condenses into long, thin strings called **chromosomes**. See Figure 1 for a figure of cells in different stages of mitosis.


One class of the macromolecules contained in chromatin are called **nucleic acids**. Early 20th century research into the chemical identity of nucleic acids culminated with the conclusion that nucleic acids are **polymers**, or repeating chains of smaller, similarly structured molecules known as monomers. Because of their tendency to be long and thin, nucleic acid polymers are commonly called strands.

The nucleic acid monomer is called a nucleotide and is used as a unit of strand length (abbreviated to nt). Each nucleotide is formed of three parts: a sugar molecule, a negatively charged ion called a phosphate, and a compound called a nucleobase ("base" for short). Polymerization is achieved as the sugar of one nucleotide bonds to the phosphate of the next nucleotide in the chain, which forms a sugar-phosphate backbone for the nucleic acid strand. A key point is that the nucleotides of a specific type of nucleic acid always contain the same sugar and phosphate molecules, and they differ only in their choice of base. Thus, one strand of a nucleic acid can be differentiated from another based solely on the order of its bases; this ordering of bases defines a nucleic acid's primary structure.


For example, Figure 2 shows a strand of deoxyribose nucleic acid (DNA), in which the sugar is called deoxyribose, and the only four choices for nucleobases are molecules called adenine (A), cytosine (C), guanine (G), and thymine (T).

For reasons we will soon see, DNA is found in all living organisms on Earth, including bacteria; it is even found in many viruses (which are often considered to be nonliving). Because of its importance, we reserve the term genome to refer to the sum total of the DNA contained in an organism's chromosomes.</small>

<br/>
<div style="float: right; margin:3%; width: 15%">
    <img src="https://rosalind.info/media/problems/dna/DNA_chemical_structure.thumb.png" alt="drawing"/><br/><br/>
    <span><br/><i>Figure 2. A sketch of DNA's primary structure.</i></span>
</div><br/>

**Problem**

A **string** is simply an ordered collection of symbols selected from some **alphabet** and formed into a word; the **length** of a string is the number of symbols that it contains.

An example of a length 21 **DNA string** (whose alphabet contains the symbols `'A'`, `'C'`, `'G'`, and `'T'`) is `"ATGCTTCAGAAAGGTCTTACG."`

Given: A **DNA string** `s` of length at most 1000 nt.

Return: Four integers (separated by spaces) counting the respective number of times that the symbols `'A'`, `'C'`, `'G'`, and `'T'` occur in `s`.

**Sample Dataset**

```
AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC
```

**Sample Output**

```
20 12 17 21
```

### 1.2. Transcribing DNA into RNA

<br/>
<div style="float: right; margin:5%; width: 15%">
    <img src="https://rosalind.info/media/problems/rna/RNA-DNA.thumb.png" alt="drawing" /><br/>
    <span style="float: right;"><small><i>Figure 3. Structural differences between RNA and DNA.</i></small></span>
</div><br/>

<small>**The Second Nucleic Acid**


In "Counting DNA Nucleotides", we described the primary structure of a nucleic acid as a polymer of nucleotide units, and we mentioned that the omnipresent nucleic acid DNA is composed of a varied sequence of four bases.

Yet a second nucleic acid exists alongside DNA in the chromatin; this molecule, which possesses a different sugar called ribose, came to be known as ribose nucleic acid, or RNA. RNA differs further from DNA in that it contains a base called uracil in place of thymine; structural differences between DNA and RNA are shown in Figure 3. 


Biologists initially believed that RNA was only contained in plant cells, whereas DNA was restricted to animal cells. However, this hypothesis dissipated as improved chemical methods discovered both nucleic acids in the cells of all life forms on Earth. 

The primary structure of DNA and RNA is so similar because the former serves as a blueprint for the creation of a special kind of RNA molecule called messenger RNA, or mRNA. mRNA is created during RNA transcription, during which a strand of DNA is used as a template for constructing a strand of RNA by copying nucleotides one at a time, where uracil is used in place of thymine.

In eukaryotes, DNA remains in the nucleus, while RNA can enter the far reaches of the cell to carry out DNA's instructions. In future problems, we will examine the process and ramifications of RNA transcription in more detail.</small>

**Problem**

An RNA string is a string formed from the alphabet containing `'A'`, `'C'`, `'G'`, and `'U'`.

Given a DNA string `t` corresponding to a coding strand, its transcribed RNA string `u` is formed by replacing all occurrences of `'T'` in `t` with `'U'` in `u`.

Given: A DNA string `t` having length at most 1000 nt.

Return: The transcribed RNA string of `t`.

**Sample Dataset**

```
GATGGAACTTGACTACGTAAATT
```

**Sample Output**

```
GAUGGAACUUGACUACGUAAAUU
```

### 1.3. Complementing a Strand of DNA

<br/>
<div style="float: right; margin:1%; width: 15%">
    <img src="https://rosalind.info/media/problems/revc/DNA.thumb.png" alt="drawing"/><br/>
    <span><i>Figure 4. The double helix of DNA on the molecular scale.</i></span>
</div><br/>

<small>**The Secondary and Tertiary Structures of DNA**

In “Counting DNA Nucleotides”, we introduced nucleic acids, and we saw that the primary structure of a nucleic acid is determined by the ordering of its nucleobases along the sugar-phosphate backbone that constitutes the bonds of the nucleic acid polymer. Yet primary structure tells us nothing about the larger, 3-dimensional shape of the molecule, which is vital for a complete understanding of nucleic acids.

<!-- <div style="float: right; margin:5%; width: 15%">
    <img src="https://rosalind.info/media/problems/revc/DNA_chemical_structure.thumb.png" alt="drawing" /><br/>
    <span >Figure 4. Base pairing across the two strands of DNA.</span>
</div> -->


The search for a complete chemical structure of nucleic acids was central to molecular biology research in the mid-20th Century, culminating in 1953 with a publication in Nature of fewer than 800 words by James Watson and Francis Crick. Consolidating a high resolution X-ray image created by Rosalind Franklin and Raymond Gosling with a number of established chemical results, Watson and Crick proposed the following structure for DNA:

1. The DNA molecule is made up of two strands, running in opposite directions.

2. Each base bonds to a base in the opposite strand. Adenine always bonds with thymine, and cytosine always bonds with guanine; the complement of a base is the base to which it always bonds; see Figure 3.

3. The two strands are twisted together into a long spiral staircase structure called a double helix; see Figure 4.


Because they dictate how bases from different strands interact with each other, (1) and (2) above compose the secondary structure of DNA. (3) describes the 3-dimensional shape of the DNA molecule, or its tertiary structure.

In light of Watson and Crick's model, the bonding of two complementary bases is called a base pair (bp). Therefore, the length of a DNA molecule will commonly be given in bp instead of nt. By complementarity, once we know the order of bases on one strand, we can immediately deduce the sequence of bases in the complementary strand. These bases will run in the opposite order to match the fact that the two strands of DNA run in opposite directions.</small>

**Problem**

In DNA strings, symbols `'A'` and `'T'` are complements of each other, as are `'C'` and `'G'`.

The reverse complement of a DNA string `s` is the string `sc` formed by reversing the symbols of `s`, then taking the complement of each symbol (e.g., the reverse complement of `"GTCA"` is `"TGAC"`).

Given: A DNA string `s` of length at most 1000 bp.

Return: The reverse complement `sc` of `s`.

**Sample Dataset**

```
AAAACCCGGT
```

**Sample Output**

```
ACCGGGTTTT
```

---

## **Question 2.** FU-ber

<br/>
<div style="float: right; margin:1%; width: 15%">
    <center><img width="25%" src="https://i.ibb.co/jk9z6qHG/Screenshot-2025-01-29-at-9-03-34-AM.png" alt="drawing"/><br/>
    <span><small><i>Figure 5. Furman's own ride-sharing and food delivery app.</i></small></span></center>
</div><br/>

FUber is a ride-sharing service that is designed to help people get around built an Furman. Additionally, it also provides food delivery services. We will simulate the ride-sharing service by applying relevant non-linear data structures and algorithms.

Answer the following questions in a class `FUber` at path `app/src/main/java/FUber.java`:

```java
public class FUber {

    public static float euclidean(float x1, float y1, float x2, float y2) {
        // Implement the method here
    }

    public static float manhattan(float x1, float y1, float x2, float y2) {
        // Implement the method here
    }
}
```

### 2.1. Eucledian Distance

<br/>
<div style="float: right; margin:1%; width: 13%">
    <img width="30%" src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Manhattan_distance.svg/520px-Manhattan_distance.svg.png" alt="drawing"/><br/>
    <span><small><i>Figure 6. In taxicab geometry, the lengths of the red, blue, green, and yellow paths all equal 12, the taxicab distance between the opposite corners, and all four paths are shortest paths. Instead, in Euclidean geometry, the red, blue, and yellow paths still have length 12 but the green path is the unique shortest path, with length equal to the Euclidean distance between the opposite corners, 6√2 ≈ 8.49.</i></small></span>
</div><br/>

Implement Euclidean distance between two points in 2D space.

Given two points in 2D space, `(x1, y1)` and `(x2, y2)`, the Euclidean distance between these two points is given by the formula:

$$ d = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2} $$


Note that the earth is not flat, but we can still use the Euclidean distance formula since the distances we are calculating are relatively small and the curvature of the earth is negligible at this scale.

### 2.2. Taxicab / Manhattan Distance

Taxicab or Manhattan distance is rooted in the idea that the shortest path between two points is often not a straight line. This is because of the grid-like structure of the city, where you can only move along the streets.

Implement Manhattan distance between two points in 2D space.

Given two points in 2D space, `(x1, y1)` and `(x2, y2)`, the Manhattan distance between these two points is given by the formula:

$$ d = |x_2 - x_1| + |y_2 - y_1| $$

### 2.3. Queue Data Structure

We need a Queue data structure to simulate requests for rides and food delivery in the FU-ber app. 

Implement the queue data structure, implementing the following interface: 

```java
public interface Queue{
    void enqueue(int item);
    int dequeue();
    int peek();
    boolean isEmpty();
    int size();
}
```

Create the class `ArrayQueue` that implements the `Queue` interface at path `app/src/main/java/ArrayQueue.java`. Your implementation should use an array to store the elements of the queue.

## **Question 3.** Games

Create a common interface for games at path `app/src/main/java/Game.java`:

```java

public interface Game {
    
    public void startGame();
    public void printBoard();
    public void takeTurn();
    public boolean isGameOver();
    public void endGame();
    public void playGame();
}
```

Implement the following games `WordGuess.java` and `TicTacToe.java` that implement the `Game` interface.

### 3.1. Word Guess

<br/>
<center><img src="https://i.ibb.co/2VYgw3v/gwg.png" alt="drawing" width="50%"/></center>
<br/>

Implement a Word Guessing game. The game is played as follows:

1. A word is chosen by the computer.
2. The player is given a number of turns to guess the word.
3. The player guesses a letter.
4. If the letter is in the word, the computer reveals the position of the letter in the word.

The player wins if they can guess the word before they run out of turns.

### 3.2. Tic Tac Toe

<br/>
<img width="30%" src="https://www.nickknowlson.com/img/projects/arbitrarily-sized-tic-tac-toe/typical-turn.png" alt="drawing" /><br/><br/>
<br/>

Implement the game of Tic Tac Toe. The game is played as follows:

1. The game is played on a 3x3 grid.
2. The player is given a choice of playing as 'X' or 'O'.
3. The players take turns to place their symbol on the grid.
4. The player wins if they can get three of their symbols in a row, column, or diagonal.

The game ends in a draw if all the cells are filled and no player has won.
