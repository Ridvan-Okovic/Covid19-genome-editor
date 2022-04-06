/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Covid19;

/**
 *
 * @author ASUS
 * @param < C >, default object type. 
 */

public interface Viral < C > {
    /** CoronaVirus mutates when one of its amino-acids change.
     * The basic mutation picks a random amino-acid in the virus, 
     * and changes its letter to another amino-acid letter */
    public void mutate ();
    
    public C[] toArray ();
    
    /** Sees whether this bag is full.
    @return true if the bag is full, or false if not */
    public boolean isFull ();
    
    /** Sees whether this bag is empty.
    @return true if the bag is empty, or false if not */
    public boolean isEmpty ();
    
    /** @expects CoronaVirus c is not null, 
     * and it contains the initialized genomic sequence 
     * @param coronaVirus, genomic sequence to test. 
     * @return true if two viruses have the identical genomic sequence, and otherwise returns false */ 
    public boolean same (C coronaVirus);
    
    /** @expects CoronaVirus c is not null, 
     * and it contains the initialized genomic sequence 
     * @param coronaVirus, genomic sequence to test. 
     * @return true if two viruses have the identical number of each amino-acids, 
     * but not necessarily in the same order, and otherwise false */ 
    public boolean functionallySimilar(C coronaVirus);
    
    /** @expects CoronaVirus c is not null, 
    and it contains the initialized genomic sequence 
    * @param coronaVirus, genomic sequence to test.  
    * @return the minimum number of single-character 
    * inserts/deletes/substitutions required to transform this genome into CoronaVirus c genome 
    * for instance: actg ->atg is 1 away, cgt ->tgt is 1 away, agt ->actg is 1 away consult edit distance algorithms to develop this method */ 
    public int editDistance(C coronaVirus);
    
      
}
