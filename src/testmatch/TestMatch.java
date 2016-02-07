/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package testmatch;

/**
 *
 * @author boltoth
 */
public class TestMatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string = "AMAZON MKTPLACE PMTS 440 Terry Ave N AMZN.";
        //String exp = "^AMAZON.*";
        String exp = ".*amazon.*";
        //String exp = ".*amazon.*|.*AMAZON.*|.*440.*";
        System.out.println("Value=" + string.toLowerCase().matches(exp));
    }
    
}
