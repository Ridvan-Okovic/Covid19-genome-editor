/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Covid19;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 * @param <C>
 */
public class CoronaVirus < C > implements Viral < C > {
    private C[] genome;
    private int numberOfEntries;
    private boolean initialized = false;
    private final static int DEFAULT_SIZE = 30000;
    
    public CoronaVirus() {        
        @SuppressWarnings("uncheked")
        C[] tempBag = (C[]) new Object[DEFAULT_SIZE];
        genome = tempBag;
        initialized = true;
        numberOfEntries = 0;
    }
    
    public void checkInitialization() {
        if(!initialized) {
            throw new SecurityException("Bag is not initialized properly!");
        }
    }
    
    public static String createGenome() {
        Random random = new Random();
        StringBuilder dna = new StringBuilder(DEFAULT_SIZE);

        for (int i = 0; i < DEFAULT_SIZE; i++) {
            dna.append("ACGT".charAt(random.nextInt(4)));
        }
    return dna.toString();
    }    
               
    @Override
    public void mutate () {
        if(!isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            int randomNUmber = 0;
            scanner.nextInt();
            scanner.close();           
        }
    }

    @Override
    public boolean isFull () {
        return(numberOfEntries >= genome.length);
    }

    @Override
    public boolean isEmpty () {
        return(numberOfEntries == 0);
    }

    @Override
    public boolean same (Object coronaVirus) {
        if(coronaVirus == null) {
            return false;
        }
        else if(getClass() != coronaVirus.getClass()) {
            return false;
        }
        else {
            CoronaVirus otherVirus  = (CoronaVirus) coronaVirus;
            return (Arrays.equals(genome, otherVirus.genome));
        }
    } 

    @Override
    public boolean functionallySimilar (Object c) {
        checkInitialization();
        if(!isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public int editDistance (Object c) {
        return 1;
    }    

    @Override
    public C[] toArray() {
        @SuppressWarnings("uncheked")
        C[] coronaVirus = (C[]) new Object[numberOfEntries];
        for(int index = 0; index < numberOfEntries; index++) {
            coronaVirus[index] = genome[index];
        }
        return coronaVirus;
    }
    
}
