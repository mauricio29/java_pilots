package org.testing;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.NDC;

public class Principal {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Principal.class);

        MDC.put("username", "admin");

        MDC.put("sessionID", "1234");
NDC.push("pushed");        
        try {
            logger.fatal(null);
            throw new Exception("una prueba");
        } catch ( Exception e) {
            
            logger.error("Error !");
        }

    }

}
