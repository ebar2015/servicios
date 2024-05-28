/**
 * 
 */
package com.viscaya.utilities;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * @author joseviscaya
 *
 */
@Component
public class Utilities implements Serializable {

	private static final long serialVersionUID = -6263078987217947030L;
	

	public String FORMATO_FECHA_LARGA 						= "dd/MM/yyyy HH:mm:ss";
	
	public String CLAIMS_ID 								= "id";
	public String CLAIMS_NOMBRES 							= "nombres";
	public String CLAIMS_TIPO 								= "tipo";
	public String CLAIMS_EXPIRATION 						= "expiration";
	public String CLAIMS_TIME_EXP 							= "timeDuration";


}
