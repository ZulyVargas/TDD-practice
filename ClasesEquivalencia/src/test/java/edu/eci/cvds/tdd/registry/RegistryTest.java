package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
 
    private Registry registry = new Registry();

    @Test
    public void validateRegistryValidResult() { 

        Person person = new Person("Votante1",100000,20,Gender.MALE,true);
        
        RegisterResult result = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validateRegistryDeadResult() { 

        Person person = new Person("Votante2",100001,25,Gender.FEMALE,false);
        
        RegisterResult result = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateRegistryDuplicatedResult() { 
    	Person person = new Person("Votante3",100002,30,Gender.MALE,true);
        Person person2 = new Person("Votante4",100002,86,Gender.FEMALE,true);
        
        registry.registerVoter(person);
        RegisterResult result2 = registry.registerVoter(person2);
        
        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }

    @Test
    public void validateRegistryUnderageResult() { 
    	Person person = new Person("Votante5",100003,17,Gender.UNIDENTIFIED,true);
        
        RegisterResult result = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void validateRegistryInvalidAgeResult() { 
    	Person person = new Person("Votante5",100004,-170,Gender.FEMALE,true);
    	
        RegisterResult result = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    
} 