/** * JSXM CONFIDENTIAL*
*  __________________
Unpublished Copyright*
* © 2009-2013 Dimitris Dranidis, 
* All Rights Reserved.
*
* NOTICE:  All information contained herein is, and remains the property of Dimitris Dranidis .
*
* The intellectual and technical concepts contained herein are proprietary to the owner
* Dimitris Dranidis and may be covered by U.S and Foreign Patents, patents in process,
* and are protected by trade secret or copyright law. Dissemination of this information or
* reproduction of this material is strictly forbidden unless prior written permission is
* obtained from Dimitris Dranidis. Access to the source code contained herein is hereby
* forbidden to anyone except the owner.Confidentiality and Non-disclosure agreements 
* explicitly covering such access.


*The copyright notice above does not evidence any actual or intended publication 
* or disclosure  of  this source code, which includes information that is confidential 
* and/or proprietary, and is a trade secret, of  Dimitris Dranidis. ANY REPRODUCTION, 
* MODIFICATION, DISTRIBUTION, PUBLIC  PERFORMANCE, OR PUBLIC DISPLAY OF OR THROUGH USE  OF 
* THIS  SOURCE CODE  WITHOUT  THE EXPRESS WRITTEN CONSENT OF COMPANY IS STRICTLY PROHIBITED, 
* AND IN VIOLATION OF APPLICABLE LAWS AND INTERNATIONAL TREATIES.  THE RECEIPT OR POSSESSION OF 
* THIS SOURCE CODE AND/OR RELATED INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS  
* TO REPRODUCE, DISCLOSE OR DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE, USE, OR SELL 
* ANYTHING THAT IT  MAY DESCRIBE, IN WHOLE OR IN PART.
* 
*/
package org.jsxm.jsxmcore.types;

import org.jsxm.jsxmcore.core.*;
import org.jsxm.jsxmcore.exceptions.*;

import java.util.HashMap;
			import java.util.*;

public class PrescriptionSXM extends PrescriptionSXM_base {

//************ INLINE CODE from <memory><declaration> ************
    HashMap<String, Integer> cart;
			boolean internalIsUsed;
//************ END OF INLINE CODE ********************************


    public String memoryString() {
        String memory ="";
//************ INLINE CODE from <memory><display> ********************
        memory += cart.toString() + " " + internalIsUsed;
//************ END OF INLINE CODE ********************************
        return memory;
    }

    // Initial state and initial memory
    public void reset() {
        setCurrentState(getInitialState());
//************ INLINE CODE from <memory><initial> ****************
        cart = new HashMap<String, Integer>();
			internalIsUsed = false;
//************ END OF INLINE CODE ********************************

    }


//************   INLINE CODE from <methods>           ************
    ;
//************ END OF INLINE CODE ********************************


    // Processing Functions

    Function addItem = new Function_addItem_name_quantity() {
    // use name quantity  for access to the arguments

        public boolean preCondition() {
            return
//*** INLINE CODE from <function name="addItem" ... ><precondition> ***
            addItemInput.get_quantity() > 0;
//*** END OF INLINE CODE  ***
        }

        public void effect() {
//*** INLINE CODE from <function name="addItem" ... ><effect> ***
            cart.put(addItemInput.get_name(), addItemInput.get_quantity());
				addItemOutput.result = cart.toString();
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="addItem">***
            String characters = "abcdefghijklmnopqrstuvwxyz";
			StringBuilder randomName = new StringBuilder();
			Random random = new Random();

			for (int i = 0; i < 7; i++) {
            	int randomIndex = random.nextInt(characters.length());
            	randomName.append(characters.charAt(randomIndex));
        	}

			addItemInput.set_name(randomName.toString());
        	addItemInput.set_quantity(random.nextInt(10) + 1);
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(addItem);
    }


    // Processing Functions

    Function close = new Function_close() {

        public boolean preCondition() {
            return true;        }

        public void effect() {
//*** INLINE CODE from <function name="close" ... ><effect> ***
            ;
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="close">***
            ;
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(close);
    }


    // Processing Functions

    Function getContent = new Function_getContent() {

        public boolean preCondition() {
            return true;        }

        public void effect() {
//*** INLINE CODE from <function name="getContent" ... ><effect> ***
            getContentOutput.result = cart.toString();
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="getContent">***
            ;
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(getContent);
    }


    // Processing Functions

    Function isUsed = new Function_isUsed() {

        public boolean preCondition() {
            return true;        }

        public void effect() {
//*** INLINE CODE from <function name="isUsed" ... ><effect> ***
            isUsedOutput.result = internalIsUsed;
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="isUsed">***
            ;
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(isUsed);
    }


    // Processing Functions

    Function use = new Function_use() {

        public boolean preCondition() {
            return true;        }

        public void effect() {
//*** INLINE CODE from <function name="use" ... ><effect> ***
            internalIsUsed = true;
				useOutput.result = internalIsUsed;
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="use">***
            ;
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(use);
    }
}
